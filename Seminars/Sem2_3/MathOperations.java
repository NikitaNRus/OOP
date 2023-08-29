package Seminars.Sem2_3;

public interface MathOperations {
    int add(int a, int b);

    default int subtract(int a, int b) {
        return a - b;
    }
}
