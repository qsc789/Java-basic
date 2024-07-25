package com.plus.a06_oop_extendsDemo3;

import javax.sound.midi.Soundbank;

public class Test {
    public static void main(String[] args) {

    }
}
class Ye{
    String name="Ye";
}
class Fu extends Ye{
    String name="Fu";
}
class Zi extends Fu{
    String name="Zi";
    public void zishow(){//就近原则
        String name="zishow";
        System.out.println(name);//zishow
        System.out.println(this.name);//zi
        System.out.println(super.name);//Fu
    }
}
//继承中成员变量访问特点：现在局部找，本类成员位置找，父类成员位置找，逐级往上