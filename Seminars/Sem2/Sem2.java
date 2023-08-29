package Seminars.Sem2;

public class Sem2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Вызов методов makeSound()
        dog.makeSound(); // Выводит "Buddy barks."
        cat.makeSound(); // Выводит "Whiskers meows."
    }
}
