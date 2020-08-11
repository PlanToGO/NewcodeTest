package Sort;

/**
 * 希尔排序，最早的突破On2的算法之一，希尔排序的原理其实是设置一个gap，这个gap每次都除以2，然后对
 * gap的大小数组进行分别排序，最后完成排序
 * 时间复杂度最佳Onlog2n，最差Onlog2n，平均Onlog2n
 */

public class ShellSort {
    public static int[] shellsort(int[] array){
        if (array.length==0) return array;
        int tmp;
        int len = array.length;
        int gap = len/2;
        while (gap>0){
            for (int i=gap;i< array.length;i++){
                tmp=array[i];
                int preIndex = i-gap;
                while (preIndex>=0&&array[preIndex]>tmp){
                    array[preIndex+gap]= array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex+gap]=tmp;
            }
            gap /= 2;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,6,8,4,234,678,4523,787,2,6,234,65,8,233};
        int[] ans = shellsort(array);
        for (int num:ans){
            System.out.println(num);
        }
    }
}
