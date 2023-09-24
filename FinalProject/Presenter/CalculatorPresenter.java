package FinalProject.Presenter;

import FinalProject.Logger.CalculatorLogger;
import FinalProject.Model.AdditionOperation;
import FinalProject.Model.CalculatorModel;
import FinalProject.Model.ComplexNumber;
import FinalProject.Model.DivisionOperation;
import FinalProject.Model.MultiplicationOperation;
import FinalProject.Model.Operation;
import FinalProject.Model.SubstractionOperation;
import FinalProject.View.CalculatorView;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }
    public void onButtonClicked() {
        ComplexNumber number1 = new ComplexNumber();
        number1.setRealPart(view.getUserInputReal());
        number1.setImaginaryPart(view.getUserInputImag());

        ComplexNumber number2 = new ComplexNumber();
        number2.setRealPart(view.getUserInputReal());
        number2.setImaginaryPart(view.getUserInputImag());

        char operation = view.getUserOperation();
        ComplexNumber result;
        switch (operation) {
            case '+':
                result = model.add(number1, number2);
                view.displayResult(result.getRealPart(), result.getImaginaryPart());
                CalculatorLogger.write(number1, number2, operation, result);
                break;
            case '-':
                result = model.div(number1, number2);
                view.displayResult(result.getRealPart(), result.getImaginaryPart());
                CalculatorLogger.write(number1, number2, operation, result);
                break;
            case '*':
                result = model.mult(number1, number2);
                view.displayResult(result.getRealPart(), result.getImaginaryPart());
                CalculatorLogger.write(number1, number2, operation, result);
                break;
            case '/':
                result = model.add(number1, number2);
                view.displayResult(result.getRealPart(), result.getImaginaryPart());
                CalculatorLogger.write(number1, number2, operation, result);
                break;
            default:
                System.out.println("Неверная операция");
            }
        
    }
}
