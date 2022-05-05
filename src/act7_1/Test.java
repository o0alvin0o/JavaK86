package act7_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = consoleInput.nextInt(); // n stand for number of employees
        EmployeeManagement manager1 = new EmployeeManagement(n); // construct a management object
        // Gathering information
        System.out.println("Enter information for employees.");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter F for Full-time or P for Part-time: ");
            String check = consoleInput.next();
            consoleInput.nextLine(); // gather left over /r/n
            boolean isFullTime = true;
            if (check.equals("P")) isFullTime = false;
            System.out.print("Name: ");
            String name = consoleInput.nextLine();
            System.out.print("Age: ");
            int age = consoleInput.nextInt();
            System.out.print("ID: ");
            String id = consoleInput.next();
            consoleInput.nextLine(); // gather left over /r/n
            if (isFullTime) manager1.pushEmployee(new FulltimeEmployee(name, age, id));
            else manager1.pushEmployee(new ParttimeEmployee(name, age, id));
            System.out.println(n - 1 - i + " employees lefts");
            if (i == n - 1) System.out.println("Done!");
        }

        manager1.printAllEmployeeInfor();
        manager1.highestPaidEmployee();
        manager1.lowestPaidEmployee();

    }
}
