package task1;

import java.util.Scanner;

public class TriangleClient {
    public static void main(String[] args) {
        Triangle triangle = createUserTriangle();
        System.out.println(triangle);
    }

    private static Triangle createUserTriangle() {
        double[] sides = promptDoubleValues(3);
        String color = promptStringValue("Введите цвет: ");
        boolean isFilled = promptBooleanValue();
        Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        return triangle;
    }

    private static boolean promptBooleanValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите [T]rue' для заливки или [F]alse для без заливки: ");
        return scanner.nextLine().toUpperCase().charAt(0) == 'T';
    }

    private static String promptStringValue(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static double[] promptDoubleValues(int size) {
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
