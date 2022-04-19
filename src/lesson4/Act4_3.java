package lesson4;
import java.util.Arrays;
public class Act4_3 {
    public static void main(String[] args) {
        int[] list = {49, 1, 2, 200, 2, 3, 4, 5, 8, 9, 10};
        int index = 0;
        int maxCount = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] == list[j - 1] + 1) count++;
                else break;
            }
            if (count > maxCount) {
                index = i;
                maxCount = count;
            }
        }
        System.out.print("The longest length of sequence is " + maxCount + ": ");
        for (int i = index; i < index + maxCount ; i++) {
            System.out.print(list[i]);
            if (i == index + maxCount - 1) System.out.print(".");
            else System.out.print(", ");
        }
        System.out.println();
        //another way use copy array
        System.out.println("Another way: ");
        int[] longestSequence = Arrays.copyOfRange(list, index, index + maxCount);
        System.out.print(Arrays.toString(longestSequence));
    }
}
