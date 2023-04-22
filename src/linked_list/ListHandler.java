package linked_list;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListHandler {
    public static List<Integer> getIntegerList(int n) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100)); // обмеження цілих значень до 100
        }
        return list;
    }

    public static List<Integer> getIntegerListWithLambda(int n) {
        return Stream.generate(() -> (int) (Math.random() * 100))
                .limit(n)
                .collect(Collectors.toList());
    }

    public static int getMinimumWithCollections(List<Integer> list) {
        return Collections.min(list);
    }

    public static int getMinimumStream(List<Integer> list) {
        return list.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new NoSuchElementException("List is empty"));
    }

    public static int getMinimumWithPriorityQueue(List<Integer> list) {
        Queue<Integer> queue = new PriorityQueue<>(list);
        Integer element = queue.poll();
        if (element != null) {
            return element;
        } else {
            throw new NoSuchElementException("List is empty");
        }
    }

    public static int getMinimumWithSorting(List<Integer> list) {
        return list.stream()
                .sorted()
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("List is empty"));
    }

    public static int getMinimumWithReduce(List<Integer> list) {
        return list.stream().reduce(Integer.MAX_VALUE, Integer::min);
    }




    public static void printList(List<Integer> stringList) {
        for (Integer temp : stringList) {
            System.out.print(temp + " ");
        }
        System.out.println("\n");
    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        return scanner.nextInt();
    }
}
