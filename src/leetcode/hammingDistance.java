package leetcode;

public class hammingDistance {
    public int hammingdistance(int x,int y){
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        int len_a = a.length();
        int len_b = b.length();
        String maxstring = len_a>len_b?a:b;
        String minstring = maxstring.equals(a)?b:a;
        int maxlen = len_a>len_b?len_a:len_b;
        int res = 0;
        for (int i=0;i<maxlen;i++){
            if (i<Math.abs(len_a-len_b)){
                if (maxstring.charAt(i)=='1')
                res++;
            }else {
                if (maxstring.charAt(i)!=minstring.charAt(i-Math.abs(len_a-len_b))){
                    res++;
                }
            }
        }
        return res;
    }

    public int hammingdistance1(int x, int y){
        return Integer.bitCount(x^y);
    }
}
