package Lesson2;
/*	Activity 2.1: Write a simple program to read two number from the keyboard
and display the result of some operations on the screen */
import java.util.Scanner;
public class Act2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();

        System.out.println("Result:");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));

    }
}
