package questions;

/*进制转化16转10
 */
import java.util.Scanner;

public class toten {
    public static String solution(String str){
        long ans = 0;
        int index = 0;
        for (int i=str.length()-1;i>1;i--){
            ans += getVal(str.charAt(i))*Math.pow(16,index);
            index++;
        }
        return String.valueOf(ans);
    }
    public static int getVal(char ch){
        if (ch<='9') return Integer.parseInt(String.valueOf(ch));
        switch (ch){
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = new String("0xABC590ABC");
        System.out.println(solution(str));
        System.out.println(Long.parseLong("ABC590ABC",16));
        Scanner sc = new Scanner(System.in);
    }
}
