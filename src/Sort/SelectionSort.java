package Sort;

/**
 * 选择排序，也是两次遍历，外循环用来控制循环到哪个数字，内循环用来控制找到最小的数字
 * 时间复杂度上，最好On2，最差On2，平均On2
 */

public class SelectionSort {
    public static int[] selectionsort(int[] array){
        if (array.length == 0 ) return array;
        for (int i = 0 ; i<array.length ; i++){
            //创建一个最小值的指针
            int minIndex = i;
            //遍历没有排序的部分，找到最小的数字，并将最小的数字的索引保存
            for (int j = i ; j<array.length ; j++){
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            //交换最小的数字和当前数字
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
