package leetcode;

public class fibonacci {
    public static int fib(int N){
        if (N<=1){
            return N;
        }else {
            return fib(N-1)+fib(N-2);
        }
    }

    public static void main(String[] args) {
        int sum;
        System.out.println(fib(8));
    }
    }
