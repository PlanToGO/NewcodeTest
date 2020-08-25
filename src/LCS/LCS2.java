package LCS;

/**
 * 最长公共子串，这个和子序列其实差不多的，但是子串的意思就是要连续的
 */
public class LCS2 {
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
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] lcs = new int[len1+1][len2+1];
        int result = 0;
        for (int i = 0 ;i<=len1;i++){
            lcs[i][0]=0;
        }
        for (int j = 0 ;j<=len2;j++){
            lcs[0][j]=0;
        }
        for (int i = 1 ;i<=len1;i++){
            for (int j = 1;j<=len2;j++){
                if (a[i-1]==b[j-1]){
                    lcs[i][j]=lcs[i-1][j-1]+1;
                    result = Math.max(result,lcs[i][j]);
                }
            }
        }
        print_lcs(lcs,a,b,result);
        return result;
    }

    public static void print_lcs(int[][] lcs,char[] a ,char[] b,int result){
        int a_length = a.length;
        int b_length = b.length;
        //直接找到index的位置即可
        int index = 0;
        int[] comStr = new int[result];
        for (int i=0;i<a_length;i++){
            for (int j=0;j<b_length;j++){
                if (lcs[i][j]==result) index=i;
            }
        }
        System.out.print("最长公共子串是： ");
        System.out.println(String.copyValueOf(a).substring(index-result,index));
    }
}
