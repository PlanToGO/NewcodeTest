package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class huawei4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.valueOf(br.readLine());
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i=0;i<len;i++){
            String[] tmp = br.readLine().split(" ");
            int[] inttmp = new int[2];
            inttmp[0]=Integer.valueOf(tmp[0]);
            inttmp[1]=Integer.valueOf(tmp[1]);
            if (hashMap.containsKey(inttmp[0])){
                hashMap.put(inttmp[0], hashMap.get(inttmp[0])+inttmp[1]);
            }else {
                hashMap.put(inttmp[0],inttmp[1]);
            }
        }
        Set set = hashMap.keySet();
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        for (Object key:arr){
            System.out.println(key+" "+hashMap.get(key));
        }
    }
}
