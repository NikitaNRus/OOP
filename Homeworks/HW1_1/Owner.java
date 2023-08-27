package Homeworks.HW1_1;

public class Owner extends Cat {
    String name;
    public Owner(String name){
        this.name = name;
    }

    @Override
    public void greet(){
        System.out.println("Мяу! Меня зовут " + getName() + ". Мне " + getAge() + " года(лет). Мой владелец - " + this.name  );
    }
}
