package javatasks.week9.Geometry;

public class Main {
    public static void main(String[] args) {
        Circle circ = new Circle();
        circ.r = 1;
        Ellipse ell = new Ellipse();
        ell.a =1;
        ell.b =1;
        Rectangle rec = new Rectangle();
        rec.a = 3;
        rec.b = 4;
        Square sq = new Square();
        sq.a = 5;
        Triangle tri = new Triangle();
        tri.a = 3;
        tri.b = 4;
        tri.c = 5;
        Shape[] shapes = {circ, ell, rec, sq, tri};
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName()
                + ": area = " + shape.area()
                + ", per = " + shape.per());
}
    }
}
