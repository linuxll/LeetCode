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
     * 单调栈法
     */

}
