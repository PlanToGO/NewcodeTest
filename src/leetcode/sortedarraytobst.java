package leetcode;
//题目：将有序数组转换为二叉搜索树 题目编号：108
//思路：通过递归的方法，创建一个BTS，每次的节点都以左侧加右侧加一除以2来定义，也就是中间的元素

public class sortedarraytobst {
    public TreeNode sortedArrayToBST(int[] nums){
        return helper(nums,0,nums.length-1);
    }

    public TreeNode helper(int[] nums,int left,int right){
        if (left>right) return null;
        int mid = (left+right+1)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums,mid+1,right);
        return root;
    }
}
