package LCS;

/**
 * 最长公共子序列，不需要字符连续，可以跳着来
 * 用动态规划的方法进行查找
 */
public class LCS {
    public static void main(String[] args) {
        String s1 = "adfdsgdsgadsg";
        String s2= "sddsgdsgafsdf";
        System.out.println(lcs(s1,s2));
    }

    /**
     * 最长字串的长度问题，同时建立了lcs的表格
     * @param str1
     * @param str2
     * @return
     */
    public static int lcs(String str1,String str2){
        //先把字符串转换为数组，方便操作
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int len1 = str1.length();
        int len2 = str2.length();
        //建立一个比字符串要长一个单位的二位数粗，用来存放LCS矩阵
        int[][] lcs = new int[len1+1][len2+1];
        //把二维数组的第一列和第一行先置为0，初始化
        for (int i = 0 ;i<=len1;i++){
            lcs[i][0]=0;
        }
        for (int j = 0 ;j<=len2;j++){
            lcs[0][j]=0;
        }
        //遍历数组，从角标的1开始遍历，如果左上角的数字相等的话，则把当前的数字加一
        for (int i = 1 ;i<=len1;i++){
            for (int j = 1;j<=len2;j++){
                if (a[i-1]==b[j-1]){
                    lcs[i][j]=lcs[i-1][j-1]+1;
                    //如果说不想等的话，求左边和上边的最大值，即保存最大值
                }else {
                    lcs[i][j]=Math.max(lcs[i][j-1],lcs[i-1][j]);
                }
            }
        }
        print_lcs(lcs,a,b);
        //最右下角的最后一个即为最大子序列的长度
        return lcs[len1][len2];
    }

    public static void print_lcs(int[][] lcs,char[] a ,char[] b){
        int a_length = a.length;
        int b_length = b.length;

        int maxlen = lcs[a_length][b_length];
        char[] comStr = new char[maxlen];
        int i = a_length, j = b_length;
        while(maxlen > 0) {
            //起码有一个字母在公共子串里
            //如果左上角和现在的数字不相等的话，说明可能是需要输出的字符
            if(lcs[i][j] != lcs[i-1][j-1]) {
                //如果左边和上边都相等的话，那真的是需要输出的字符，那就把当前的字符放在输出的串中
                if(lcs[i-1][j] == lcs[i][j-1]) {
                    comStr[maxlen-1] = a[i-1];
                    i--;j--;
                    maxlen--;
                }
                //如果上边大于左边，那么i--继续找
                else if(lcs[i-1][j] > lcs[i][j-1]) {
                    i--;
                }
                //如果上边小于左边，那么j--继续找
                else {
                    j--;
                }
            }
            //如果左边和上边都不想等，那么直接i-- j--找下一行
            else {
                i--;
                j--;
            }
        }
        System.out.print("最长公共子串是： ");
        System.out.println(comStr);
    }
}
