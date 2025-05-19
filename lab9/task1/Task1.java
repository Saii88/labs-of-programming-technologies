package task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> maxRows = new ArrayList<>();
        int maxRowCount = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxRowCount) {
                maxRowCount = count;
                maxRows.clear();
                maxRows.add(i);
            } else if (count == maxRowCount) {
                maxRows.add(i);
            }
        }

        ArrayList<Integer> maxCols = new ArrayList<>();
        int maxColCount = -1;

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxColCount) {
                maxColCount = count;
                maxCols.clear();
                maxCols.add(j);
            } else if (count == maxColCount) {
                maxCols.add(j);
            }
        }


        System.out.print("Индекс строчки с наибольшим кол-вом единиц: ");
        for (int i = 0; i < maxRows.size(); i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(maxRows.get(i));
        }

        System.out.print("Индекс столбца с наибольшим кол-вом единиц: ");
        for (int i = 0; i < maxCols.size(); i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(maxCols.get(i));
        }
        System.out.println();
    }
}
