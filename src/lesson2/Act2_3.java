package lesson2;
/*Activity 2.3: Write a Java program that takes a number as input
and prints its multiplication table up to 10*/
public class Act2_3 {
    public static void main(String[] args) {
        final int START = 2;
        final int END = 9;

        for (int factor = 1; factor <= 9; factor++) {
            for (int i = START; i <= END; i++) {
                System.out.printf("%-2dx %-2d= %-6d", i, factor, factor * i);
            }
            System.out.println();
        }

    }
}
