package Homeworks.HW3_1;

public class Corgi implements Dog {
    String name;
    public Corgi(){
    }
    public String getName(){
        return name;
    }


    public void corgiWeight(int w){
        System.out.println("This corgi weights " + w + " kilo");
    }

    @Override
    public void makeSound(){
        System.out.println("Corgi barks.");
    }

    @Override
    public Boolean liveAtHome(){
        return true;
    }

    @Override
    public void furColor(String a){
        System.out.println("Corgi has " + a + " fur color");
    }    
    @Override
    public String toString() {
        return name;
    }
}