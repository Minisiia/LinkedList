package linked_list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть N:");
        int n = scanner.nextInt();
        List<Integer> list = MyLinkedList.getIntegerList(n);
        System.out.println("Заповнений список:");
        for (int temp : list) {
            System.out.println(temp);
        }
        int minElement = MyLinkedList.getMinimum(list);
        System.out.println("Мінімальний елемент списку: " + minElement);


    }
}
