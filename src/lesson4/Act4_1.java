package lesson4;

import java.util.Arrays;

public class Act4_1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 7, 8};

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
