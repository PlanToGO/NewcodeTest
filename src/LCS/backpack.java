package LCS;

import java.util.Scanner;

public class backpack {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int v = scan.nextInt();
         int[] dp = new int[v+1];
         int[] price = new int[n+1];
         int[] weight = new int[n+1];
         long max = 0;
         for(int i=1;i<n+1;i++){
             weight[i] = scan.nextInt();
             price[i] = scan.nextInt();
         }
         for(int i = 1;i<n+1;i++){
             for(int j= v;j>0;j--){
                 if(j-weight[i] >= 0){
                     dp[j] = Math.max(dp[j],dp[j-weight[i]]+price[i]);
                 }else {
                     dp[j] = dp[i];
                 }
             }

         }
         for(int i=0;i<v+1;i++){
             max = max > dp[i]?max:dp[i];
         }
         System.out.println(max);
     }
}
