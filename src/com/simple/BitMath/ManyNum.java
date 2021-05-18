package com.simple.BitMath;

public class ManyNum {
    /**
     * 暴力解法
     * @param nums
     * @return
     */
    public int sol(int[] nums){

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * 投票算法
     * 设置候选众数，然后进行遍历，当遇到相同的数时，计数加一否则减一，当计数为0时，更改候选众数
     * @param nums
     * @return
     */
    public int BoyerMoore(int[] nums){
        int candi=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                candi=nums[i];
                count=1;
                continue;
            }
            if(candi==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candi;
    }

    /**
     * 排序算法
     */
}
