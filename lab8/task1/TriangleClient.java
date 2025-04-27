package task1;

import java.util.Scanner;

public class TriangleClient {
    public static void main(String[] args) {

        double[] sides = DoubleValues(3);
        Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
        String color = StringValue("Введите цвет: ");
        boolean isFilled = BooleanValue();
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        System.out.println("площадь: " + triangle.getArea());
        System.out.println("периметр: " + triangle.getPerimeter());
        System.out.println("цвет: " + triangle.getColor());
        System.out.println(triangle.toString());
    }

    private static boolean BooleanValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите [T]rue' для заливки или [F]alse для без заливки: ");
        return scanner.nextLine().toUpperCase().charAt(0) == 'T';
    }

    private static String StringValue(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static double[] DoubleValues(int size) {
        double[] values = new double[size];
        boolean valid;
        do {
            valid = true;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите " + size + " значения сторон: ");
            for (int i = 0; i < size; i++) {
                if (scanner.hasNextDouble()) {
                    values[i] = scanner.nextDouble();
                } else {
                    System.out.println("Одно или несколько входных значений являются недопустимыми.\n" +
                            "Попробуйте снова.");
                    valid = false;
                    break;
                }
            }
        } while (!valid);
        return values;
    }
}
