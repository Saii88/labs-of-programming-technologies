package task1;

import java.util.Scanner;

public class LocationClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строчек и столбцов: ");

        int x = in.nextInt();
        int y = in.nextInt();
        Location location = new Location(x, y);
        double[][] array = new double[x][y];

        System.out.println("Введите массив: ");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = in.nextInt();

            }
        }
        location.locatedLargest(array);
    }
}
