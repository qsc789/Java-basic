package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串");
        String str = sc.next();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            System.out.println(c);

        }

    }
}
