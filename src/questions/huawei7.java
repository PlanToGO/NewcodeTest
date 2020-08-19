package questions;

import java.util.Scanner;

public class huawei7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        StringBuilder sb = new StringBuilder(num);
        System.out.println(sb.reverse().toString());
    }
}
