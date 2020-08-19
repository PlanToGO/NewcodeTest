package leetcode;

/**
 * 题目：两个数组的交集  题号：349
 */

import java.util.ArrayList;
import java.util.HashSet;

public class intersection {
    public int[] Intersection(int[] nums1,int[] nums2){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0;i< nums1.length;i++){
            for (int j=0;j< nums2.length;j++){
                if (nums1[i]==nums2[j]){
                    if (!arrayList.contains(nums1[i])){
                        arrayList.add(nums1[i]);
                    }
                }
            }
        }
        int[] ans = new int[arrayList.size()];
        for (int i=0;i<arrayList.size();i++){
            ans[i]=arrayList.get(i);
        }
        return ans;
    }

    //使用内置函数
    public int[] Intersection1(int[] nums1,int[] nums2){
        HashSet<Integer> a = new HashSet<Integer>();
        for (Integer num:nums1) a.add(num);
        HashSet<Integer> b = new HashSet<Integer>();
        for (Integer num:nums2) b.add(num);

        a.retainAll(b);
        int[] ans = new int[a.size()];
        int index=0;
        for (int i:a) ans[index++]=i;
        return ans;
    }
}
