package com.simple.common;

public class UglyNum {
    public boolean isUgly(int n) {
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
}
