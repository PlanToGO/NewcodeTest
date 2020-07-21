package leetcode;

public class addbinary {
    public static String addBinary(String a,String b){
        return Integer.toBinaryString(
                Integer.parseInt(a,2)+Integer.parseInt(b,2)
        );
    }
}
