package MeiTuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class meituan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        System.out.println(Arrays.toString(str));
        int indexnow=0;
        for (int i=0;i< str.length;i++){
            if (str[i].equals("")){
                swap(str,i,indexnow);
                indexnow++;
            }
        }
        for (int i=indexnow;i< str.length;i++){
            for (int j=i;j< str.length-1;j++){
                if (needSwap(str[j],str[j+1] )){
                    swap(str,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
    public static void swap(String[] array,int i,int j){
        String tmp = array[i];
        array[i] = array[j];
        array[j] =tmp;
    }
    public static boolean needSwap(String s1,String s2){
        int index=0;
        int len1 = s1.length();
        int len2 = s2.length();
        while (index<len1&&index<len2){
            if ((int)s1.charAt(index)<(int)s2.charAt(index)){
                return true;
            }
            index++;
        }
        if (index==len1) {
            return false;
        }else return true;
    }
}
