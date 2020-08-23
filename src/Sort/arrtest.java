package Sort;

public class arrtest {
    public static void main(String[] args) {
        int[] arr = {5,34,3,5,7,9,10,65,4,2,45,46,25};
        long start = System.currentTimeMillis();
//        BubbleSort.bubblesort(arr);
        SelectionSort.selectionsort(arr);
//        ShellSort.shellsort(arr);
//        InsertionSort.insertionsort(arr);
//        MergeSort.mergesort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        for (int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
