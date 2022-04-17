package lesson3;
/*69400 71650 166000*/
import java.util.Scanner;

public class Act3_3 {
    public static void main(String[] args) {
        int[] price =  {1388, 1433, 1660, 2082, 2324, 2399};
        int[] level = {50, 100, 200, 300, 400};

        double fee;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the electric consumption: ");
        double consumption = input.nextDouble();

        //
        if (consumption <= level[0])
            fee = price[0] * consumption;
        else if (consumption <= level[1])
            fee = price[0] * level[0] + price[1] * (consumption - level[0]);
        else if (consumption <= level[2])
            fee = price[0] * level[0] + price[1] * (level[1] - level[0]) + price[2] * (consumption - level[1]);
        else if (consumption <= level[3])
            fee = price[0] * level[0] + price[1] * (level[1] - level[0]) + price[2] * (level[2] - level[1]) +
                  price[3] * (consumption - level[2]);
        else if (consumption <= level[4])
            fee = price[0] * level[0] + price[1] * (level[1] - level[0]) + price[2] * (level[2] - level[1]) +
                  price[3] * (level[3] - level[2]) + price[4] * (consumption - level[3]);
        else fee = price[0] * level[0] + price[1] * (level[1] - level[0]) + price[2] * (level[2] - level[1]) +
                   price[3] * (level[3] - level[2]) + price[4] * (level[4] - level[3]) + price[5] * (consumption - level[4]);

        System.out.println("Electric bill for " + consumption + " kWh is " + fee + "VND" );
    }
}
