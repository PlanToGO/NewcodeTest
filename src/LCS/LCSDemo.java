package LCS;

public class LCSDemo {
    public static int[][] LCS(String str1,String str2){
        if (str1.length()<1||str2.length()<1) return null;
        int len1=str1.length();
        int len2=str2.length();
        int[][] matrix = new int[len1+1][len2+1];
        //初始化矩阵
        for (int i=0;i< matrix.length;i++){
            matrix[i][0]=0;
        }
        for (int j=0;j< matrix[0].length;j++){
            matrix[0][j]=0;
        }
        for (int i=1;i< matrix.length;i++){
            for (int j=1;j< matrix[0].length;j++){
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    matrix[i][j]= matrix[i-1][j-1]+1;
                }else {
                    matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);
                }
            }
        }
        return matrix;
    }
    public static int minlen(int[][] matrix){
        return matrix[matrix.length-1][matrix[0].length-1];
    }
    public static void printlen(int[][] matrix,String str1,String str2){
        int index1=str1.length();
        int index2=str2.length();
        int index=minlen(matrix);
        StringBuilder sb = new StringBuilder();
        while (index>0){
            if (matrix[index1][index2]!=matrix[index1-1][index2-1]){
                if (matrix[index1-1][index2]== matrix[index1][index2-1]){
                    sb.append(str1.charAt(index1-1));
                    index--;index1--;index2--;
                }else if (matrix[index1-1][index2]> matrix[index1][index2-1]){
                    index1--;
                }else {
                    index2--;
                }
            }else {
                index1--;
                index2--;
            }
        }
        System.out.println(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String a = "adfdsgdsgadsg";
        String b = "sddsgdsgafsdf";
        int[][] matrix = LCS(a,b);
        System.out.println(minlen(matrix));
        printlen(matrix,a,b);
    }
}
