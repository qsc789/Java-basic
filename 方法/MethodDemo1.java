package com.itheima.methoddemo;
//方法，跟函数一样
public class MethodDemo1 {
    public static void main(String[] args) {
        method1();
        int num=method2(20,20);
    }

    public static void method1() {
        //无返回值的方法
    }

    public static int method2(int a,int b) {
        return a+b;
    }
    //方法重载
    //一个类中相同功能方法可以起相同方法名，但形参个数或类型或顺序不同
    public static int sum(int a,int b) {
        return a + b;
    }
    public static double sum(int a,double b) {
        return (double)(a+b);
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d) {
        return a+b+c+d;
    }

}
