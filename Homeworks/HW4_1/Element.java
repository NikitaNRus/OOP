package Homeworks.HW4_1;

public class Element<T> {
    private T item;
    
    public Element(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printElement(){
        System.out.println(this.item);
    }

    public static void main(String[] args) {
        Element<Integer> intElement = new Element<>(102);
        Element<String> stringElement = new Element<>("Привет, мир!");
        Element<Double> doubleElement = new Element<>(3.14);

        intElement.printElement(); // Вывод: 102
        stringElement.printElement(); // Вывод: Привет, мир!
        doubleElement.printElement(); // Вывод: 3.14
    }
}