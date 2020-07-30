package leetcode;

/**
 * 题目：验证回文串 题号：125
 * 思路：通过reverse的方法进行判断字符串是否为回文串
 */

public class ispalindrome {
    public boolean isPalindrome(String s){
        if (s==null)return true;
        StringBuffer s1 = new StringBuffer();
        char ch;
        for (int i=s.length()-1;i>=0;i--){
            ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                s1.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer rev_s1 = new StringBuffer(s1).reverse();
        return s1.toString().equals(rev_s1.toString());
    }

//    public static void main(String[] args) {
//        String str1 = new String("I am a boy.");
//        StringBuffer str2 = new StringBuffer(str1).reverse();
//        System.out.println(str2);
//    }
}
