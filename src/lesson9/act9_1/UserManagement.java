package lesson9.act9_1;

import java.io.Serializable;
import java.util.*;

public class UserManagement implements Serializable {
    private final List<User>  userList = new ArrayList<>();
    private final Map<String,String> loginSaved = new HashMap<>();

    public UserManagement() {
    }

    public void addUser(User user) {
        userList.add(user);
        loginSaved.put(user.getUser_name(), user.getPassword());
    }

    public boolean isValid(String username) {
        for (User user : userList) {
            if (user.getUser_name().equals(username)) return false;
        }
        return true;
    }

    public User findByUsername(String username) {
        for (User user : userList) {
            if (user.getUser_name().equals(username)) return user;
        }
        return null;
    }

    public User login(String username, String password) {
        if (loginSaved.get(username).equals(password)) return findByUsername(username);
        return null;
    }

}
