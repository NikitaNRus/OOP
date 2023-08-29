package Seminars.Sem2_2;

public class program {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Использование методов из интерфейсов
        dog.makeSound(); // Вывод: The dog barks.
        dog.play(); // Вывод: The dog plays fetch.

        cat.makeSound(); // Вывод: The cat meows.
    }
}
