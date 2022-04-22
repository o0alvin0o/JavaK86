package lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class Act5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManagement manager = new StudentManagement();
        do {
            System.out.print("Enter name: ");
            String name = input.next();
            if (name.equals("OK")) break;
            System.out.print("Enter gpa: ");
            double gpa = input.nextDouble();
            manager.push(new Student(name,gpa));
            System.out.println("======");
        } while (true);
        System.out.println("=======================");
        manager.highestGPA();
        manager.lowestGPA();
        System.out.println("Pass: " + manager.noPassedStudent() + " students");
        System.out.println("Failed: " + manager.noFailedStudent() + " students");
    }
}

class Student {
    private String name;
    private double gpa;

    public Student() {}
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public void setGpa(double newGpa) {
        gpa = newGpa;
    }
    public double getGpa() {
        return gpa;
    }

    public boolean isPass() {
        return gpa >= 1.5;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
    public void printGpa() {
        System.out.println("GPA: " + gpa);
    }
}

class StudentManagement {
    private ArrayList<Student> list = new ArrayList<>();

    public void push(Student student) {
        list.add(student);
    }

    public int noPassedStudent() {
        int count = 0;
        for (Student student : list) {
            if (student.isPass()) count++;
        }
        return count;
    }

    public int noFailedStudent() {
        int count = 0;
        for (Student student : list) {
            if (!student.isPass()) count ++;
        }
        return count;
    }

    public void highestGPA() {
        double max = list.get(0).getGpa();
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i).getGpa()) {
                max = list.get(i).getGpa();
                index = i;
            }
        }
        System.out.println("The highest GPA is: ");
        list.get(index).printName();
        list.get(index).printGpa();
    }

    public void lowestGPA() {
        double min = list.get(0).getGpa();
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i).getGpa()) {
                min = list.get(i).getGpa();
                index = i;
            }
        }
        System.out.println("The lowest GPA is: ");
        list.get(index).printName();
        list.get(index).printGpa();
    }
}
