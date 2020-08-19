package questions;

/**
 * 题目：转换为质数因子
 * 输入一个数字，输出的是所有的质数因子
 */

import java.util.Scanner;

public class huawei2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        sc.close();
        System.out.println(getResult(a));
    }

    public static String getResult(long num){
        StringBuilder sb = new StringBuilder();
        for (int i=2;i<=Math.sqrt(num);i++){
            while (true){
                if (num%i==0){
                    sb.append(i+" ");
                    num /= i;
                }else {
                    break;
                }
            }
        }if (num!=1){
            sb.append(num+" ");
        }
        return sb.toString();
    }
}
