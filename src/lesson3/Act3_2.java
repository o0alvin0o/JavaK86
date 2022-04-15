package lesson3;
import java.util.Scanner;
public class Act3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();
        
        // count the time must divided by two
        int quotient = number;
        int times = 0;
        for (int i = 0;quotient != 0 ; i++) {
            quotient /= 2;
            times++;
        }
        
        // print the remainder in reverse order
        System.out.print("Binary value is: ");
        quotient = number;
        int count = 0;
        while (times > 0) {
            if (count == times - 1) {
                System.out.print(quotient % 2);
                quotient = number;
                times--;
                count = 0;
            }
            else {
                quotient /= 2;
                count++;
            }
        }
        System.out.println();

        // Another way with array
        toBinary(number);
    }

    public static void toBinary(int number) {

        int quotient = number;
        int times = 0;
        for (int i = 0;quotient != 0 ; i++) {
            quotient /= 2;
            times++;
        }

        int[] binaryInReverseOrder = new int[times];
        quotient = number;
        for (int i = 0; i < binaryInReverseOrder.length; i++) {
            binaryInReverseOrder[i] = quotient % 2;
            quotient /= 2;
        }

        // print the result
        System.out.print("Binary value is(solved by array): ");
        for (int i = binaryInReverseOrder.length - 1; i >= 0; i--) {
            System.out.print(binaryInReverseOrder[i]);
        }


    }
}
