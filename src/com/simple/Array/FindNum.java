package com.simple.Array;

import java.util.ArrayList;
import java.util.List;

//448.找到所有数组中消失的数组
public class FindNum {
    /**
     * 方法超时
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            boolean flag=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag=true;
                }
            }
            if(!flag){
                list.add(i);
            }
        }
        return list;
    }

    /**
     * 模拟哈希表法
     */
    public List<Integer> sol(int[] nums){
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int num:nums){
            int x=(num-1)%n;
            nums[x]+=n;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=n){
                list.add(i+1);
            }
        }
        return list;
    }
}
