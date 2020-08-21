package leetcode;

public class maximalsquare {
    public int maximalSquare(char[][] matrix){
        if (matrix.length==0||matrix[0].length==0) return 0;
        int[][] arr = new int[matrix.length][matrix[0].length];
        int max=0;
        int a=arr.length,b=arr[0].length;
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                if (matrix[i][j]=='1'){
                    if (i==0||j==0){
                        arr[i][j]=1;
                    }else {
                        arr[i][j]=Math.min(Math.min(arr[i-1][j],arr[i][j-1]),arr[i-1][j-1])+1;
                    }
                    max = Math.max(max,arr[i][j]);
                }
            }
        }
        return (int)Math.pow(max,2);
    }
}
