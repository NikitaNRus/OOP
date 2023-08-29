package Seminars.Sem2_2;

public class Dog implements Pet{
    @Override
    public void makeSound() {
    System.out.println("The dog barks.");
    }

    @Override
    public void play() {
    System.out.println("The dog plays fetch.");
    }
}
