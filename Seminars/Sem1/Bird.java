package Seminars.Sem1;

public class Bird extends Animal {
    boolean canFly;

    public Bird(String name, int age, boolean canFly){
        super(name,age);
        this.canFly = canFly;
    }
    @Override
    public void makeSound(){
        System.out.println("The bird makes a chirping sound");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Can fly: " + canFly);
    }
}
