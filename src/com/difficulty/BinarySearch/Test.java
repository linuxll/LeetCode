package com.difficulty.BinarySearch;

import com.simple.Array.TwoNum;

public class Test {
    public static void main(String[] args) {
        TwoZhong twoNum=new TwoZhong();
        int[] arr1={2};
        int[] arr2=new int[0];
        double res=twoNum.findMedianSortedArrays(arr1,arr2);
        System.out.println(res);
    }
}
