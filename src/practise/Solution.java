package practise;

import java.util.Arrays;

public class Solution {
    public static int[] quicksort(int[] array,int start,int end){
        if (array.length<1||start<0||end>array.length||start>end) return array;
        int min_Index=partition(array,start,end);
        if (min_Index>start){
            quicksort(array,start,min_Index-1);
        }
        if (min_Index<end){
            quicksort(array,min_Index+1,end);
        }
        return array;
    }

    private static int partition(int[] array, int start, int end) {
        int min_Index=start-1;
        int pivot=(int)(start+Math.random()*(end-start+1));
        swap(array,pivot,end);
        for (int i=start;i<=end;i++){
            if (array[i]<=array[end]){
                min_Index++;
                if (i>min_Index){
                    swap(array,i,min_Index);
                }
            }
        }
        return min_Index;
    }


    private static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {5,3,6,568,345,1234321,21,1,3,8,43,2};
        System.out.println(Arrays.toString(quicksort(a,0,a.length-1)));
    }
}
