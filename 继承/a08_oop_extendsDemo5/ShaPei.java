package com.plus.a08_oop_extendsDemo5;

public class ShaPei extends Dog{
    @Override
    public void eat() {
        super.eat();
        System.out.println("狗啃骨头");
    }
}
