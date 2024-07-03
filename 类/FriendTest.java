package com.itheima.methoddemo;

public class FriendTest {
    public static void main(String[] args) {
        friend fri=new friend();
        fri.setAge(18);
        fri.setGender("女");
        fri.setName("aaa");

        System.out.println(fri.getAge());
        System.out.println(fri.getGender());
        System.out.println(fri.getName());
        fri.method();

        fri.sleep();
        fri.eat();
    }
}
