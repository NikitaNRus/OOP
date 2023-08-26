package Lections;
/**
 * Это точка с двумя координатами
 */
public class Point {
    private int x, y; // запретили возможность свободно присваивать значения x и y
    /**
     * 
     * @param valueX Это координата точки X
     * @param valueY Это координата точки Y
     */
    
    
    public Point(int valueX, int valueY){ // добавили конструктор
        x = valueX;
        y = valueY;
    }
    public Point(int Value){
        this(Value, Value);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int value){
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }

    private String getinfo(){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override // переопредилил функцию toString
    public String toString(){
        return getinfo();
    }
    static double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2)+Math.pow(a.getY() - b.getY(), 2));
    }


}
