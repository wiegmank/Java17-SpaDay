package org.launchcode.spaday.data;

import org.launchcode.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {

    private static final List<User> allUsers = new ArrayList<>();

    public static void add(User user){
        allUsers.add(user);
    }

    public static List<User> getAll() {
        return allUsers;
    }

    public static User getById(int id){
        for(User user : allUsers) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
