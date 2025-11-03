package service;
import model.User;

import java.util.ArrayList;

public class UserService {

    private static ArrayList<User> users = new ArrayList<>();

    static void add(User user){
        users.add(user);
    }

    public static User getUserById(String userId){
        for (User i : users){
            if (i.getId() == userId){
                return i;
            }
        }
        User user = new User();
        System.out.println("Không tồn tại ID này");
        return user;
    }

    public static ArrayList<User> getAllUsers(){
        return users;
    }
}
