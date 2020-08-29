package practise;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hk1 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=null;
            right=null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        //构建树
        Map<Integer,TreeNode> map = new HashMap<>();
        int[] first = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rootval=first[0];
        int rootleftval=first[1];
        TreeNode root = new TreeNode(rootval);
        map.put(rootval,root);
        TreeNode rootleft = new TreeNode(rootleftval);
        root.left=rootleft;
        map.put(rootleftval,rootleft);
        for (int i=0;i<len-2;i++){
            int[] tmp = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (map.containsKey(tmp[0])){
                if (map.get(tmp[0]).left==null){
                    map.get(tmp[0]).left=new TreeNode(tmp[1]);
                    map.put(tmp[1],map.get(tmp[0]).left);
                }else {
                    map.get(tmp[0]).right=new TreeNode(tmp[1]);
                    map.put(tmp[1],map.get(tmp[0]).right);
                }
            }
        }
        System.out.println(height(root));
    }

    private static int height(TreeNode root) {
        if (root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}