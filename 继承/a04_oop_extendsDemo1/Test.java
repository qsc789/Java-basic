package com.plus.a04_oop_extendsDemo1;

public class Test {
    public static void main(String[] args) {
        //权限修饰符：
        //private：子类不能访问
        //子类只能访问父类中非私有成员
        Ragdoll rd=new Ragdoll();
        rd.eat();
        rd.drink();
        rd.CatchMouse();
        System.out.println("---------------------");
        Husky h=new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
