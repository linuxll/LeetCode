package com.simple.Str;

//28.实现strStr()
public class StrStr {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String str=haystack.substring(i,i+needle.length());
                if(str.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
//还可以使用KMP算法