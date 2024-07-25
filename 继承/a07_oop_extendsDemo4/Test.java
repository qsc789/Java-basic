package com.plus.a07_oop_extendsDemo4;

public class Test {
    public static void main(String[] args) {
        OvevrseasStudent s=new OvevrseasStudent();
        s.lunch();
    }
}
class Person{
    public void eat(){
        System.out.println("吃");
    }
    public void drink(){
        System.out.println("喝");
    }
}
class OvevrseasStudent extends Person{
    public void lunch(){
        this.eat();//吃意大利面
        this.drink();//喝凉水
        super.eat();//吃
        super.drink();//喝
    }
    //父类方法不能满足需求时需要重写方法（方法名必须和父类相同）
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink()
    {
        System.out.println("喝凉水");
    }
}
class Student extends Person{
    public void lunch(){
        //隐含的this.eat(),子类没有调用父类
        eat();
        drink();
        //直接调用父类中eat和drink
        super.eat();
        super.drink();
    }
}