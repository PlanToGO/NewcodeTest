package Sort;

public class ShellSort {
    public static int[] shellsort(int[] array){
        //len为现在的长度
        int len = array.length;
        int temp;
        //定义gap
        int gap = len/2;
        while (gap > 1){
            for (int i = 0 ; i<len ; i++){
                //先把当前遍历的元素的值赋给temp
                temp = array[i];
                int preIndex = i-gap;
                //当前一个元素大于当前元素的时候
                while (preIndex>=0 && array[preIndex] > temp){
                    //把前一个元素的值赋给这个元素
                    array[preIndex + gap]=array[preIndex];
                    //再查找下一个preIndex
                    preIndex -= gap;
                }
                //当前一个元素小于或等于当前元素的时候，还回来这个值
                array[preIndex + gap]=temp;
            }
            gap /= 2;
        }
        return array;
    }
}
