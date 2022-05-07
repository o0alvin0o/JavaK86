package lesson8.act8_2;
//About 22 miliseconds
import java.util.*;

public class ArraylistTest {
    public static void main(String[] args) {
        final int TEST_LIMIT = 10000, MAX_VALUE = 100000, TEST_INDEX = 50000;
        List<Integer> arList = new ArrayList<>();
        for (int i = 0; i < MAX_VALUE; i++) { // initial arrray
            arList.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TEST_LIMIT / 2; i++) {
            arList.remove((int)TEST_INDEX);
        }
        long endTime = System.currentTimeMillis();
        System.out.print("Execute time: " + (endTime - startTime) + "miliseconds" );
    }
}
