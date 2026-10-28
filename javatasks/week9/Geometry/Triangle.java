package javatasks.week9.Geometry;

public class Triangle extends Shape{
    double a;
    double b;
    double c;
    @Override
    double area() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    double per(){
        return a+b+c;
    }
}
