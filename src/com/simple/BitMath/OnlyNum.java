package com.simple.BitMath;

public class OnlyNum {

    /**
     * 暴力解法
     * @param nums
     * @return
     */
    public int sol(int[] nums){
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * 位运算解法
     * 1.任何数和0异或得到是它本身
     * 2.两个相同的数异或得到0
     * 3.异或运算满足交换率
     * 4.一个数异或两次可以得到它本身
     * @param nums
     * @return
     */
    public int soll(int[] nums){
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
