package entity;

public class Main{

    public static void main(String[] args){
        Student me = new Student("Khanh", 19);
        me.sayHello();
        System.out.println("Hello " + me.getName() + " ban " + me.getAge() + " tuoi phai khong ?");
        me.setName("Linh");
        me.setAge(20);
        System.out.println("Hello " + me.getName() + " ban " + me.getAge() + " tuoi phai khong ?");

        System.out.println();

        Car xe = new Car("Lamborgini", 100);
        xe.run();
        xe.setBrand("VinFast");
        xe.setMaxSpeed(200);
        xe.run();
        System.out.println("Day la xe " + xe.getBrand() + " co toc do " + xe.getMaxSpeed());

        System.out.println();

        xe.checkSpeed();
    }
}