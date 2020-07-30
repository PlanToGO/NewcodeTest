package leetcode;

/**
 * 题目：买卖股票的最佳时机2 题号：122
 * 思路：因为其实最佳时机就是波峰加一起的高度所以把前一个和后一个做比较，加一起即可。
 */

public class maxprofits {
    public int maxProfit(int[] prices){
        int max=0;
        for (int i=1;i<prices.length;i++){
            if (prices[i] > prices[i-1]){
                max += prices[i]-prices[i-1];
            }
        }
        return max;
        }
    }
