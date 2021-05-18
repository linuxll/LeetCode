package com.simple.common;

public class ProductSum {
    public int solute(int n){
        int sum=0;
        int product=1;
        for(int i=1;n!=0;i*=10){
            int temp=n%10;
            sum=sum+temp;
            product=product*temp;
            n=n/10;
        }
        return product-sum;
    }
}
