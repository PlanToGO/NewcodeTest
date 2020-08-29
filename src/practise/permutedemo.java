package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class permutedemo {
    static String[] food = {"黄焖鸡","珍珠奶茶","黄焖鸡","土豆粉"};
    static List<String[]> foodlist = new LinkedList<>();
    public static void permutation() {
        dfs(0);
        for (String[] a:foodlist){
            System.out.println(Arrays.toString(a));
        }
    }
    private static void dfs( int x) {
        if (x== food.length-1){
            foodlist.add(Arrays.copyOf(food,food.length));
            return;
        }
//        HashSet<String> set = new HashSet<>();
        for (int i=x;i<food.length;i++){
//            if (set.contains(food[i])) continue;
//            set.add(food[i]);
            swap(food,i,x);
            dfs(x+1);
            swap(food,i,x);
        }
    }
    static void swap(String[] array,int i,int j){
        String tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        permutation();
    }
}
