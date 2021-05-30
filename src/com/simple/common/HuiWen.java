package com.simple.common;

//9.回文数
public class HuiWen {
    public boolean isPalindrome(int x) {
        boolean flag=false;
        int y=0;
        int temp=x;
        if(temp>0){
            while (true){
                if(temp==0){
                    break;
                }
                y=y*10+temp%10;
                temp=temp/10;
            }
        }else if(temp<0){
            return false;
        }
        if(y==x){
            return true;
        }
        return flag;
    }
}
