package Homeworks.HW3_1;

public interface Dog extends Pet{
    void furColor(String a);

    default void power(int w){
        System.out.println("Default power");
    }
}
