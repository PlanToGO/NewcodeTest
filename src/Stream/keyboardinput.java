package Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class keyboardinput {
    public static void main(String[] args) throws IOException {
        //单个输入，输入的只能是字符
//        System.out.println("请输入一个字符：");
//        char ch = (char)System.in.read();
//        System.out.println(ch);
        //输入一个string的数据类型
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = null;
//        str = br.readLine();
//        System.out.println(str);
        //用Scanner进行输入
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入名字");
//        String name = sc.next();
//        System.out.println(name);

        //输入一个数组，假如是2x3的大小
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int[][] array = new int[Integer.parseInt(in1[1])+2][2];
        int i=1;
        array[0] = Arrays.stream(in1).mapToInt(Integer::parseInt).toArray();
        String[] tmp = new String[2];
        while (i< array.length){
            tmp = br.readLine().split(" ");
            array[i] = Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();
            i++;
        }
        for (int[] a:array){
            for (int b:a){
                System.out.println(b);
            }
        }
    }
}
