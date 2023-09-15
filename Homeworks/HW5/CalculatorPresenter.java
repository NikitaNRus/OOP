package Homeworks.HW5;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.add(number1, number2);
        int result = model.getResult();

        view.displayResult(result);
    }
}