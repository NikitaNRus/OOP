package Homeworks.HW5;

import java.util.Scanner;

public class CalculatorView {
    public void displayResult(int result) {
        System.out.println("Результат: " + result);
    }

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = scanner.nextInt();
        return input;
    }
}