package leetcode;

/**
 * 题目：网格最短路径 题号：64
 */
public class minpathsum {
    public static int minPathSum(int[][] grid){
        int row = grid.length;
        int column = grid[0].length;
        int[][] result = new int[row][column];
        result[0][0] = grid[0][0];
        for (int i=1;i<row;i++){
            result[i][0]= grid[i][0]+result[i-1][0];
        }
        for (int j=1;j<column;j++){
            result[0][j]= grid[0][j]+result[0][j-1];
        }
        for (int i=1;i<row;i++){
            for (int j=1;j<column;j++){
                result[i][j]=grid[i][j]+Math.min(result[i-1][j],result[i][j-1]);
            }
        }
        return result[row-1][column-1];
    }
}
