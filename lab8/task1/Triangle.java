package task1;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "треугольник: сторона1 = " + side1 + " сторона2 = " + side2 +
        " сторона3 = " + side3;
    }
}
