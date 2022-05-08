package lesson9.act9_1;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String user_name;
    private String password;
    private String displayName;
    private String email;

    public User() {

    }

    public User(String user_name, String password, String displayName, String email) {
        this.id = (int)(Math.random()*1000000); // Random between 000 000 - 999 999
        this.user_name = user_name;
        this.password = password;
        this.displayName = displayName;
        this.email = email;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public void printInformation() {
        System.out.println("Username:" + user_name + "\n" +
                "Id: " + id + "\n" +
                "Display name: " + displayName
                );
    }
}
