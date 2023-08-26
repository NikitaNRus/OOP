package Seminars.Sem1;

public class Sem1 {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Lion", 12, "Yellow");
        Bird sparrow = new Bird("Sparrow", 2, true);
        lion.makeSound();
        lion.displayInfo();
        sparrow.makeSound();
        sparrow.displayInfo();

        Dog labrador = new Dog("Bubby", 2, "labrador");
        System.out.println("Name: " + labrador.getName());
        System.out.println("Age: " + labrador.getAge());
        // Обновим данные о собаке
        labrador.setName("Max");


        labrador.makeSound();
        labrador.displayInfo();

        // Animal animal1 = new Animal("Pupa", 21);
        // animal1.displayInfo();

        // Animal animal2 = new Animal("Lupa");
        // animal2.displayInfo();

        // Animal animal3 = new Animal();
        // animal3.name = "Jopa";
        // animal3.displayInfo();
    }
}
