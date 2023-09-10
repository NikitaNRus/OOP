package Homeworks.HW4_2;

import java.util.List;

public class Array <T> {
    public void printArray(List<T> list){
        for (T item: list){
            System.out.println(item);
        }
    System.out.println("Конец списка");
    }


    public static void main(String[] args) {
        Array <Integer> intArray = new Array<>();
        Array <String> strArray = new Array<>();
        List<Integer> intArr = List.of(1,2,3,4,5,6);
        List<String> strArr = List.of("hi", "by", "my");
        
        intArray.printArray(intArr);
        strArray.printArray(strArr);
    }
}
