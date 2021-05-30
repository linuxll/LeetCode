package com.simple.Array;

//121.买卖股票的最佳时机
public class BuyStock {

    /**
     * 方法超时
     * @param prices
     * @return
     */
    public int bestTime(int[] prices){
        int result=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                for(int j=i+1;j< prices.length;j++){
                    if(prices[j]-prices[i]>result){
                        result=prices[j]-prices[i];
                    }
                }
            }
        }
        return result;
    }

    /**
     * 学习动态规划后的解答
     * @param prices
     * @return
     */
    public int sol(int[] prices){
        int ans=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else {
                if(ans<prices[i]-buy){
                    ans=prices[i]-buy;
                }
            }

        }
        return ans;
    }
}
