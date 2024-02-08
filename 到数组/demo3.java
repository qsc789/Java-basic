package com.itheima.demo1;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        //键盘录入两个数
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();//两次输入
        int num2=sc.nextInt();
        System.out.println(num1==num2);
    }
}
