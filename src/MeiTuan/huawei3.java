package MeiTuan;

import java.util.Scanner;

public class huawei3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str);
            sb.delete(0,2);
            System.out.println(Integer.parseInt(sb.toString(),16));
        }
    }
}
