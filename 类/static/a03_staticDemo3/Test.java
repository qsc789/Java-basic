package com.plus.a03_staticDemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student s1=new Student("zhangsan",23,"男");
        Student s2=new Student("lisi",24,"女");
        Student s3=new Student("wangwu",25,"男");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int maxAgeStudent=StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
