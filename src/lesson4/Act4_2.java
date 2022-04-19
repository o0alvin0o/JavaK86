package lesson4;

import java.util.Arrays;

public class Act4_2 {
    public static void main(String[] args) {
        int[] list = {20, 20, 30, 40, 50, 50, 50};
        int count = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > 0) count++;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) list[j] = -1;
            }
        }

        int[] newList = new int[count];
        int times = 0;
        int i = 0;
        while (times < count) {
            if (list[i] < 0) {
                i++;
                continue;
            }
            newList[times] = list[i];
            times++;
            i++;
        }
        System.out.print(Arrays.toString(newList));
    }
}
