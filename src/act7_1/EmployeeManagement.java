package act7_1;

import java.util.ArrayList;

public class EmployeeManagement {
    private ArrayList<Employee> employees;

    public EmployeeManagement(int n) {
        employees = new ArrayList<>(n);
    }

    public int getNumberofEmployees () {
        return employees.size();
    }

    public void pushEmployee(Employee employee) {
        employees.add(employee);
    }

    public void highestPaidEmployee() {
        long maxSalary = employees.get(0).calculateSalary(); //Assume that first employee is the highest
        int maxIndex = 0;
        for (int i = 1; i < employees.size(); i ++) {
            if (employees.get(i).calculateSalary() > maxSalary) {
                maxSalary = employees.get(i).calculateSalary();
                maxIndex = i;
            }
        }
        String result = employees.get(maxIndex).getName() + " has the highest salary with "
                + maxSalary + " VND/month.";
        System.out.print(result);
    }

    public void lowestPaidEmployee() {
        long minSalary = employees.get(0).calculateSalary(); //Assume that first employee is the lowes
        int minIndex = 0;
        for (int i = 1; i < employees.size(); i ++) {
            if (employees.get(i).calculateSalary() < minSalary) {
                minSalary = employees.get(i).calculateSalary();
                minIndex = i;
            }
        }
        String result = employees.get(minIndex).getName() + " has the lowest salary with "
                + minSalary + " VND/month.";
        System.out.print(result);
    }
}
