package lesson9.act9_1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static final Pattern USERNAME_REGEX =
            Pattern.compile("^[A-Z\\d]([._-](?![._-])|\\w){3,18}[A-Z\\d]$",Pattern.CASE_INSENSITIVE);
    /*username start with any word, contains [._-] but not consecutive
     * end with a word, total length from 5-20*/
    public static final Pattern EMAIL_REGEX =
            Pattern.compile("^[A-Z\\d._%+-]+@[A-Z\\d]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    /*email start with letters plus ._%+-, follow with @xmail. where x represents any letters
     * end with a domain name has total length from 2-6 without subdomain*/
    public static final Pattern PASS_REGEX =
            Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?!.*\s).{8,}$");

    /*password must contain at least one digit
    password must contain at least a lowercase latin character
    password must contain at least an uppercase latin character
    password must contain at least one special character [@#$%^&+=]
    password has no whitespace
    password length must have at least 8 characters*/
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Load datasaved
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\lesson9\\act9_1\\data.ser"));
        UserManagement userManager = (UserManagement) in.readObject();
        Scanner input = new Scanner(System.in);
        int command;
        Outer:
        do {
            System.out.println("Command list:");
            System.out.println("1. Create new user.");
            System.out.println("2. Login");
            System.out.println("3. Find by username");
            System.out.println("4. Close");
            System.out.print("Enter command: ");
            command = input.nextInt();
            input.nextLine(); //Gathering left over \r\n
            if (command == 1) {
                // gather valid username
                System.out.println("""
                        --Username start with any word, contains [._-] but not consecutive
                        --Username end with a word, total length from 5-20""");
                System.out.print("Enter username: ");
                String username = usernameCheck(input.nextLine(), userManager);
                System.out.println(username + " is available");
                // gather valid password
                System.out.println("""
                        --Password must contain at least one digit
                        --Password must contain at least a lowercase latin character
                        --Password must contain at least a uppercase latin character
                        --Password must contain at least one special character [@#$%^&+=]
                        --Password has no whitespace
                        --Password length must have at least 8 characters""");
                System.out.print("Enter password: ");
                String password = passwordCheck(input.nextLine());
                // gather valid email
                System.out.println("""
                        --Email can start with letters plus ._%+-, follow with @xmail where x represents any letters
                        --Email must end with a domain name has total length from 2-6 without subdomain""");
                System.out.print("Enter your email: ");
                String email = emailCheck(input.nextLine());
                System.out.println(email + " has been used");
                // gather display name
                System.out.print("Enter display name: ");
                String displayName = input.nextLine();
                // Add user
                userManager.addUser(new User(username, password, displayName, email));
                System.out.println("Your account has been created");
            }
            if (command == 2) {
                System.out.print("Enter 0 to back.");
                String username;
                System.out.println("Login your account");
                do {
                    System.out.print("Enter your username: ");
                    username = input.nextLine();
                    if (userManager.findByUsername(username) == null) {
                        System.out.println("Your account doesn't exist");
                    } else if (username.charAt(0) == '0') continue Outer;
                    else break;
                } while (true);
                do {
                    System.out.print("Enter your password: ");
                    String password = input.nextLine();
                    if (userManager.login(username, password) == null) {
                        System.out.println("Your password is not correct");
                    } else if (username.charAt(0) == '0') continue Outer;
                    else break;
                } while (true);
                System.out.println("Login successful!");
            }
            if (command == 3) {
                System.out.print("Enter username to find: ");
                String username = input.nextLine();
                if (userManager.findByUsername(username) != null) {
                    userManager.findByUsername(username).printInformation();
                } else System.out.println("Account doesn't exits");
            }
            if (command == 4) {
                break;
            }
        } while (command != 4);
        try (ObjectOutputStream output =
                     new ObjectOutputStream(new FileOutputStream("src\\lesson9\\act9_1\\data.ser"))
        ){
            output.writeObject(userManager);
        }
    }

    public static String usernameCheck(String username, UserManagement userManager) {
        Scanner input = new Scanner(System.in);
        do {
            if (!USERNAME_REGEX.matcher(username).matches()) {
                System.out.println("Your username is not allowed");
                System.out.print("Re-enter username: ");
                username = input.nextLine();
            }
            else if (!userManager.isValid(username)) {
                System.out.println("Username already exists");
                System.out.print("Re-enter username: ");
                username = input.nextLine();
            }
            else return username;
        } while (true);
    }

    public static String passwordCheck(String password) {
        Scanner input = new Scanner(System.in);
        do{
            if (!PASS_REGEX.matcher(password).matches()) {
                System.out.println("Your password is not strong enough");
                System.out.print("Enter new password: ");
                password = input.nextLine();
                continue;
            }
            System.out.print("Confirm password: ");
            String recheck = input.nextLine();
            if (recheck.equals(password)) return password;
            else System.out.println("Password does not match.");
        }while (true);
    }

    public static String emailCheck(String email) {
        Scanner input = new Scanner(System.in);
        do {
            if (!EMAIL_REGEX.matcher(email).matches()) {
                System.out.println("Your email is not valid ");
                System.out.print("Enter new email: ");
                email = input.nextLine();
            }
            else return email;
        } while (true);
    }
}
