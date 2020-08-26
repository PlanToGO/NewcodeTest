package practise;

import java.util.*;

public class lru {
    static LinkedHashMap<Integer,Integer> map;
    public int[] LRU(int[][] operators,int k){
        List<Integer> res = new ArrayList<>();
        map = new LinkedHashMap<Integer, Integer>((int)Math.ceil(k/0.75f)+1,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size()>k;
            }
        };
        for (int i=0;i< operators.length;i++){
            if (operators[i].length==3) map.put(operators[i][1],operators[i][2]);
            else if (operators[i].length==2) res.add(map.getOrDefault(operators[i][1],-1));
        }
        if (res.size()==0) return new int[0];
        int[] resInt = new int[res.size()];
        for (int i=0;i<res.size();i++){
            resInt[i]=res.get(i);
        }
        return resInt;
    }
}
