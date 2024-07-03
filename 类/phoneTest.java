package com.itheima.methoddemo;

public class phoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p=new Phone();

        p.brand="aaa";
        p.price=12222;

        //获取手机中对象的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用类中方法
        p.call();
        p.playGame();
    }
}
