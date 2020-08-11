package Sort;

public class QuickSort {
    /**
     * 先写一个交换数组中元素的方法
     * @param array 要交换的数组
     * @param i 要交换的元素
     * @param j 要交换的元素
     */
    public static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * 对基准两侧的数字进行大小比较，小的都放在左侧，大的都放在右侧，并且返回一个基准的最小的数的位置
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array,int start,int end){
        //先制定一个基准，这个基准是随机的
        int pivot = (int)(start+Math.random()*(end-start+1));
        //小数的指针
        int smallIndex = start-1;
        //先把基准和结尾的数进行交换
        swap(array,pivot,end);
        //smallIndex就是最小的数的指针位置
        for (int i=start;i<=end;i++){
            if (array[i]<=array[end]){
                smallIndex++;
                if (i>smallIndex)
                    swap(array,i,smallIndex);
            }
        }
        return smallIndex;
    }

    /**
     * 主函数，排序的函数，通过递归实现一直到底的quicksort
     * 时间复杂度，最佳Onlogn，最差On2，平均Onlogn
     * @param array
     * @param start
     * @param end
     * @return
     */
    public int[] quicksort(int[] array,int start,int end){
        if (array.length<1||start<0||end>array.length||start>end) return null;
        int smallIndex = partition(array,start,end);
        if (smallIndex>start){
            quicksort(array,start,smallIndex-1);
        }
        if (smallIndex<end){
            quicksort(array,smallIndex+1,end);
        }
        return array;
    }
}
