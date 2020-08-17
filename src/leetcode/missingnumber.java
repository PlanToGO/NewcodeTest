package leetcode;

/**
 * 题目：缺失数字 题号：268
 */

import java.util.*;

public class missingnumber {
//    public int missingNumber(int[] nums){
//        Set<Integer> hashset = new HashSet<>();
//        for (int i=0;i<=nums.length;i++){
//            hashset.add(i);
//        }
//        for (int i=0;i<nums.length;i++){
//            if (hashset.contains(nums[i])) hashset.remove(nums[i]);
//        }
//        return hashset.iterator().next();
//    }
    public static int missingNumber1(int[] nums) {
        ArrayList list = new ArrayList();
        for (int i=0;i< nums.length;i++){
            list.add(nums[i]);
        }
//        for (int i=0;i< list.size();i++){
//            System.out.println(list.indexOf(i));
//        }
        Collections.sort(list);
//        System.out.println(list.size());
//        for (int i=0;i< list.size();i++){
//            System.out.println(list.indexOf(i));
//        }
        int i = 0;
        int ans = 0;
        boolean flag = false;
        while (i < nums.length && flag == false) {
            if (list.indexOf(i) != i) {
                flag = true;
                ans = i;
                i++;
            }else i++;
        }
        if (flag == false) return nums.length;
        return ans;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{3,0,1};
        System.out.println(missingNumber1(nums));
    }
}
