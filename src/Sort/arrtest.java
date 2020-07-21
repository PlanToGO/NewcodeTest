package Sort;

public class arrtest {
    public static void main(String[] args) {
        int[] arr = {4,6,8,3,1,9,12,5,3,2,4};
        long start = System.currentTimeMillis();
//        BubbleSort.bubblesort(arr);
//        SelectionSort.selectionsort(arr);
//        ShellSort.shellsort(arr);
//        InsertionSort.insertionsort(arr);
        MergeSort.mergesort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        for (int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
