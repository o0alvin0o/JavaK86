package lesson2;
/*Write a Java program that accepts an integer (n)
and computes the value of n + nn + nnn */
import java.util.Scanner;
public class Act2_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = input.nextInt();
        int number2 = number * 10 + number;
        int number3 = number * 100 + number2;
        int result = number + number2 + number3;
        System.out.println("Result: " + number + " + " + number + number
                            + " + " + number + number + number + " = " + result
        );
        // Another method for general case. Adjust the TIMES for your case
        // In this exercise TIMES = 3 for n + nn + nnn
        final int TIMES = 3;
        Cal(number,TIMES);
    }

    public static void Cal(int number, int TIMES) {
        int[] listOfNumber =  new int[TIMES];
        int sum = 0;
        listOfNumber[0] = number;
        //construct list of number
        for (int i = 1; i < listOfNumber.length; i++) {
            listOfNumber[i] = number * (int)Math.pow(10, i) + listOfNumber[i-1];
        }

        System.out.print("Result: ");
        // Evaluate the sum of list and print the r
        for (int i = 0; i < listOfNumber.length; i++) {
            System.out.print(listOfNumber[i]);
            sum += listOfNumber[i];
            if (i != listOfNumber.length - 1) System.out.print(" + ");
            else System.out.print(" = " + sum);
        }
    }
}
