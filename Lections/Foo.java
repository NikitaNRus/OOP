package Lections;

public class Foo {
    public Integer value;
    private static Integer count = 0;
    
    public Foo(){
        count++;
    }
    public static Integer getCount(){
        return count;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
