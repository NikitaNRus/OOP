package Seminars.Sem6.single;

// public class Calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public void displayResult(int result) {
//         System.out.println("Result: " + result);
//     }
// }

// Нарушает первый принцип Single Responsibility


public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class ResultDisplay {
    public void display(int result) {
        System.out.println("Result: " + result);
    }
}