package Sort;

import java.util.Arrays;

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
        //便利数组，有两个指针，i和j分别为分治的左右两个分支的指针，从而判断判断到哪个
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
