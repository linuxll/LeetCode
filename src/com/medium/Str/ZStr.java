package com.medium.Str;

//6.
public class ZStr {
    public String convert(String s, int numRows) {
        String res="";
        boolean flag=true;
        char[][] arr=new char[s.length()-numRows][numRows];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<numRows;j++){
                arr[i][j]=' ';
            }
        }
        int num1=0;
        int num2=0;
        for(int i=0;i<s.length();i++){
            arr[num1][num2]=s.charAt(i);
            if(flag){
                num2++;
                if(num2==numRows){
                    flag=false;
                    num2-=2;
                    num1++;
                }
            }else{
                num2--;
                num1++;
                if(num2==0){
                    flag=true;
                }
            }
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[j][i]!=' '){
                    res+=arr[j][i];
                }
            }
        }
        return res;
    }
}
