package LCS;

public class LCS2Demo {
    public static int LCSmatrix(String str1,String str2){
        int[][] matrix = new int[str1.length()+1][str2.length()+1];
        //初始化
        for (int i=0;i< matrix.length;i++){
            matrix[i][0]=0;
        }
        for (int j=0;j<matrix[0].length;j++){
            matrix[0][j]=0;
        }
        //开始填值
        int result=0;
        for (int i=1;i< matrix.length;i++){
            for (int j=1;j< matrix[0].length;j++){
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    matrix[i][j]=matrix[i-1][j-1]+1;
                    result=Math.max(result,matrix[i][j]);
                }
            }
        }
        int index=0;
        for (int i=0;i<str1.length();i++){
            for (int j=0;j<str2.length();j++){
                if (matrix[i][j]==result) index=i;
            }
        }
        System.out.println(str1.substring(index-result,index));
        return result;
    }

    public static void main(String[] args) {
        String s1 = "adfdsgdsgadsg";
        String s2= "sddsgdsgafsdf";
        System.out.println(LCSmatrix(s1,s2));
    }
}
