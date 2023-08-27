package Homeworks.HW1_2;

public class HW1_2 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(12,5);
        rec1.setWidth(2);
        System.out.println("площадь фигуры равна: " + rec1.calculateArea());
        System.out.println("периметр фигуры равен: " + rec1.calculatePerimeter());        
    }
    
}
