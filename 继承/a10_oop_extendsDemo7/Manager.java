package com.plus.a10_oop_extendsDemo7;

public class Manager extends Employee{
    private int bouns;

    public Manager() {

    }

    public Manager(String id, String name, int salary, int bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理");
    }
}
