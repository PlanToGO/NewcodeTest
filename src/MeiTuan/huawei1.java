package MeiTuan;

import java.util.Scanner;

public class huawei1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            if (num==0){
                break;
            }
            System.out.println(helper(num));
        }
    }
    public static int helper(int n){
        if (n/3<=0){
            if (n%3==2){
                return n/3+1;
            }
            return 0;
        }else
            return n/3+helper(n/3+n%3);
    }
}
