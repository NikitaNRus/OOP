package Lections;

public class L1 {
    public static void main(String[] args) {
        Point a = new Point(0,2);
        a.setX(12);

        // если не создали конструктор, то a.x = 0; a.y = 2;, а в скобочках ничего нет
        System.out.println(a); // работает нормально, так как описан метод toString @Override
        
        Point b = new Point(10);
        System.out.println(b.toString()); // работает нормально, так как описан метод toString @Override

        var dis = Point.distance(a, b);
        System.out.println(dis);

    }
    
}