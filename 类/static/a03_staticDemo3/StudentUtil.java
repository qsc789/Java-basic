package com.plus.a03_staticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAgeStudent(ArrayList<Student> list)
    {
         int max=list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()>max)
            {
                max=list.get(i).getAge();
            }
        }
        return max;
    }
}
