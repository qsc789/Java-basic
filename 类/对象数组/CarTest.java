package com.itheima.Array;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CarTest {
    public static void main(String[] args) {
        //1.创建数组存3个汽车对象
        Car[] arr=new Car[3];
        //2.创建汽车对象
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {//arr.fori
            //创建汽车对象
            Car c=new Car();
            //录入品牌
            System.out.println("请输入汽车品牌");
            String brand=sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车价格");
            int price=sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车颜色");
            String color=sc.next();
            c.setColor(color);

            arr[i]=c;
        }

        for (int i = 0; i < arr.length; i++) {
            Car car=arr[i];

            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
        }
    }
}
