package com.medium.BinarySearch;

public class RotateMin {
    public int min(int[] nums){
        int res=nums[0];
        int L=0;
        int R=nums.length-1;
        int mid=0;
        while(L<=R){
            mid=(L+R)/2;
            if(nums[mid]<res){
                res=nums[mid];
            }
            if (nums[L] < nums[mid]) {
                if(nums[mid]>res){
                    R=mid-1;
                }else{
                    L=mid+1;
                }
            }else{

                if(nums[mid]>res){
                    R=mid-1;
                }else{
                    L=mid+1;
                }

            }
        }
        return res;
    }
}
