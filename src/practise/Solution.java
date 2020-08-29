package practise;


import java.util.*;


public class Solution {
    public static void main(String[] args) {
        String str = "aabbb";
        StringBuilder sb = new StringBuilder(str);
        int index =0;
        while (index<sb.length()){
            if (sb.charAt(index)=='b'){
                sb.deleteCharAt(index);
                break;
            }else {
                index++;
            }
        }
        System.out.println(sb.toString());
        Map<String ,String> map = new HashMap<>();
    }
}
