package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        String rightUsername="aaa";
        String rightPassword="123456";
        Scanner sc=new Scanner(System.in);

        int flag=0;
        for(int i=1;i<=3;i++)
        {
            System.out.println("输入用户名");
            String username=sc.next();
            System.out.println("输入密码");
            String password=sc.next();
            if(username.equals(rightUsername)&&password.equals(rightPassword))
            {
                System.out.println("登录成功");
                flag=1;
                break;
            }
            else
            {
                System.out.println("用户名或密码错误");
                System.out.println("还剩"+(3-i)+"次机会");
            }
        }
        if(flag==0)
        {
            System.out.println("3次失败，账户锁定");
        }

    }
}
