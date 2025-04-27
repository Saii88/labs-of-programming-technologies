package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getIntegerList();
        Integer max = max(list);
        System.out.println("Max = " + max);
    }

    private static ArrayList<Integer> getIntegerList() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел, заканчивающуюся на 0: ");
        int next = scanner.nextInt();
        while (next != 0) {
            list.add(next);
            next = scanner.nextInt();
        }
        return list;
    }

    public static Integer max(ArrayList<Integer> list) {
        return list.isEmpty() ? null : Collections.max(list);
    }
}
