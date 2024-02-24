package com.itheima.methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        
        //遍历数组
        int[] arr={11,22,33,44,55};
        PrintArr(arr);
    }

    public static void PrintArr(int[] arr) {
        //arr.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");//只打印不换行
        }

    }
}
