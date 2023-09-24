package FinalProject.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import FinalProject.Model.ComplexNumber;


public class CalculatorLogger {
    private static CalculatorLogger calculatorLogger;

    private static Logger logger;

    private CalculatorLogger() {
        String logpath = "log.txt";
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(logpath, true);
            fileHandler.setEncoding("UTF-8");
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static CalculatorLogger getInstance() {
        if (calculatorLogger == null) {
            calculatorLogger = new CalculatorLogger();
        }
        return calculatorLogger;
    }

    public void log(String message) {
        logger.info(message);
    }

    public void close() {
        logger.getHandlers()[0].close();
    }

    public static void write(ComplexNumber number1, ComplexNumber number2, char operation, ComplexNumber result){
        CalculatorLogger.getInstance().log("(Число 1: " + "Мнимая часть: " + number1.getRealPart()    
        +  " Действительная часть: " + number1.getImaginaryPart()+") " 
        + "Операция: " + operation + 
        " (Число 2: " + "Мнимая часть: " + number2.getRealPart() 
        +  " Действительная часть: " + number2.getImaginaryPart()+") " 
        + "Результат: " + "Мнимая часть: "+ result.getRealPart() + " Действительная часть: " +  result.getImaginaryPart());
    }
}
