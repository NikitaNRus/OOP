package Homeworks.HW1_2;

public class Rectangle {
    Integer width;
    Integer height;
    /**
     * @param width шириина прямоугольника
     * @param height высота прямоугольника
     */
    public Rectangle(Integer width, Integer height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
    }
    // Сеттер для высоты
    public void setWidth(Integer width){
        this.width = width;
    }
    // Сеттер для ширины
    public void setHeight(Integer height){
        this.height = height;
    }
    // Геттер для высоты
    public Integer getWidth(){
        return width;
    }
    // Геттер для ширины
    public Integer getHeight(){
        return height;
    }
    // Расчет площади
    public Integer calculateArea(){
        Integer area = this.width*this.height;
        return area;
    }
    // Расчет периметра
    public Integer calculatePerimeter(){
        Integer perimeter = 2*(this.width + this.height);
        return perimeter;
    }
}
