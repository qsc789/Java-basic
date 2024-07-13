package com.itheima.Array;


public class StudentTest {
    public static void main(String[] args) {
        Student[] arr=new Student[3];
        Student stu1=new Student(1,"aaa",23);
        Student stu2=new Student(2,"bbb",24);
        Student stu3=new Student(3,"ccc",25);

        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;
        Student stu4=new Student(4,"ddd",26);
        boolean flag=contains(arr,stu4.getId());
        if(flag) {
            System.out.println("id重复");
        }
        else {
            int count=getCount(arr);
            if(count==arr.length) {
                Student[] newArr=creatNewArr(arr);
                newArr[count]=stu4;
            }
            else{
                arr[count]=stu4;
            }
        }
    }
    public static Student[] creatNewArr(Student[] arr){//创建新数组
        Student[] newArr=new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
    public static boolean contains(Student[] arr,int id){//判断id是否重复
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            int sid=stu.getId();
            if(sid==id)
            {
                return true;
            }
        }
        return false;

    }
    public static int getCount(Student[] arr) {
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null)
            {
                num++;
            }
        }
        return num;
    }

}



