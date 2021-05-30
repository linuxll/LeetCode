package com.medium.Str;

import java.util.ArrayList;
import java.util.Vector;

//5.最长回文子串
public class HuiWenStr {
    public String longestPalindrome(String s) {
        int MaxLen = 0;
        int begin = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;

        }
        MaxLen = 1;
        begin = 0;
        for (int L = 2; L <= s.length(); L++) {
            for (int i = 0; i < s.length(); i++) {
                int j = L + i - 1;
                if (j >= s.length()) {
                    break;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    if (L < 3) {
                        dp[i][j] = true;
                        if (L > MaxLen) {
                            MaxLen = L;
                            begin = i;
                        }
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                        if (dp[i][j] == true && L > MaxLen) {
                            MaxLen = L;
                            begin = i;
                        }
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return s.substring(begin,begin+MaxLen);
    }

    public static void main(String[] args) {
        HuiWenStr huiWenStr = new HuiWenStr();
        System.out.println(huiWenStr.longestPalindrome("cbbd"));


    }
}
