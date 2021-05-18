package com.simple.BitMath;

public class HanM {
    /**
     * 我的方法
     * 还可以通过内置函数Integer.bitCount()来直接对其进行位计数
     * @param x
     * @param y
     * @return
     */
    public int solute(int x,int y){
        int num=x^y;
        String str=Integer.toBinaryString(num);
        num=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                num++;
            }
        }
        return num;
    }

    /**
     * 移位运算
     * @param x
     * @param y
     * @return
     */
    public int dis(int x,int y){
        int xor=x^y;
        int distance=0;
        while(xor!=0){
            if(xor%2==1){
                distance++;
            }
            xor=xor>>2;
        }
        return distance;
    }

    /**
     * 布赖恩·克尼根算法：
     * 只计算1而跳过0
     */
    public int keni(int x,int y){
        int xor=x^y;
        int distance=0;
        while (xor!=0){
            distance++;
            xor=xor&(xor-1);
        }
        return distance;
    }
}
