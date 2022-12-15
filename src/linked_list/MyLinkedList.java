package linked_list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyLinkedList {
    public static List<Integer> getIntegerList(int n) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();
        int number = 0;
        for (int i = 0; i < n; i++) {
            number = random.nextInt(100);       // обмеження цілих значень до 100
            list.add(number);
        }
        return list;
    }

    public static int getMinimum(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) min = list.get(i);
        }
        return min;
    }
}
