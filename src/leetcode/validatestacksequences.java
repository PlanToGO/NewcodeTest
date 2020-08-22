package leetcode;

/**
 * 判断是否为栈的序列  剑指offer 31
 * 用一个辅助stack来实现
 */

import java.util.Stack;

public class validatestacksequences {
    public boolean validateStackSequences(int[] pushed,int[] popped){
        Stack<Integer> helper = new Stack();
        int i=0;
        for (int num:pushed){
            helper.push(num);
            while (!helper.isEmpty()&&helper.peek()==popped[i]){
                helper.pop();
                i++;
            }
        }
        return helper.isEmpty();
    }
}
