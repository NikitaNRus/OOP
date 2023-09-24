package FinalProject.Model;

public class DivisionOperation extends ComplexNumber implements Operation{
    /**
     * Метод для делит два комплексных числа
     * @param a Первое комплексное число
     * @param b Второе комплексное число
     * @return Результат деления
     */
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        if (b.getImaginaryPart() == 0 || b.getRealPart() == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        double ar =a.getRealPart();
        double ai =a.getImaginaryPart();
        double br =b.getRealPart();
        double bi =b.getImaginaryPart();

        double realPart = (ar*br + ai+bi)/(br*br + bi*bi);
        double imaginaryPart = (ai*br - ar*bi)/(br*br + bi*bi);
        ComplexNumber cn = new ComplexNumber();
        cn.setRealPart(realPart);
        cn.setImaginaryPart(imaginaryPart);
        return cn;
    }
}
