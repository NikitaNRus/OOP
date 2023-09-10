package Seminars.Sem4_6;

import java.util.List;

public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
        }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> stringList = List.of("Привет", "Мир");

        printList(intList); // Вывод: 1 2 3
        printList(stringList); // Вывод: Привет Мир
    }
}