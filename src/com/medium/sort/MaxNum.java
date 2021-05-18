package com.medium.sort;

public class MaxNum {
    public static String sol(int[] nums){
        String str="";
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                flag=false;
                break;
            }
        }
        if(flag){
            return "0";
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(com(nums[j],nums[j+1])){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            str+=nums[i];
        }

        return str;
    }
    public static boolean com(int n,int m){
        boolean bo=false;
        String num1=n+""+m;
        String num2=m+""+n;

        if(num1.compareTo(num2)<0){
            bo=true;
        }
        return bo;
    }

    public static void main(String[] args) {
        int[] arr={10,2};
        System.out.println(sol(arr));
    }
}
