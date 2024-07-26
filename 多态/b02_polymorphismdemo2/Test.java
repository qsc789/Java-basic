package com.plus.b02_polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        Animal a=new Dog();
        //调用成员变量，编译看左边，运行也看左边(父类)
        System.out.println(a.name);//输出动物
        //调用成员方法，编译看左边，运行看右边
        //若父类没有这个方法，则编译失败
        //运行时，实际运行的是子类方法
        a.show();//Dog---show方法
    }
}
class Animal{
    String name="动物";
    public void show(){
        System.out.println("Animal---show方法");
    }
}
class Dog extends Animal{
    String name="狗";
    @Override
    public void show(){
        System.out.println("Dog---show方法");
    }

}
class Cat extends Animal{
    String name="猫";
    @Override
    public void show(){
        System.out.println("Cat---show方法");
    }
}