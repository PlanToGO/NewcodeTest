package MeiTuan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class langchao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = new int[sc.nextInt()];
        for (int i=0;i<res.length;i++){
            res[i]=sc.nextInt();
        }
        int[] arr = Arrays.copyOf(res,res.length);
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< arr.length-1;++i)
            map.put(arr[i],arr[i+1]);
        map.put(arr[arr.length-1],Integer.MAX_VALUE);
        Map<Integer,Integer> dp = new HashMap<>();
        dp.put(res[res.length-1],1);
        int max =1;
        for (int i= arr.length-2;i>=0;--i){
            if (dp.containsKey(map.get(res[i]))){
                dp.put(res[i],dp.get(map.get(res[i]))+1 );
            }else {
                dp.put(res[i], 1);
            }
            max=Math.max(max,dp.get(res[i]));
        }
        System.out.println(res.length-max);
    }
}
