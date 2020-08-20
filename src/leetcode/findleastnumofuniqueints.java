package leetcode;

import java.util.*;

public class findleastnumofuniqueints {
    public int findLeastNumOfUniqueInts(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1 );
            }
        }
        ArrayList<Integer> a = new ArrayList(map.values());
        Collections.sort(a);
        while (k>0){
            k = k-(int)(a.get(0));
            a.remove(0);
        }
        if (k<0)return a.size()+1;
        else return a.size();
    }
}
