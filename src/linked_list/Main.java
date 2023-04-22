package linked_list;

import java.util.List;

/**
 * Завдання 3
 * Мінімальне з N чисел (використовувати LinkedList):
 * 1. Введіть із клавіатури число N.
 * 2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
 * 3. Знайти мінімальне число серед елементів списку – метод getMinimum.
 */

public class Main {
    public static void main(String[] args) {
        int n = ListHandler.enterNumber();

        List<Integer> list = ListHandler.getIntegerListWithLambda(n);
        System.out.println("Filled list:");
        ListHandler.printList(list);

        System.out.println("Min element With Collections: " + ListHandler.getMinimumWithCollections(list));
        System.out.println("Min element With Stream API: " + ListHandler.getMinimumStream(list));
        System.out.println("Min element With Priority Queue: " + ListHandler.getMinimumWithPriorityQueue(list));
        System.out.println("Min element With Sorting: " + ListHandler.getMinimumWithSorting(list));
        System.out.println("Min element With Reduce: " + ListHandler.getMinimumWithReduce(list));
    }
}
