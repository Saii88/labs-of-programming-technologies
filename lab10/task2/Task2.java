package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Введите пять целых чисел для списка1: ");
        for (int i = 0; i < 5; i++) list1.add(input.nextInt());
        System.out.print("Введите пять целых чисел для списка2: ");
        for (int i = 0; i < 5; i++) list2.add(input.nextInt());

        ArrayList<Integer> union = union(list1, list2);
        printList(union);
    }

    private static void printList(ArrayList<Integer> list) {
        System.out.print("Объединенный список равен ");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>();
        union.addAll(list1);
        union.addAll(list2);
        return union;
    }
}
