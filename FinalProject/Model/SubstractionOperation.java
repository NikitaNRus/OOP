package FinalProject.Model;

public class SubstractionOperation extends ComplexNumber implements Operation {
    /**
     * Метод для вычитания двух комплексных чисел
     * @param a Первое комплексное число
     * @param b Второе комплексное число
     * @return Результат вычитания
     */
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() - b.getRealPart();
        double imaginaryPart = a.getImaginaryPart() - b.getImaginaryPart();
        ComplexNumber cn = new ComplexNumber();
        cn.setRealPart(realPart);
        cn.setImaginaryPart(imaginaryPart);
        return cn;
    }
}
