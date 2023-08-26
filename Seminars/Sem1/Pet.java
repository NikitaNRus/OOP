package Seminars.Sem1;

public class Pet {
    private String name;
    private int age;
    // Конструктор класса Pet
    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Гетер для получения имени питомца
    public String getName(){
        return name;
    }
    // Сеттер для установки имени питомца
    public void setName(String name){
        this.name = name;
    }
    // Геттер для получения возраста питомца
    public int getAge(){
        return age;
    }
    // Сеттер для установки возраста питомца
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }
    // Метод для издания звуков
    public void makeSound(){
        System.out.println("The pet makes a sound");
    }
    // Метод вывода инфо о питомце
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


}
