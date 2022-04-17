package lesson3;
import java.util.Scanner;
public class Act3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fibonacci length: ");
        int length = input.nextInt();

        int[] fibonacci = new int[length];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i]);
            if (i == fibonacci.length - 1) System.out.print(".");
            else System.out.print(", ");
        }
    }
}
