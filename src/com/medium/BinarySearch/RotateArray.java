package com.medium.BinarySearch;

//第81题，搜索旋转排序数组2
public class RotateArray {
    /**
     * 遍历实现
     * @param nums
     * @param target
     * @return
     */
    public boolean search1(int[] nums,int target){
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                flag=true;
            }
        }
        return flag;
    }

    /**
     * 二分查找实现
     *
     */
    public boolean search2(int[] nums,int target){
        boolean flag=false;
        return flag;
    }
}