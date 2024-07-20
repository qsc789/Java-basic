package com.plus.a02_staticDemo2;

public class ArrayUtil {
    //私有化构造方法
    private ArrayUtil(){}

    //静态方法，方便调用
    public static String printArr(int[] arr)
    {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1)
            {
                sb.append(arr[i]);
            }
            else {
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static double getAverage(double[] arr)
    {
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum/arr.length;
    }


}
