package Sort;

public class BubbleSort {
    public static int[] bubblesort(int[] array){
        //如果是列表的长度为0，则直接返回数组
        if (array.length == 0) return array;
        //内外循环，外循环负责遍历使用，内循环负责比较大小
        for (int i = 0 ; i<array.length;i++)
            //j应该是数组长度减去已经排好序的数量i再减去1，即遍历要排序
            //位置之前的数字，然后如果后小于前，则位置互换
            for (int j = 0 ; j<array.length-i-1;j++)
                if (array[j+1]<array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,8,3,1,9,12,5,3,2,4};
        bubblesort(arr);
        for (int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
