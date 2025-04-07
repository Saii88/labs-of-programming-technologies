class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this();
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public  double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void print() {
        System.out.print(width + " " + height);
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.print("Прямоугольник 1: ");
        rect1.print();
        System.out.println();
        System.out.print("Прямоугольник 2: ");
        rect2.print();
        System.out.println();
        System.out.print("Площадь прямоугольника 1: ");
        System.out.println(rect1.getArea());
        System.out.print("Площадь прямоугольника 2: ");
        System.out.println(rect2.getArea());
        System.out.print("Периметр прямоугольника 1: ");
        System.out.println(rect1.getPerimeter());
        System.out.print("Периметр прямоугольника 2: ");
        System.out.println(rect2.getPerimeter());
    }
}
