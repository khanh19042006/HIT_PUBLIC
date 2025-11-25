package model;

import constant.IDebuggable;
import constant.IWorkable;

public class Developer extends Employee implements IDebuggable, IWorkable {
    private int overtimeHours;

    public Developer(){
        super();
    }

    public Developer(String id, String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(id, name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary(){
        return super.getBasicSalary() + super.getBASE_SALARY_RATE() * this.overtimeHours;
    }

    @Override
    public void work(){}

    @Override
    public void fixBug(){}

    @Override
    public String toString(){
        return super.toString() + "overtimeHours: " + this.overtimeHours;
    }
}
