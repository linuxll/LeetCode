package com.simple.common;

//7.整数反转
public class IntFan {
    public int reverse(int y) {
        int res=0;
        int count=0;
        int temp=0;
        int x=y;
        if(x>0){
            while(true){
                if(x<=0){
                    break;
                }
                count++;
                temp=x%10;
                x=x/10;
                res*=10;
                res+=temp;
            }
        }else if(x<0){
            x=x*(-1);
            while(true){
                if(x<=0){
                    break;
                }
                count++;
                temp=x%10;
                x=x/10;
                res*=10;
                res+=temp;
            }
            res=res*(-1);
        }
            int j=1;
            for(int i=1;i<count;i++){
                j*=10;
            }
            if(y%10!=res/j){
                return 0;
            }
        return res;
    }
}
