package Homeworks.HW2_1;

public interface Dog extends Pet{
    void furColor(String a);

    default int Power(int w){
        return w*10;
    }
}
