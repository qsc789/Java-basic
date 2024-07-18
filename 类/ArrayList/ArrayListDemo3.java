package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //包装类
        //int---Integer
        //char---Character
        //byte---Byte
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1)
            {
                System.out.print(list.get(i));
            }
            else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");

    }
}
