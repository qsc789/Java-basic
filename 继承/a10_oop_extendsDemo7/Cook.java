package com.plus.a10_oop_extendsDemo7;

public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
