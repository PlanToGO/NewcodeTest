package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class codetest {
    public static void main(String[] args) throws IOException {
        //建立一个bufferedreader
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //规定了数组的大小是4x4
        String[][] str = new String[4][4];
        String[] tmp = new String[4];
        //读4次，每次都readline一次
        int len = str.length;
        int index = 0;
        int[][] arr = new int[str.length][str[0].length];
        while (index<len){
            //假如是逗号分割的
            tmp = bf.readLine().split(",");
            arr[index] = Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();
            index++;
        }
    }
}
