package FinalProject.Model;

public class CalculatorModel {
    ComplexNumber result;

    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2){
        AdditionOperation a = new AdditionOperation();
        result = a.calculate(number1, number2);
        return result;
    }
    public ComplexNumber sub(ComplexNumber number1, ComplexNumber number2){
        SubstractionOperation s = new SubstractionOperation();
        result = s.calculate(number1, number2);
        return result;
    }
    public ComplexNumber div(ComplexNumber number1, ComplexNumber number2){
        DivisionOperation d = new DivisionOperation();
        result = d.calculate(number1, number2); 
        return result;
    }
    public ComplexNumber mult(ComplexNumber number1, ComplexNumber number2){
        MultiplicationOperation m = new MultiplicationOperation();
        result = m.calculate(number1, number2);
        return result;
    }
}
