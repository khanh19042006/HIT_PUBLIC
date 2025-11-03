import model.User;
import service.AuthService;
import service.UserService;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("--- Menu Auth ---");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        int choose = Integer.parseInt(sc.nextLine());
        while (choose != 3){
            if (choose == 1){
                System.out.print("username: ");
                String userName = sc.nextLine();
                System.out.print("password: ");
                String passWord = sc.nextLine();
                if (AuthService.login(userName, passWord)){
                    System.out.println("--- Menu User ---");
                    System.out.println("1. Get user by id");
                    System.out.println("2. Get all user ");
                    System.out.println("3. Change password");
                    int newchoose = Integer.parseInt(sc.nextLine());
                    if (choose == 1){
                        System.out.print("Id: ");
                        String id = sc.nextLine();
                        if(UserService.getUserById(id).getId() != null){
                            UserService.getUserById(id).toString();
                        }
                        else{
                            System.out.println("Id không tồn tại !");
                        }
                    } else if (choose == 2) {
                        for (User i : UserService.getAllUsers()){
                            i.toString();
                        }
                    } else if (choose == 3) {
                        System.out.print("Id: ");
                        String id = sc.nextLine();
                        System.out.print("New password: ");
                        String newPassword = sc.nextLine();
                        System.out.print("Confirm new pasword");
                        String confirmNewPassword = sc.nextLine();
                        AuthService.changePassword(id, newPassword, confirmNewPassword);
                    }
                }
                else{
                    System.out.println("username hoặc password không hợp lệ");
                }
            } else if (choose == 2){
                System.out.print("username: ");
                String username = sc.nextLine();
                System.out.print("password: ");
                String password = sc.nextLine();
                System.out.print("email: ");
                String email = sc.nextLine();
                System.out.print("phonenumber: ");
                String phonenumber = sc.nextLine();
                AuthService.register(username, password, email, phonenumber);
            } else{
                System.out.println("Cú pháp không hợp lệ");
            }
            System.out.println("--- Menu Auth ---");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");

            choose = Integer.parseInt(sc.nextLine());
        }
    }
}