package practise;

import java.util.Scanner;

public class jd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int n=sc.nextInt();
            System.out.printf("%.2f",sqr(num,n));
        }
    }

    private static double sqr(double num, int n) {
        if (n==0) return num;
        double sum = 0;
        for (int i=0;i<n;i++){
            sum += num;
            num=Math.sqrt(num);
        }
        return sum;
    }
}
