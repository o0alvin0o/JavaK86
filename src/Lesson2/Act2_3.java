package Lesson2;
/*Activity 2.3: Write a Java program that takes a number as input
and prints its multiplication table up to 10*/
import java.util.Scanner;
public class Act2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-2dx %-2d = %-2d\n", number, i, number * i);
        }
    }
}
