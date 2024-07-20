package com.plus.a02_staticDemo2;

public class testDemo {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        String s = ArrayUtil.printArr(arr1);
        System.out.println(s);

        double[] arr2={1.2,3.2,4.5,3.3,4.3};
        System.out.println(ArrayUtil.getAverage(arr2));
    }
}
