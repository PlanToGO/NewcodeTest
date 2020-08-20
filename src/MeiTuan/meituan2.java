package MeiTuan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class meituan2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(bf.readLine());
        int[] man = new int[len];
        int[] woman = new int[len];
        int count=0;
        while (count<len){
            man[count]=Integer.parseInt(bf.readLine());
            count++;
        }
        count=0;
        while (count<len){
            woman[count]=Integer.parseInt(bf.readLine());
            count++;
        }
        count=0;
        while (count<len){
            System.out.println(man[count]);
            System.out.println(woman[count]);
            count++;
        }
    }
}
