package Homeworks.HW1_1;

public class Cat {
    private String name;
    private Integer age;
    /**
     * @param name имя кота
     * @param age возраст кота
     */
    // Сеттер для имени кота
    public void setName(String name){
        this.name = name;
    }
    // Сеттер для возраста кота
    public void setAge(Integer age){
        this.age = age;
    }
    // Геттер для имени кота
    public String getName(){
        return name;
    }
    // Геттер для возраста кота
    public Integer getAge(){
        return age;
    }
    // Метод для приветствия
    public void greet(){
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет)" );
    }

}
