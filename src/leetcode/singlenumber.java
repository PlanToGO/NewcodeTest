package leetcode;

/**
 * 题目：只出现一次的数字 题号：136
 * 思路：一个数组中全部的异或运算就可以得出只出现一次的数字
 */

public class singlenumber {
    //不使用额外的空间
    public int singleNumber(int[] nums){
        int single = 0;
        for (int num:nums){
            single ^= num;
        }
        return single;
    }
}
