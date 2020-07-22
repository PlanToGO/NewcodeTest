package leetcode;
//题目：合并两个有序数组，序号88

import java.util.Arrays;

public class merge {
    public void Merge(int[] nums1, int m , int[] nums2 , int n){
        //数组1的数量为m，数组2的数量为n，而且均为有序数组
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }

    public void Merge1(int[] nums1 , int m , int[] nums2 , int n){
        //先复制出来数组1的内容
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1,0,nums1_copy,0,m);
        //双指针，一个指向数组1的遍历位置，一个指向数组2的遍历位置，最后还有一个总的位置
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        //判断需要哪个数字放进当前的位置
        while ((p1<m)&&(p2<n)){
            nums1[p++]=(nums1_copy[p1]<nums2[p2])?nums1_copy[p1++]:nums2[p2++];
        }
        //如果判断完了还有数字，那就把这些数字复制进数组1中得到结果
        if (p1<m)
            System.arraycopy(nums1_copy,p1,nums1,p1+p2,m+n-p1-p2);
        if (p2<n)
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
    }
}
