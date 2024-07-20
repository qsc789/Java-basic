package com.plus.a05_oop_extendsDemo2;

//构造方法无法继承
//成员变量：非私有和私有的都能继承，私有的继承不能调用
//方法：只有父类中的虚方法才能被子类继承（非private，非static，非final）
public class Test {
    public static void main(String[] args) {

       // Zi z1=new Zi();
       // Zi a2=new Zi("aaa",22);
    }
}

class Fu{
    String name;
    int age;
    public Fu(){}

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Zi extends Fu{
    //如果一个类没有构造方法，虚拟机会自动给你添加一个默认的空参构造
}