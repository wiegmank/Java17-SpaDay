package org.launchcode.spaday.data;

import org.launchcode.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {

    List<User> allUsers = new ArrayList<>();

    public void add(User user){
        allUsers.add(user);
    }

    public List<User> getAll() {
        return allUsers;
    }

    public User getById(int id){
        for(User user : allUsers) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
