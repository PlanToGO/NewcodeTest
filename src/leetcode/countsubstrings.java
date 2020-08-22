package leetcode;

public class countsubstrings {
    public int countSubstrings(String s){
        int len = s.length();
        int max = 0;
        for (int i=0;i<=len-1;i++){
            for (int j=i+1;j<=len;j++){
                String tmp = s.substring(i,j);
                if (isPalindorme(tmp)){
                    max++;
                }
            }
        }
        return max;
    }

    private boolean isPalindorme(String tmp) {
        StringBuilder sb = new StringBuilder(tmp);
        String tmpr = sb.reverse().toString();
        if (tmpr.equals(tmp)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a = new String("abc");
        String b = a.substring(2,3);
        System.out.println(b);
    }
}
