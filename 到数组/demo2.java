package com.itheima.demo1;

public class demo2 {
    public static void main(String[] args) {
        System.out.println(true&true);//&并且
        System.out.println(true|false);//|或
        System.out.println(true^true);//^异或，相同为false

        System.out.println(true&&true);//&&并且，有短路作用
        System.out.println(true||true);//||或，有短路作用
    }
}
