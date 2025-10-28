package Main;

import java.util.UUID;

public class User {
    private String id, name;
    private double balance;

    public User(String name, double balance) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.balance = balance;
    }

    public User() {
        this.id = "";
        this.name = "";
        this.balance = 0;
    };

    public User(String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withDraw(double amount){
        if (this.balance < amount) return false;
        else{
            this.balance -= amount;
            return true;
        }
    }
}
