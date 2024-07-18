package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArraryListDemo2 {
    public static void main(String[] args) {
//        public boolean add(要添加的元素)	将指定的元素追加到此集合的末尾
//        public boolean remove(要删除的元素)	删除指定元素,返回值表示是否删除成功
//        public E remove(int index)	删除指定索引处的元素，返回被删除的元素
//        public E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
//        public E get(int index)	返回指定索引处的元素
//        public int size()	返回集合中的元素的个数
        ArrayList<String> list=new ArrayList<>();
        //增
        boolean res = list.add("aaa");
        System.out.println(res);
        System.out.println(list);
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        //删
        list.remove("ddd");
        System.out.println(list);

        String str=list.remove(0);//返回索引为0的aaa,返回被删除元素
        System.out.println(str);
        System.out.println(list);
        //改
        String result=list.set(1,"ddd");//把索引1的位置换成"ddd",返回被覆盖的元素
        System.out.println(result);
        System.out.println(list);
        //查
        String s=list.get(0);
        System.out.println(s);
        for (int i = 0; i < list.size(); i++) {//遍历
            System.out.println(list.get(i));
        }

    }
}
