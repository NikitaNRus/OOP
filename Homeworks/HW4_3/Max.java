package Homeworks.HW4_3;

import Seminars.Sem4.Container;

public class Max <T extends Comparable<T>> {
    private T firstValue;
    private T secondValue;

    public Max(T first, T second) {
        this.firstValue = first;
        this.secondValue = second;
    }

    public T getMax(){
        return this.firstValue.compareTo(this.secondValue) >= 0 ? firstValue : secondValue;
    }

    public static void main(String[] args) {
        Max <Integer> intData= new Max<>(10,12);
        Max<Double> doubleData = new Max<>(12.4, 9.123);
 
        System.out.println(intData.getMax());
        System.out.println(doubleData.getMax());
    }
}
