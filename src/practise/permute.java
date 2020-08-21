package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 给一个字符串s，求全排列，不能重复
 * 使用的是dfs和回溯
 */
public class permute {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(Arrays.toString(permutation(s)));
    }
    static List<String> res = new LinkedList<>();
    static char[] c;
    public static String[] permutation(String s){
        c=s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private static void dfs(int x) {
        if (x==c.length-1){
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();//如果可以重复的话，可以把这句和下边的删掉
        for (int i=x;i<c.length;i++){
            if (set.contains(c[i])) continue;
            set.add(c[i]);
            swap(c,i,x);
            dfs(x+1);
            swap(c,i,x);
        }
    }

    public static void swap(char[] array,int i,int j){
        char tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
