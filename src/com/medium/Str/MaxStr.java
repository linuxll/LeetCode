package com.medium.Str;

import java.util.LinkedList;
import java.util.Queue;

//3.无重复字符的最长字串
public class MaxStr {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue=new LinkedList();
        int num=0;
        for(int i=0;i<s.length();i++){
            if(!queue.contains(s.charAt(i))){
                queue.add(s.charAt(i));
            }else{
                if(queue.size()>num){
                    num=queue.size();
                }
                while(!queue.poll().equals(s.charAt(i))){

                }
                queue.add(s.charAt(i));
            }

        }
        if(queue.size()>num){
            num=queue.size();
        }
        return num;
    }
}
