package Stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class keyboard1_2 {
    //如果是用scanner，可以这样写
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] arr_len = sc.nextLine().split(",");
        int[] arr_lennum = Arrays.stream(arr_len).mapToInt(Integer::parseInt).toArray();
        int[][] array = new int[arr_lennum[0]][arr_lennum[1]];
        int[] tmp = new int[arr_lennum[1]];
        for (int i=0;i< array.length;i++){
            String[] arr_tmp = sc.nextLine().split(",");
            tmp = Arrays.stream(arr_tmp).mapToInt(Integer::parseInt).toArray();
            array[i] = tmp;
        }
    }
}
