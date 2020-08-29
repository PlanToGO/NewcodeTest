package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class jd1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(bf.readLine());
        int size = height*2+1;
        int[][] resouce = new int[height][size];
        for (int i=0;i<height;i++){
            String[] tmps = bf.readLine().trim().split(" ");
            int[] tmp = Arrays.stream(tmps).mapToInt(Integer::parseInt).toArray();
            for (int j=size/2-i,index=0;j<=size/2+i;j++,index++){
                resouce[i][j]=tmp[index];
            }
        }
        int[][] dp = new int[height][size];
        dp[0][size/2]=resouce[0][size/2];
        for (int i=1;i<height;i++){
            for (int j=0;j<resouce[0].length;j++){
                if (i!=height-1){
                    if (resouce[i][j]!=0){
                        dp[i][j]=resouce[i][j]+Math.max(Math.max(dp[i-1][j-1],dp[i-1][j]),dp[i-1][j+1]);
                    }
                }else {
                    if (j==0){
                        dp[i][j]=resouce[i][j]+dp[i-1][j+1];
                    }else if (j==resouce[0].length-1) {
                        dp[i][j]=resouce[i][j]+dp[i-1][j-1];
                    } else {
                            if (resouce[i][j]!=0){
                                dp[i][j]=resouce[i][j]+Math.max(Math.max(dp[i-1][j-1],dp[i-1][j]),dp[i-1][j+1]);
                            }
                        }
                    }
                }
            }
        int max = 0;
        for (int i=0;i<size;i++){
            max = max>dp[height-1][i]?max:dp[height-1][i];
        }
        System.out.println(max);
    }
}
