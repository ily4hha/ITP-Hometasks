package javatasks.week9.Geometry;

public class Rectangle extends Shape{
    double a;
    double b;
    @Override
    double area(){
        return a*b;
    }
    @Override
    double per(){
        return (a+b)*2;
    }
}
