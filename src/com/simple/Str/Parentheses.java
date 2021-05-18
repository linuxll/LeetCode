package com.simple.Str;

public class Parentheses {
    public int maxDepth(String s) {
        int count=0,max=0;
        if(!s.contains("(")&&!s.contains(")")){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                if(count>max){
                    max=count;
                }
                count--;
            }
        }
        return max;
    }
}
