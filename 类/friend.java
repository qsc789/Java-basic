package com.itheima.methoddemo;

public class friend {
    private String name;
    private int age;
    private String gender;
//对于每一个私有化成员变量，都要提供get和set方法

    public void setName(String name) {
        this.name=name;//成员变量
    }

    //对外提供name属性
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age>=18&&age<=50)
        {
            this.age=age;
        }
        else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public String getGender() {
        return this.gender;
    }
    public void method()
    {
        int age=10;
        System.out.println(age);//就近原则，输出10
        System.out.println(this.age);//输出18
    }

    public void sleep()
    {
        System.out.println("sleep");
    }
    public void eat()
    {
        System.out.println("eat");
    }
}
