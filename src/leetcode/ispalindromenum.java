package leetcode;

public class ispalindromenum {
    //先试一下采用转换为字符串的形式判断
    public boolean isPalindrome(int x){
        if (x<0) return false;
        String xts = new StringBuffer(String.valueOf(x)).reverse().toString();
        if (String.valueOf(x).equals(xts)){
            return true;
        }else {
            return false;
        }
    }

    //再试一下题目中说的不转化为字符串来解决这个问题
    public boolean isPalindrome1(int x){
        if (x<0) return false;
        int x1 = x;
        int reverse = 0;
        while (x1!=0){
            int tmp = x1%10;
            x1 = x1/10;
            reverse = reverse*10+tmp;
        }
        if (reverse==x){
            return true;
        }else {
            return false;
        }
    }

    //官方牛逼的解法
    public boolean isPalindrome2(int x){
        //如果是负数或者%10之后余数为0，则肯定不是回文数
        if (x<0||(x!=0&&x%10==0))return false;
        int reversehalf = 0;
        //使用一半的翻转就可以了
        while (x<reversehalf){
            reversehalf = reversehalf*10 + x%10;
            x/=10;
        }
        //如果是偶数的话，不影响，应该是reversehalf==x，如果是奇数的话，只要保证/10
        //和x相等就可以了，因为奇数中间的数一定是回文数。
        return reversehalf==x||reversehalf/10==x;
    }
}
