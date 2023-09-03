package Seminars.Sem3.Sem3_3;

public class main {
    public static void main(String[] args) {
        MyParamValue myParamValue = (val) -> {
            for (int i = 0; i <val; i ++){
                System.out.println(val);
            }
            return val + 10;
        };
        System.out.println(myParamValue.getValue(10));
    }
}
