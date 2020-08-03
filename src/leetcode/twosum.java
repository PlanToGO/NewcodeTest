package leetcode;

/**
 * 题目：两数之和2-输入有序数组 题号：167
 * 思路：自己的很垃圾。别人的：双指针法效率是最高的，如果左指针先到达下标i的位置，右指针
 * 还在下标j的右侧，sum>target，因此一定是右指针左移，反之亦然。
 */

public class twosum {
    public int[] twoSum(int[] numbers, int target){
        int[] ans = new int[2];
        int index1=0;
        int index2=1;
        for (int i=0;i<numbers.length-1;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]+numbers[j]==target){
                    index1=i;
                    index2=j;
                }
            }
        }
        ans[0] = index1+1;
        ans[1] = index2+1;
        return ans;
    }

    public int[] twoSum1(int[] numbers,int target){
        int low = 0;
        int high = numbers.length-1;
        while (high>low){
            int sum = numbers[low]+numbers[high];
            if (sum==target){
                return new int[]{low+1,high+1};
            }else if (sum>target){
                --high;
            }else {
                ++low;
            }
        }
        return null;
    }
}
