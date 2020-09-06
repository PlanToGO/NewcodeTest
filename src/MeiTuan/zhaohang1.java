package MeiTuan;

import java.util.LinkedList;
import java.util.Scanner;

public class zhaohang1 {
    static int ans=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i=1;i<=target;i++){
            stack.push(i);
        }
        dfs(target,0,stack);
        System.out.println(ans);
    }

    private static void dfs(int target, int sum, LinkedList<Integer> stack) {
        while (!stack.isEmpty()){
            int sum1 = sum+stack.pop();
            if (sum1==target){
                ans++;
                dfs(target,0,stack);
            }else if (sum1<target){
                dfs(target,sum1,stack);
            }else {
                dfs(target,sum,stack);
            }
        }
    }
}
