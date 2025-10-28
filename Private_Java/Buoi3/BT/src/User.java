public class User {
    private String id, name;
    private double balance;

    public User(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public String getId() {
        return id;
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
