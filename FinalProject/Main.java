package FinalProject;

import FinalProject.Logger.CalculatorLogger;
import FinalProject.Model.CalculatorModel;
import FinalProject.Presenter.CalculatorPresenter;
import FinalProject.View.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
        presenter.onButtonClicked();
        CalculatorLogger.getInstance().close();
    }
}
