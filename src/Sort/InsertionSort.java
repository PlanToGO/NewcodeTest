package Sort;

/**
 * 插入排序，原理是前边已经排序了，对后边的数字进行排序
 * 时间复杂度上，最好的情况On，最坏的情况On2，平均情况On2
 */

public class InsertionSort {
    public static int[] insertionsort(int[] array){
        if (array.length == 0) return array;
        //创建一个现在到哪的数字
        int current;
        for (int i = 0 ; i<array.length-1 ; i++){
            current = array[i+1];
            //创建一个现在索引指向现在排好序的最后一个数字
            int preIndex = i;
            //当最后一个数字大于现在要排序的数字的时候
            while (preIndex >= 0 && current < array[preIndex]){
                //把数大的往后放
                array[preIndex+1] = array[preIndex];
                //把现在的索引往前移
                preIndex--;
            }
            //把现在的值赋再还给要排序的数字
            array[preIndex + 1] = current;
        }
        return array;
    }
}
