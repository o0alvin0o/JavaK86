package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Act4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter array 1
        System.out.print("Enter first list length: ");
        int length = input.nextInt();
        int[] array1 = new int[length];
        System.out.print("Enter list: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        // Enter array 2
        System.out.print("Enter second list length: ");
        length = input.nextInt();
        int[] array2 = new int[length];
        System.out.print("Enter list: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        int[] mergeArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergeArray[i] = array1[i];
        }

        for (int i = array1.length; i < mergeArray.length; i++) {
            mergeArray[i] = array2[i - array1.length];
        }
        //sort the merge array
        for (int i = 0; i < mergeArray.length - 1; i++) {
            int min = mergeArray[i];
            int minIndex = i;
            for (int j = i + 1; j < mergeArray.length; j++) {
                if (mergeArray[j] < min) {
                    min = mergeArray[j];
                    minIndex = j;
                }
            }
            // swap i and j index
            if (i != minIndex) {
                mergeArray[minIndex] = mergeArray[i];
                mergeArray[i] = min;
            }
        }
        System.out.print(Arrays.toString(mergeArray));

    }
}
