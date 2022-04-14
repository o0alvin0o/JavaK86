package lesson2;
// Write a Java program to multiply two given integer numbers without using the multiply operator(*)
import java.util.Scanner;
public class Act2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int result = 0;
        for (int i = 0; i < firstNumber; i++) {
            result += secondNumber;
        }
        System.out.println("Result = " + result);
    }
}
