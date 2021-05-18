package com.simple.Array;

//27.移除元素
public class Delelement {
    public int sol(int[] nums,int val){
        int count=nums.length;
        for(int i=0;i<count;i++){
            if(nums[i]==val){
                nums[i]=nums[count-1];
                count--;
                i--;
            }
        }
        return count;
    }
}
