package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class keyboard2 {
    public static void main(String[] args) {
        //如果是不知道数组的长度，可以这样写
        //使用scanner，同时通过ArrayList来进行存储
        Scanner sc = new Scanner(System.in);
        ArrayList arrayList = new ArrayList<>();
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            if (str.equals("")){
                break;
            }
            int[] tmp = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
            arrayList.add(tmp);
        }


        for (int i=0;i<arrayList.size();i++){
            int[] a = ((int[])arrayList.get(i));
            for (int j=0;j<a.length;j++){
                System.out.println(a[j]);
            }
        }
    }
}
