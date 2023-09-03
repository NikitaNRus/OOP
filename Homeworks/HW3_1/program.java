package Homeworks.HW3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        Corgi corgi1 = new Corgi();
        Corgi corgi2 = new Corgi();
        Corgi corgi3 = new Corgi();

        corgi1.name = "Floppy";
        corgi2.name = "Duppy";
        corgi3.name = "Bobby";

        List <Corgi> corgiList = new ArrayList<Corgi>();
        corgiList.add(corgi1);
        corgiList.add(corgi2);
        corgiList.add(corgi3);


        // Получаем имя корги по номеру его нахождения в списке
        Finder finder = (i, array) -> {
                Object corgiName = array.get(i);
                return ((Corgi) corgiName).getName();
            };
        Integer numToFind = 1;
        System.out.println("Имя щеночка корги под номером " + numToFind + " - " + finder.findByName(numToFind, corgiList));

        // Создаем компаратор для сортировки по имени корги в алфавитном порядке
        Comparator<Corgi> nameComparator = Comparator.comparing(corgi -> corgi.name);

        // Сортируем список с помощью нового компаратора
        Collections.sort(corgiList, nameComparator);

        System.out.println("\nAfter sorting by name (alphabetical):");
        for (Corgi corgi : corgiList) {
            System.out.println(corgi);
        }
    }
}
