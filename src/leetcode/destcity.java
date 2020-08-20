package leetcode;

import java.util.HashMap;
import java.util.List;

public class destcity {
    public String destCity(List<List<String>> paths){
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i=0;i<paths.size();i++){
            hashMap.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        String res = paths.get(0).get(1);
        while (hashMap.containsKey(res)){
            res=hashMap.get(res);
        }
        return res;
    }
}
