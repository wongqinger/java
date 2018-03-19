package com.example.study;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 11059 on 2018/3/19.
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "edabcmcbade";
        //System.out.println(isPalindrome2(s));
        System.out.println(maxSubString(s));
    }

    public static int maxSubString(String str){
        List<String> list = Arrays.asList(str.split(""));
        StringBuilder sb = new StringBuilder();
        for (String a : list) {
            sb.append(a);
            sb.append("#");
        }
        int maxLen = 0;
        int templen = 0;
        int len = sb.toString().length();
        for (int i = 0; i < len; i++) {
            templen = getLen(sb.toString(),i);
            if(templen > maxLen){
                maxLen = templen;
            }
        }
        return maxLen;
    }

    public static int getLen(String str , int index){
        int len = 0;
        int strLen = str.length();

        for (int i = 1; i <= index; i++) {
            if (index + i < strLen && str.charAt(index - i) == str.charAt(index + i)){
                len += 1;
            }else {
                return len;
            }
        }
        return len;
    }

    public static boolean isPalindrome(String str){
        StringBuffer sb = new StringBuffer(str);
        if (sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(String str){
        char [] ch = str.toCharArray();
        int l = 0;
        int r = ch.length - 1;
        while (l < r){
            if (ch[l] == ch[r]){
                l = l + 1;
                r = r - 1;
            }else {
                return false;
            }
        }
        return true;

    }
}
