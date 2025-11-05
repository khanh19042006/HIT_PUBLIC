import java.util.UUID;

public class Employee {

    private int id;
    private String name;
    private String country;
    private double salary;

    private static int cnt = 0;

    public Employee() {}

    public Employee(String name, String country, double salary) {
        this.id = cnt;
        this.name = name;
        this.country = country;
        this.salary = salary;
        cnt++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Employee.cnt = cnt;
    }

    public void work(){}
}
