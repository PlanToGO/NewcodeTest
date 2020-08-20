package MeiTuan;

import java.util.Scanner;

public class meituan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            StringBuilder sb = new StringBuilder();
            String str = sc.nextLine();
            for (int i=0;i<str.length();i++){
                int j=i;
                while ((j+1)<str.length()&&str.charAt(j)==str.charAt(j+1)){
                    j++;
                }
                if (i==j){
                    sb.append(str.charAt(i));
                }
                i=j;
            }
            if (sb.toString().equals("")) {
                System.out.println("no");
            }else
                System.out.println(sb.toString());
        }
    }
}
