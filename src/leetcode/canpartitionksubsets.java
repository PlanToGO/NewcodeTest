package leetcode;


/**
 * 题目：划分为k个相等的子集 题号：698
 * 做法：回溯法，很经典
 */
public class canpartitionksubsets {
    public boolean canPartitionKSubsets(int[] nums,int k){
        int sum=0 , maxNum = 0;
        for (int i=0;i<nums.length;i++){
            //sum为里边的所有数字的总和
            sum += nums[i];
            //maxNum为当前数字最大值
            if (maxNum<nums[i]) maxNum=nums[i];
        }
        //如果说总和除以分成的组，得到的余数都不是0，或者最大的数字比总和除以分成的组都大，说明
        //不可能分割成这样的数组，所以说绝对不可能，return false
        if (sum % k!= 0||maxNum>sum/k) return false;
        //辅助队列，判断是不是用过这个数字
        boolean[] used = new boolean[nums.length];
        return backtracking(nums,k,sum/k,0,0,used);
    }

    private boolean backtracking(int[] nums, int k, int target, int cur, int start, boolean[] used) {
        //首先是返回的条件，如果是需要分的组为0了，就说明可以，返回true
        if (k==0) return true;
        //如果找到了可以分成组的数字，那么就构建下一个集合
        if (cur==target){
            return backtracking(nums,k-1,target,0,0,used);
        }
        for (int i=start;i< nums.length;i++){
            //如果没用过，而且现在的数字的和小于等于目标值target，那么就把现在这个数字的used设置为true，并且回溯
            if (!used[i]&&cur+nums[i]<=target){
                used[i]=true;
                if (backtracking(nums,k,target,cur+nums[i],i+1,used)) return true;
                used[i]=false;
            }
        }
        return false;
    }
}
