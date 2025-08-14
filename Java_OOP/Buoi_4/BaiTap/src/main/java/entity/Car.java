package entity;

public class Car {

    private static final int maxSpeedApcept = 90;

    private String brand;
    private int maxSpeed;


    public Car(String brandOfCar, int maxSpeedOfCar){
        this.brand = brandOfCar;
        this.maxSpeed = maxSpeedOfCar;
    }

    public String getBrand(){
        return brand;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void run(){
        System.out.println("Xe " + brand + " dang chay voi toc do toi da " + maxSpeed + "km/h");
    }



    public void checkSpeed(){
        if (maxSpeed > maxSpeedApcept) System.out.println("Xe dang chay vuot qua toc do toi da, hay duoi theo va bat cmn no di");
        else System.out.println("Xe khong chay vuot qua toc do toi da, xe nay ngoan");
    }
}
