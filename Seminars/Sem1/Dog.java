package Seminars.Sem1;

public class Dog extends Pet {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    // геттер для получения породы собаки
    public String getBreed(){
        return breed;
    }
    // Сеттер для установки породы собаки
    public void setBreed(String breed){
        this.breed = breed;
    }
    @Override
    public void makeSound(){
        System.out.println("The dog barks");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Breed: " + breed);
        
    }
}
