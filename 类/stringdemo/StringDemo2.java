package com.itheima.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String str1="abc";
        String str2=new String("abc");

        //比较字符串地址
        System.out.println(str1==str2);//创建方式不一样,str1在堆，str2在串池
        //比较字符串内容
        boolean res1 = str1.equals(str2);//不忽略大小写
        System.out.println(res1);
        boolean res2 = str1.equalsIgnoreCase(str2);//忽略大小写
        System.out.println(res2);
    }
}
