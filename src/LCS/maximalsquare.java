package LCS;

import java.util.Stack;

/**
 * 动态规划求最大正方形、矩形
 */
public class maximalsquare {
    public int maximalSquare(char[][] maxtrix){
        if (maxtrix.length==0||maxtrix[0].length==0) return 0;
        int a=maxtrix.length; int b=maxtrix[0].length;
        int max=0;
        int[][] dp = new int[a][b];
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                if (maxtrix[i][j]=='1'){
                    if (i==0||j==0){
                        dp[i][j]=1;
                    }else {
                        dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    }
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        return (int)Math.pow(max,2);
    }

    //求最大的矩形
    public int maximalRectangle(boolean[][] matrix) {
        if (matrix == null || matrix[0].length == 0) {
            return 0;
        }
        //转换之后的数组
        int dp[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0) {
                    //i = 0的情况
                    dp[i][j] = matrix[i][j] ? 1 : 0;
                } else {
                    //不等于0
                    dp[i][j] = matrix[i][j] ? dp[i - 1][j] + 1 : 0;
                }
            }
        }
        int max = 0;
        //遍历每一行
        for (int i = 0; i < matrix.length; i++) {
            //取得每一行的最大值
            int temp = findRowMax(dp[i]);
            //更新最大值
            max = Math.max(max, temp);
        }
        return max;
    }

    private int findRowMax(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(heights[0]);
        int i = 1;
        int max = heights[0];
        while (i < heights.length || (i == heights.length && !stack.isEmpty())) {
            if (i < heights.length && (stack.isEmpty() || heights[i] >= heights[stack.peek()])) {
                stack.push(i);
                i++;
            } else {
                int height = heights[stack.pop()];
                int currMax = !stack.isEmpty() ? (i - stack.peek() - 1) * height : height * i;
                max = Math.max(currMax, max);
            }
        }
        return max;
    }
}
