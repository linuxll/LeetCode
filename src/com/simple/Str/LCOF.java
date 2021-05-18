package com.simple.Str;

public class LCOF {
    public String sotule(String s, int n){
        String str;
        str=s.substring(n)+s.substring(0,n);
        return str;
    }
}
/*
截取字符串的两种方法：
1.split()
参数：分隔符
返回值：字符串数组

2.substring()
参数：只传一个，从当前位置一直截取到字符串末尾
     两个，第一个为开始位置，第二个为结束位置（截取出来的字符串不包括结束位置）
 */
