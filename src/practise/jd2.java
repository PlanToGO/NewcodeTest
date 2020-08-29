package practise;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class jd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //首先确定是几个数组成的排列
        int x = 1;
        while (Math.pow(3, x) < n) {
            x++;
        }
        int sum=0;
        for (int i=0;i<x;i++){
            sum += Math.pow(3,i+1);
        }
        int index = n-sum;
        StringBuilder sb = new StringBuilder();
        int sumnum = (int)Math.pow(3,x);
        for (int i=0;i<x;i++){
            if (sumnum/3>index){
                sb.append("2");
                
            }
        }
    }
}
