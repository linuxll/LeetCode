package com.simple.Array;

public class EncodeList {
    public int[] sol(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length/2;i++){
            sum+=nums[2*i];
        }
        int[] res=new int[sum];
        for(int i=1,k=0;i< nums.length;i+=2){
            for(int j=0;j<nums[i-1];j++){
                res[k]=nums[i];
                k++;
            }
        }
        return res;
    }
}
