package MeiTuan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class meituan9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bf.readLine());
        String[] arr = new String[len];
        int[] l = new int[len];
        int[] r = new int[len];
        for (int i=0;i<len;i++){
            String[] input = bf.readLine().split(" ");
            arr[i]=input[0];
            l[i]=Integer.parseInt(input[1]);
            r[i]=Integer.parseInt(input[2]);
        }
        for (int i=0;i<len;i++){
            int a = sum(arr[i],l[i],r[i]);
            if (isOdd(a)){
                System.out.println("0");
            }else {
                System.out.println("1");
            }
        }

    }
    public static boolean isOdd(int x){
        if (x%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static int sum(String str,int l,int r){
        int sum=0;
        for (int i=l;i<=r;i++){
            sum += Integer.parseInt(str,i);
        }
        return sum;
    }
}
