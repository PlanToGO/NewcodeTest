package leetcode;

/**
 * 题目：买卖股票的最佳时机  题号：121
 * 思路：自己写的很垃圾，不说了。还有一种一次遍历的方法，思路就是假设自己在第i天，如果今天卖股票，能赚多少钱
 */


public class maxprofit {
    public int maxProfit(int[] prices){
        int max = 0;
        int current_profit = 0;
        for (int i=0;i<prices.length;i++){
            for (int j=i+1;j<prices.length;j++){
                current_profit=prices[j]-prices[i];
                if (current_profit>max){
                    max=current_profit;
                }
            }
        }
        return max;
    }

    public int maxProfit1(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<minprice){
                minprice=prices[i];
            }else if (prices[i]-minprice>profit){
                profit=prices[i]-minprice;
            }
        }
        return profit;
    }
}
