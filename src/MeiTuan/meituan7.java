package MeiTuan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class meituan7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] a = bf.readLine().split(" ");
        //物品的数量
        int n = Integer.parseInt(a[0]);
        //可以带的容量
        int v = Integer.parseInt(a[1]);
        int i = 0;
        int[] weight = new int[n];
        int[] value = new int[n];
        while (i<n){
            String[] tmp = bf.readLine().split(" ");
            int second = Integer.parseInt(tmp[1]);
            int first = Integer.parseInt(tmp[0])+(2*second);
            value[i]=first;
            weight[i]=second;
            i++;
        }
        boolean[] isVisited = new boolean[n];
        for (i=0;i< isVisited.length;i++){
            isVisited[i]=false;
        }
        int index= 0;
        int[] res = new int[v];
        while (index<v){
            int max_index = 0;
            for (int x=0;x< isVisited.length;x++){
                int max = 0;
                if (isVisited[x]==false){
                    max = Math.max(max,value[x]);
                    max_index=x+1;
                }else {
                    continue;
                }
            }
            res[index]=max_index;
            index++;
        }
        for (int p=0;p< res.length;p++){
            if (p== res.length-1){
                System.out.print(res[p]);
            }else {
                System.out.println(res[p]+" ");
            }
        }
    }
}
