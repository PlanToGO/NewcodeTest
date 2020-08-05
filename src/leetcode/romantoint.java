package leetcode;

/**
 * 题目：罗马数字转整数 题号：13
 */


public class romantoint {
    public int romanToInt(String s){
        int ans = 0;
        //设定prenumber为现在遍历的前一个数字，从第二个数字开始
        //按照正常的逻辑，应该是前一个数字大于等于后一个数字的，前一个大于后一个就需要加上这个数字
        //如果是前一个数字小
        //于后一个数字了，那么证明结果中就要减去这个数字了
        int prenumber = getValue(s.charAt(0));
        for (int i=1;i<s.length();i++){
            int num = getValue(s.charAt(i));
            if (prenumber<num){
                ans -= prenumber;
            }else {
                ans += prenumber;
            }
            prenumber = num;
        }
        ans += prenumber;
        return ans;
    }
    //写一个获取数值的方法
    private int getValue(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
