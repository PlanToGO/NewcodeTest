package MeiTuan;

import java.util.Arrays;
import java.util.Scanner;

public class langchao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int len = sc.nextInt();
            int[] arr = new int[len + 2];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            arr[len] = 101;
            arr[len+1] = 102;
            Arrays.sort(arr);
            int[] res = new int[2];
            int preOdd = -1;
            int preEven = 0;
            for (int num : arr) {
                if (num % 2 == 1) {
                    int tmp = (num - preOdd) / 2 - 1;
                    if (tmp > res[1]) {
                        res[1] = tmp;
                        res[0] = preOdd + 2;
                    }
                    preOdd = num;
                } else {
                    int tmp = (num - preEven) / 2 - 1;
                    if (tmp > res[1]) {
                        res[1] = tmp;
                        res[0] = preEven + 2;
                    }
                    preEven = num;
                }
            }
            System.out.println(res[0] + " " + res[1]);
        }
}

