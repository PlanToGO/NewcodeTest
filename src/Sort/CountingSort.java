package Sort;

/**
 * 计数排序，这种排序是一种比较特殊的排序，比如说分数，大家都集中在90-99分，对这些数字
 * 进行排序的时候，用计数排序非常的快速。但是这种方法必须要求要大量的内存空间
 * 时间复杂度，最佳最差平均都是On+k
 */

import java.util.Arrays;

public class CountingSort {
    public static int[] countingsort(int[] array){
        if (array.length==0) return array;
        int bias, min=array[0],max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min)
                min = array[i];
            if (array[i]>max)
                max = array[i];
        }
        bias = 0-min;
        int[] bucket = new int[max-min+1];
        Arrays.fill(bucket,0);
        for (int i=0;i< array.length;i++){
            bucket[array[i]+bias]++;
        }
        int index = 0,i=1;
        while (index< array.length){
            if (bucket[i]!=0){
                array[index]=i-bias;
                bucket[i]--;
                index++;
            }else
                i++;
        }
        return array;
    }
}
