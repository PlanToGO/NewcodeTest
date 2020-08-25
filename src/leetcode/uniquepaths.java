package leetcode;

/**
 * 题目：不同路径 题号：62
 * 思路：建立一个数组，数组中每个数字表示到达这个点的时候的可能的路线个数
 * 最右下角的那个数字就是不同路径的个数
 */
public class uniquepaths {
    public static int uniquePaths(int m,int n){
        int[][] dp = new int[m][n];
        for (int i=0;i<m;i++) dp[i][0]=1;
        for (int j=0;j<n;j++) dp[0][j]=1;
        for (int a=1;a<m;a++){
            for (int b=1;b<n;b++){
                dp[a][b]=dp[a-1][b]+dp[a][b-1];
            }
        }
        return dp[m-1][n-1];
    }
}
