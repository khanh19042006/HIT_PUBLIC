package Main;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        User khanh = new User( "Khanh", 1000000000);
        User linh = new User("Linh", 24000);
        User nguyen = new User("Nguyen");

        User listUser[] = new User[3];
        listUser[0] = khanh;
        listUser[1] = linh;
        listUser[2] = nguyen;



        while (true){
            int choose;
            System.out.println("Chọn thao tác: ");
            System.out.println("1: Chuyển tiền");
            System.out.println("2: Nạp tiền");
            System.out.println("3: Thoát");
            choose = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (choose == 3) break;
            else if (choose == 1) {
                System.out.print("Nhập số tiền muốn chuyển: ");
                int amount = Integer.parseInt(sc.nextLine());
                System.out.print("Chọn tên người chuyển: ");
                String name1 = sc.nextLine();
                System.out.print("Chọn tên người nhận: ");
                String name2 = sc.nextLine();

                User user1 = new User();
                for (User i : listUser){
                    if (i.getName().equalsIgnoreCase(name1)){
                        user1 = i;
                        break;
                    }
                }
                User user2 = new User();
                for (User i : listUser){
                    if (i.getName().equalsIgnoreCase(name2)){
                        user2 = i;
                        break;
                    }
                }

                if (user1.withDraw(amount)){
                    user2.deposit(amount);
                    System.out.println("Chuyển thành công !");
                }
                else{
                    System.out.println("Chuyển không thành công !");
                }
            } else if (choose == 2) {
                System.out.print("Nhập số tiền muốn nạp: ");
                double amount = Integer.parseInt(sc.nextLine());
                System.out.print("Chọn tên người nhận: ");
                String name = sc.nextLine();
                boolean check = false;
                for (User i : listUser) {
                    if (i.getName().equalsIgnoreCase(name)) {
                        i.deposit(amount);
                        System.out.println("Nạp thành công !");
                        check = true;
                        break;
                    }
                }
                if (!check) System.out.println("Nạp tiền không thành công !");
            }
        else break;
        }
    }
}