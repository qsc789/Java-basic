package com.itheima.stringdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);

        //返回最终结果长度
        int len = sj.length();
        System.out.println(len);
        //返回字符串
        String str = sj.toString();
        System.out.println(str);
    }
}
