package leetcode;

/**
 * 题目：斐波那契数列 题号：509
 * 思路：递归就完事了
 */

public class fibonacci {
    //递归的方法，坏处是需要大量的运算，时间复杂度比较高
    public static int fib(int N){
        if (N<=1){
            return N;
        }else {
            return fib(N-1)+fib(N-2);
        }
    }
    //记忆递归的方法，需要额外的空间，但是避免了大量的重复运算
    public static int fib1(int n){
        if (n<=1) return n;
        int[] sum = new int[n+1];
        sum[0]=0;
        sum[1]=1;
        for(int i=2;i< sum.length;i++){
            sum[i]=sum[i-1]+sum[i-2];
        }
        return sum[n];
    }


    public static void main(String[] args) {
        System.out.println(fib(45));
        System.out.println(fib1(45));
    }
    }
