package com.plus.b03_polymorphismdemo3;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Animal a=new Dog();
        //编译看左边，运行看右边
        a.eat();
        //多态弊端：不能调用子类特有方法
        //编译看左边，父类中没有子类中的特有方法，直接报错
        //访问子类特有方法，必须转成子类类型

        //类型转换
        // 如果a是狗,则强转为Dog类型
        if(a instanceof Dog){
            Dog d=(Dog)a;
            d.lookHome();
        }
        else if(a instanceof Cat)
        {
           Cat c=(Cat)a;
           c.catchMouse();
        }
        else{
            System.out.println("没有这个类型");
        }

    }
}
class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
