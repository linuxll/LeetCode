package com.simple.common;

public class LCPSix {
    public int solute(int[] coins){
        int result=0;
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<coins[i];j+=2){
                if(coins[i]-j<=1){
                    result++;
                    break;
                }
                result++;
            }
        }
        return result;
    }
}