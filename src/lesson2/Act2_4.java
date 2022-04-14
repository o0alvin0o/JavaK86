package lesson2;
//Write a Java program to input a number n,
// print to screen the sum and average of 1-n.
import java.util.Scanner;

public class Act2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Cal sum
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (float)sum / number);
    }



}
