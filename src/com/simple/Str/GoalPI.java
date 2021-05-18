package com.simple.Str;

public class GoalPI {
    /**
     * 调用函数法
     * @param command
     * @return
     */
    public String solute(String command){
        String str=command.replace("()","o");
        str=str.replace("(al)","al");
        return str;
    }

    /**
     * 模拟实现
     * @param command
     * @return
     */
    public String result(String command){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append('G');
            }else if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                sb.append('o');
                i++;
            }else {
                sb.append("al");
                i+=3;
            }
        }
        return sb.toString();
    }
}
//replace()和replaceAll()都是全部替换
//replaceAll()和replaceFirst()都支持正则表达式
//StringBuilder是一个可变的字符串序列