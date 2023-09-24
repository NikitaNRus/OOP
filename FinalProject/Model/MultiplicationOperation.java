package FinalProject.Model;

public class MultiplicationOperation extends ComplexNumber implements Operation {
    /**
     * Метод для умножения двух комплексных чисел
     * @param a Первое комплексное число
     * @param b Второе комплексное число
     * @return Результат умножения
     */
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart();
        double imaginaryPart =  b.getImaginaryPart()*a.getRealPart() - b.getRealPart()*a.getImaginaryPart();
        ComplexNumber cn = new ComplexNumber();
        cn.setRealPart(realPart);
        cn.setImaginaryPart(imaginaryPart);
        return cn;
    }
}
