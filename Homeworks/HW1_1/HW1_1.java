package Homeworks.HW1_1;

public class HW1_1 {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.setName("Cherry");
        kitty.setAge(3);
        kitty.greet();

        Owner kitty2 = new Owner("Bob");
        kitty2.setName("Buffy");
        kitty2.setAge(2);
        kitty2.greet();
    }
}
