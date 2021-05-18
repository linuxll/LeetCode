package com.medium.Stack;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumSec {
    /**
     * 自己的方法超时了，未能完全通过
     * @param n
     * @return
     */
    public static int sol(int n){
        int res=0;
        int[] target=new int[n];
        int count=0;
        for(int i=1;count<n;i++){
            boolean flag=false;
            flag=isUgly(i);
            if(flag){
                target[count]=i;
                count++;
            }
        }
        res=target[n-1];
        return res;
    }

    public static boolean isUgly(int n) {
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        if(n%2==0){
            n=n/2;
        }else if(n%3==0){
            n=n/3;
        }else if(n%5==0){
            n=n/5;
        }else {
            return false;
        }
        return isUgly(n);
    }

    /**
     * 最小堆法
     * PriorityQueue是优先队列：每次向其中加入一个元素，该队列都会自动排序成最小堆的形式
     * 通过set集合来避免重复的元素
     * @param n
     * @return
     */
    public int heap(int n){
        int[] factors={2,3,5};
        Set<Long> set=new HashSet<>();
        PriorityQueue<Long> h=new PriorityQueue<>();
        set.add(1L);
        h.add(1L);
        int ugly=0;
        for(int i=0;i<n;i++){
            long cur=h.poll();
            ugly=(int)cur;
            for(int factor:factors){
                long next=cur*factor;
                if(set.add(next)){
                    h.offer(next);
                }
            }
        }
        return ugly;
    }

    /**
     * 动态规划法
     * 注意三个if需要分开,如果不分开会造成重复
     * 有题意得丑数可以通过前面的丑数乘2或3或5得到
     * @param n
     * @return
     */
    public static int dy(int n){
        int[] dp=new int[n+1];
        dp[1]=1;
        int p2=1;
        int p3=1;
        int p5=1;
        for(int i=2;i<=n;i++){
            int num2=dp[p2]*2;
            int num3=dp[p3]*3;
            int num5=dp[p5]*5;
            dp[i]=Math.min(Math.min(num2,num3),num5);
            if(dp[i]==num2){
                p2++;
            }
            if(dp[i]==num3){
                p3++;
            }
            if(dp[i]==num5){
                p5++;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(dy(10));
    }
}
