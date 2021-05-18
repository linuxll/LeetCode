package com.simple.Str;

public class Consist {
    public int sol(String allowed,String[] words){
        int res=0;
        for(int i=0;i< words.length;i++){
            boolean flag=true;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                if(!allowed.contains(Character.toString(ch))){
                    flag=false;
                    break;
                }
            }
            if(flag){
                res++;
            }
        }
        return res;
    }
}
/*
contains():判断字符串包含某个字符序列的方法
Character.toString():将字符转化为字符串
String.valueOf():将字符转化为字符串
 */