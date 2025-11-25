package model;

import constant.IWorkable;

public class Tester extends Employee implements IWorkable {
    private int bugsDetectedCount;

    public Tester(){
        super();
    }

    public Tester(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public Tester(String id, String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(id, name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public double calculateSalary(){
        return super.getBasicSalary() + super.getBASE_SALARY_RATE() * this.bugsDetectedCount;
    }

    @Override
    public void work(){}

    @Override
    public String toString(){
        return super.toString() + " bugsDetectedCount: " + this.bugsDetectedCount;
    }
}
