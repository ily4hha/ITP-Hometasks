package javatasks.week9.Geometry;

public class Ellipse extends Shape{
    double a;
    double b;
    @Override
    double area() {
        return a*b*Math.PI;
    }
    @Override
    double per(){
        return 2*Math.PI*Math.sqrt((a*a+b*b)/2);
    }
}
