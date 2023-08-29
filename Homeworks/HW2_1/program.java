package Homeworks.HW2_1;

import java.util.Random;

public class program {
    public static void main(String[] args) {
        Corgi corgi1 = new Corgi();
        Random random = new Random();
        int number = random.nextInt(Corgi.MAX_WEIGHT);
        int w;
        if (number < Corgi.MIN_VALUE){
            w = Animal.weight(number+1);
        }
        else w = Animal.weight(number);
        
        corgi1.corgiWeight(w);
        int power = Dog.Power(w);
        System.out.println("Сила корги равна " + power);
    }
    

}
