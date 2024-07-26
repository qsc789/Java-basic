package com.plus.b01_polymorphismdemo1;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师信息为："+getName()+","+getAge());
    }
}
