package questions;

import java.util.HashSet;
import java.util.Scanner;

public class huawei5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String num = sc.nextLine();
//        StringBuilder sb = new StringBuilder();
//        int index = num.length()-1;
//        sb.append(num.charAt(index));
//        while (index>=1){
//            if (num.charAt(index)==num.charAt(index-1)){
//                index--;
//            }else {
//                sb.append(num.charAt(index-1));
//                index--;
//            }
//        }
//        System.out.println(sb.toString());
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    HashSet<Character> hashSet = new HashSet<Character>();
    char[] chars = num.toCharArray();
    int index = num.length()-1;
    sb.append(num.charAt(index));
    hashSet.add(num.charAt(index));
    while (index>=1){
        if (!hashSet.contains(num.charAt(index-1))){
            sb.append(num.charAt(index-1));
            hashSet.add(num.charAt(index-1));
            index--;
        }else {
            index--;
        }
    }
    System.out.println(sb.toString());
}
}
