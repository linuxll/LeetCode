package com.simple.common;

import java.util.ArrayList;
import java.util.List;

//第1389
public class CTArray {
    /**
     * 通过集合实现
     * @param nums
     * @param index
     * @return
     */
    public int[] create(int[] nums,int[] index){
        int[] target=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<target.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<target.length;i++){
            target[i]=list.get(i);
        }
        return target;
    }

    /**
     * 模拟思路，未实现
     * @param nums
     * @param index
     * @return
     */
    public static int[] cr(int[] nums,int[] index){
        int[] target=new int[nums.length];
        for(int i=0;i<target.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(index[i]==index[j]){
                    flag=true;
                }
            }
            if(flag){
                for(int j=target.length-1;j>index[i];j--){
                        target[j]=target[j-1];
                }
                target[index[i]]=nums[i];
            }else{
                target[index[i]]=nums[i];
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums={4,2,4,3,2};
        int[] index={0,0,1,3,1};
        int[] target=cr(nums,index);
        for(int i=0;i<target.length;i++){
            System.out.println(target[i]);
        }
    }
}
