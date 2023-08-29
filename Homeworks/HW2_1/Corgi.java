package Homeworks.HW2_1;


public class Corgi implements Dog {

    public Corgi(){
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
    
}
