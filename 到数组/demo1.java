package com.itheima.demo1;

public class demo1 {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        byte a=10;
        byte b=20;
        byte c=(byte)(a+b);//byte会上升到int
        System.out.println(c);

        System.out.println(3.5+"嘿嘿");
        System.out.println(3+8+"嘿嘿");
        System.out.println("abc"+true);
        System.out.println('a'+"acs"+true);
        System.out.println(1+1+"abc"+1+2);
    }
}