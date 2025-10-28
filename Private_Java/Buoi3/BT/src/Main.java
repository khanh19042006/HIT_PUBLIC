public class Main {
    public static void main(String[] args) {
        User khanh = new User("2024", "Khanh", 1000000000);
        User linh = new User("2025", "Linh", 24000);
        User nguyen = new User("2026", "Nguyen");

        User listUser[] = new User[5];
        listUser[1] = khanh;
        listUser[2] = linh;
        listUser[3] = nguyen;

        double amount1 = 24000000;
        if (listUser[1].withDraw(amount1)){
            listUser[3].deposit(amount1);
        }

        double amount2 = 100000;
        if (listUser[2].withDraw(amount2)){
            listUser[3].deposit(amount2);
        }

    }
}