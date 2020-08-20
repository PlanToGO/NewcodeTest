package huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class huawei6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList arrayList = new ArrayList();
        for (int i =0;i<str.length();i++){
            int tmp = (int)str.charAt(i);
            if (tmp>=0&&tmp<=127){
                if (!arrayList.contains(tmp)){
                    arrayList.add(tmp);
                }
            }
        }
        System.out.println(arrayList.size());
    }
}
