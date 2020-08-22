package leetcode;

import java.util.HashSet;
import java.util.Set;

public class canpermutepalindrome {
    public boolean canPermutePalindrome(String s){
        if (s.length()==0) return false;
        Set<Character> set = new HashSet<>();
        for (char a:s.toCharArray()){
            if (!set.add(a)){
                set.remove(a);
            }
        }
        return set.size()<=1;
    }
}
