package leetcode;
/*
题目：全排列 题号46
思路：回溯的方法
 */
import java.util.*;

public class permute2 {
    public static List<List<Integer>> Permute(int[] nums){
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len==0){
            return res;
        }
        //剪枝的前提是排序
        Arrays.sort(nums);
        Deque<Integer> path = new ArrayDeque<Integer>();
        boolean[] used = new boolean[len];
        dfs(nums,len,0,path,used,res);
        return res;
    }

    private static void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth==len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]){
                continue;
            }
            //进行剪枝判断与操作
            if (i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
            path.addLast(nums[i]);
            used[i]=true;
            dfs(nums,len,depth+1,path,used,res);
            path.removeLast();
            used[i]=false;
        }
    }
}