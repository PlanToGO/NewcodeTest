package Sort;

import java.util.Arrays;

/**
 * 归并排序，采用的思想是分治法，其实就是把数组分成两部分进行排序
 * 再用递归的方法让排序一个一个执行。需要知道的是，归并必须是已经排好序的两个数组
 * 也就是说，递归的最底层应该是两个数在进行比较的。
 * 时间复杂度，最佳情况On，最差情况Onlog2n，平均情况Onlog2n
 */

public class MergeSort {
    public static int[] mergesort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        //分治整个数组到一个一个去比较
        if (array.length < 2) return arr;
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        return merge(mergesort(left),mergesort(right));
    }

    public static int[] merge(int[] left , int[] right){
        int[] result = new int[left.length + right.length];
        //遍历数组，有两个指针，i和j分别为分治的左右两个分支的指针，从而判断判断到哪个
        //位置，index表示当前排序的位置
        for (int index = 0, i = 0,j = 0;index < result.length; index++){
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }
}
