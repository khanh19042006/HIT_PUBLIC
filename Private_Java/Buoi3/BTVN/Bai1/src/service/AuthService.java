package service;
import model.User;
import service.UserService;

public class AuthService {

    public static void register (String username, String password, String emaill, String phonenumber){
        User user = new User(username, password, emaill, phonenumber);
        UserService.add(user);
    }

    public static boolean login(String username, String password){
        for (User i : UserService.getAllUsers()){
            if (i.getUserName() == username && i.getPassword() == password){
                return true;
            }
        }
        return false;
    }

    public static void changePassword(String userId, String newPassword, String comfirmNewPassword){
        if (!(newPassword.equalsIgnoreCase(comfirmNewPassword))) return;
        for (User i : UserService.getAllUsers()){
            if (i.getId() == userId){
                i.setPassword(newPassword);
                System.out.println("Đổi password thành công");
                return;
            }
        }
        return;
    }

}
