package leetcode;

import java.util.HashMap;

public class restorestring {
    public String restoreString(String s,int[] indices){
        HashMap<Integer,Character> hashMap = new HashMap<>();
        for (int i=0;i< indices.length;i++){
            hashMap.put(indices[i],s.charAt(i) );
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i< indices.length;i++){
            sb.append(hashMap.get(i));
        }
        return sb.toString();
    }
}
