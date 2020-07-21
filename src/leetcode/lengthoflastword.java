package leetcode;

public class lengthoflastword {
    public static int lengthOfLastWord(String s){
        //判断如果数组是空的，那就返回一个0
        if (s.length()==0) return 0;
        String s1 = s.trim();
        int a = 0;
        for (int i = 0;i<s1.length();i++){
            if (s1.charAt(i) != ' '){
                a=a+1;
            } else
                a = 0;
        }
        return a;
    }

    public static int lengthOfLastWordMaster(String s){
        int end = s.length()-1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        if (end<0) return 0;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end-start;
    }
}