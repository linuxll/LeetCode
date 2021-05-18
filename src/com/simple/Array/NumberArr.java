package com.simple.Array;

/*
第1365题
共有三种方法:暴力法，排序法，计数排序法
 */
public class NumberArr {
    public int[] sol(int[] nums){
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    res[i]++;
                }
            }
        }
        return res;
    }
}
