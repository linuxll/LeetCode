package com.medium.BinarySearch;

//第33题，搜索旋转排序数组
public class RotateArr {
    /**
     * 遍历实现
     * @param nums
     * @param target
     * @return
     */
    public int search1(int[] nums,int target){
        int n=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                n=i;
            }
        }
        return n;
    }

    /**
     * 二分查找实现
     * 此题需要注意，不能直接使用二分查找；因为旋转后的数组不是有序的。
     * @param nums
     * @param target
     * @return
     */
    public static int search2(int[] nums,int target){
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search2(arr,0));
    }
}
