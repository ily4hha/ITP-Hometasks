package javatasks.week9.Geometry;

public class Square extends Shape{
    double a;
    @Override
    double area(){
        return a*a;
    }
    @Override
    double per(){
        return a*4;
    }
}
