package leetcode;

public class countandsay {
    public static String countAndSay(int n){
        if (n == 1) return "1";
            String prevStr = countAndSay(n-1);
            String result = "";
            int count = 0;
            char num = prevStr.charAt(0);
            for (int i =0 ;i<prevStr.length();i++){
                if (prevStr.charAt(i) != num){
                    result = result + String.valueOf(count)+num;
                    num = prevStr.charAt(i);
                    count = 1;
                }else {
                    count++;
                }
            }
            return result = result + String.valueOf(count)+num;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }
}
