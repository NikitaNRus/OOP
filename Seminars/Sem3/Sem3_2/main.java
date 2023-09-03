package Seminars.Sem3.Sem3_2;

public class main {
    public static void main(String[] args) {
        MyParamValue myParamValue = (n) -> 10.0/n;
        System.out.println(myParamValue.getValue(5.0));

        MyDoubleParamValue myDoubleParamValue = (val1, val2, val3) -> (val1 + val2)/val3;
        MyDoubleParamValue myDoubleParamValue2 = (x,y,z) -> x + y + z;
        System.out.println("Значения myDoubleParamValue: " + myDoubleParamValue.getValue(2, 1, 3));
        System.out.println("Значения myDoubleParamValue2: " + myDoubleParamValue2.getValue(5, 5, 2));
    }
}
