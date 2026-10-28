package javatasks.week9.Geometry;

public class Circle extends Shape{
    double r;
    @Override
    double area() {
        return Math.PI*r*r;
    }
    @Override
    double per() {
        return 2*Math.PI*r;
    }

}
