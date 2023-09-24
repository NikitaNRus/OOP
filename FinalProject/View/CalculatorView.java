package FinalProject.View;
import java.util.Scanner;

import FinalProject.Model.ComplexNumber;

public class CalculatorView {
    public void displayResult(double realPart, double imaginaryPart) {
        if (imaginaryPart >=0){
            System.out.println("Результат: " + realPart + " + " + imaginaryPart + "i");
        }
        else {System.out.println("Результат: " + realPart + " " + imaginaryPart + "i");}   
    }

    public double getUserInputReal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действительную часть комплексного числа: ");
        double input = scanner.nextDouble();
        return input;
    }
    public double getUserInputImag() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите мнимую часть комплексного числа: ");
        double input = scanner.nextDouble();
        return input;
    }

    public char getUserOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию +, -, / или *: ");
        char input = scanner.next().charAt(0);
        return input;
    }
}
