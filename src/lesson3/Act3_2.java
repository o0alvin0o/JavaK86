package lesson3;
import java.util.Scanner;
public class Act3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();
        
        // count the time must divided by two
        int quotient = number / 2;
        int times = 1;
        for (int i = 0; ; i++) {
            if (quotient == 0) break;
            times++;
            quotient /= 2;
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
    }
}
