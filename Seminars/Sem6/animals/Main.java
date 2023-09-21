package Seminars.Sem6.animals;

/**
* Главный класс для демонстрации работы с животными.
*/
public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Бобик");
        Animal cat = new Cat("Мурзик");

        System.out.println(dog.name + " говорит: " + dog.makeSound());
        System.out.println(cat.name + " говорит: " + cat.makeSound());
    }
}
