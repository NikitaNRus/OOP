package Seminars.Sem1;

public class Animal {
    String name;
    Integer age;
    /**
     * @param name это имя животного
     * @param age это возраст животного
     */
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    // public Animal(String name){
    //     this.name = name;
    // }
    // public Animal(){
    // }
    public void makeSound(){
        System.out.println("The animal makes a sound: ");
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}