package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            charList.add(s.charAt(i));
        }
        return charList;
    }
    public static void binPacking() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество предметов: ");
        int n = scanner.nextInt();
        ArrayList<Integer> weights = new ArrayList<>();
        System.out.print("Введите вес каждого предмета: ");
        for (int i = 0; i < n; i++) {
            weights.add(scanner.nextInt());
        }
        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
        containers.add(new ArrayList<>());
        for (int weight : weights) {
            boolean placed = false;
            for (ArrayList<Integer> container : containers) {
                int currentWeight = container.stream().mapToInt(Integer::intValue).sum();
                if (currentWeight + weight <= 10) {
                    container.add(weight);
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                ArrayList<Integer> newContainer = new ArrayList<>();
                newContainer.add(weight);
                containers.add(newContainer);
            }
        }
        for (int i = 0; i < containers.size(); i++) {
            System.out.print("Контейнер " + (i + 1) + " содержит предметы с весом: ");
            for (int w : containers.get(i)) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Тест toCharacterArray");
        String testString = "abc";
        ArrayList<Character> charList = toCharacterArray(testString);
        System.out.println("Символы строки \"" + testString + "\": " + charList);
        System.out.println("\nЗадача об упаковке в контейнеры");
        binPacking();
    }
}
