package Stream;

import java.io.*;
import java.util.Arrays;

public class keyborad1_1 {
    public static void main(String[] args) throws IOException {
        //如果是输入的长短已经有了定义的话，可以这样写
        //假如第一行输入的是数组的长度的话，可以这么写
            System.out.println("输入字符的大小，MxN：");
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String[] arr_len = br.readLine().split(",");
            int[][] array = new int[Integer.parseInt(arr_len[0])][Integer.parseInt(arr_len[1])];
            int[] tmp = new int[Integer.parseInt(arr_len[1])];
            for (int i = 0;i< array.length;i++){
                String[] tmp_str = br.readLine().split(",");
                tmp = Arrays.stream(tmp_str).mapToInt(Integer::parseInt).toArray();
                array[i]=tmp;
            }
            for (int[] a:array){
                for (int b:a){
                    System.out.println(b);
                }
            }
    }
}
