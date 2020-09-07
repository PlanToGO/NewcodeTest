package MeiTuan;

import java.util.LinkedList;
import java.util.Scanner;

public class huawei11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while (!sc.hasNext("[0-9]")){
            String num = sc.next();
            list.add(num);
        }
        String linjiestr = sc.next();
        int linjie=Integer.parseInt(linjiestr);
        String target = sc.next();
            LinkedList<String> ans = new LinkedList<>();
            //把临界值读到ans集合中
            for (int i=0;i<list.size();i++){
                String tmp = list.get(i);
                StringBuilder sb = new StringBuilder();
                for (int j=0;j<tmp.length();j++){
                    if (linjie>getnum(tmp.charAt(j))){
                        sb.append(getnum(tmp.charAt(j)));
                    }
                }
                ans.add(sb.toString());
            }
            //给定字符串的特征值的取得
            StringBuilder sb1 = new StringBuilder();
            for (int i=0;i<target.length();i++){
                if (linjie>getnum(target.charAt(i))){
                    sb1.append(target.charAt(i));
                }
            }
            //判断是不是它的子串，然后进行输出
            for (int i=0;i<ans.size();i++){
                if (isSubString(ans.get(i),sb1.toString())){
                    System.out.println(list.get(i));
                }
            }
        }
    //取得数字
    public static int getnum(char ch){
        return (int)(ch)-(int)'0';
    }
    //判断子串
    public static boolean isSubString(String s1,String s2){
        //判断的是s2
        if (s1.indexOf(s2)!=-1){
            return true;
        }return false;
    }
}
