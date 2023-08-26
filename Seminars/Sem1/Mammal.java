package Seminars.Sem1;

public class Mammal extends Animal{
    String furColor;

    public Mammal (String name, int age, String furColor ){
        super(name, age);
        this.furColor = furColor;
    }
    @Override
    public void makeSound(){
        System.out.println("The mammal makes a mammal sound");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fur color: " + furColor);
    }
}
