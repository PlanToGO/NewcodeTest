package MeiTuan;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        Set<Character> set = new HashSet<>();
        for (int i=0;i<sb.length();i++){
            if (!set.contains(sb.charAt(i))){
                    set.add(sb.charAt(i));
            }else {
                    sb.deleteCharAt(i);
                    i--;
            }
        }
        System.out.println(sb.toString());
    }
}
