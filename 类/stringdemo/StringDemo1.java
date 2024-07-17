package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String str1="abc";
        System.out.println(str1);
        //参为字符串
        String str2=new String("abc");
        System.out.println("@"+str2+"!");
        //根据字符数组创建字符串
        char[] chs={'a','b','c','d'};
        String str3=new String(chs);
        System.out.println(str3);
        //根据字节数组创建字符串
        byte[] bytes={97,98,99,100};
        String str4=new String(bytes);
        System.out.println(str4);





    }
}
