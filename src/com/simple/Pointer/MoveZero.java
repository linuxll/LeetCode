package com.simple.Pointer;

//283.移动零
public class MoveZero {
    /**
     * 覆盖法（没有体现移动，不过移动法也大同小异）
     * @param nums
     */
    public void move(int[] nums){
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }
        }
        for(int i=0;i<nums.length-left;i++){
            nums[nums.length-1-i]=0;
        }
    }


}
