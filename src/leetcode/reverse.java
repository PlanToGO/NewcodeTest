package leetcode;

/**
 * 题目：整数反转 题号：7
 * 思路：原数字%10可以得到当前的最后一个数字，原数字/10可以得到当前应该的
 * 进行到的最后的数字。需要注意是不是溢出，是通过两个if语句进行判断的。
 */


public class reverse {
    public int reversenum(int x){
        if (x>Integer.MAX_VALUE||x<Integer.MIN_VALUE) return 0;
        int ans = 0;
        while (x!=0){
            int tmp = x%10;
            x=x/10;
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && tmp > Integer.MAX_VALUE % 10)){
                ans = 0;
                break;
            }else if(ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && tmp < Integer.MIN_VALUE % 10)) {
                ans = 0;
                break;
            }
            ans = ans*10 + tmp;
        }
        return ans;
    }
}
