package Sort;

/**
 * 堆排序利用了二叉树的性质，实际就是用的二叉树中的大顶堆的性质进行排序
 * 时间复杂度上，最好Onlogn，最差Onlogn，平均Onlogn
 */
public class HeapSort {
    //定义一个全局变量，就是长度
    static int len;

    public static int[] heapsort(int[] array){
        len = array.length;
        if (len<1) return array;
        //通过数组先建立一个大顶堆
        buildMaxHeap(array);
        //循环将堆首（也就是最大值）和末位进行交换
        while (len>0){
            swap(array,0,len-1);
            len--;
            adjustHeap(array,0);
        }
        return array;
    }

    public static void buildMaxHeap(int[] array){
        for (int i=len/2-1;i>=0;i--){
            adjustHeap(array,i);
        }
    }

    public static void adjustHeap(int[] array,int i){
        int maxIndex = i;
        //如果有左子树的话，并且左子树大于父节点，那么将最大的指针指向左子树
        if (i*2<len&&array[i*2]>array[maxIndex])
            maxIndex=i*2;
        //如果有右子树的话，并且右子树大于父节点，那么将最大的指针指向右子树
        if (i*2+1<len&&array[i*2+1]>array[maxIndex])
            maxIndex=i*2+1;
        //如果最大的数不是父节点的话，交换节点，然后继续向上判断
        if (maxIndex!=i){
            swap(array,maxIndex,i);
            adjustHeap(array,maxIndex);
        }
    }

    public static void swap(int[] array,int i,int j){
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
}
