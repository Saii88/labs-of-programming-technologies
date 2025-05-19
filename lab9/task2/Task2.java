package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел: ");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
