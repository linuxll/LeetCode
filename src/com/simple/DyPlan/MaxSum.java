package com.simple.DyPlan;

//53.最大字序和
public class MaxSum {
    /**
     * 第一次动态规划解答
     * 超出内存限制
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i][i]=nums[i];
        }
        for(int l=2;l<=nums.length;l++){
            for(int i=0;i<nums.length;i++){
                int j=l+i-1;
                if(j>=nums.length){
                    break;
                }
                dp[i][j]=dp[j][j]+dp[i][j-1];
            }
        }
        int ans=dp[0][0];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(ans<dp[i][j]){
                    ans=dp[i][j];
                }
            }
        }
        return ans;
    }
}
