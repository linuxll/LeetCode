package com.difficulty.BinarySearch;

//4.寻找两个正序数组的中文数
public class TwoZhong {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res;
        int[] arr=new int[nums1.length+nums2.length];
        int num_1=0;
        int num_2=0;
        for(int i=0;i<arr.length;i++){
            if(num_1<nums1.length&&num_2<nums2.length) {
                if (nums1[num_1] > nums2[num_2]) {
                    arr[i] = nums2[num_2];
                    num_2++;
                } else {
                    arr[i] = nums1[num_1];
                    num_1++;
                }
            }else if(num_1>=nums1.length&&num_2<nums2.length){
                arr[i]=nums2[num_2];
                num_2++;
            }else if(num_2>=nums2.length&&num_1<nums1.length){
                arr[i]=nums1[num_1];
                num_1++;
            }
        }
        if(arr.length%2==0){
            res=((arr[arr.length/2-1]+arr[arr.length/2])/2.0);
        }else{
            res=arr[arr.length/2];
        }

        return res;
    }
}
