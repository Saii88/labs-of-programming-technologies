package task1;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        ArrayList<T> newList = new ArrayList<T>();

        for (T element : list) {
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        return newList;
    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 10 целых чисел: ");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.print("Несовпадающие целые числа равны: ");
        for (int item : newList) {
            System.out.print(item + " ");
        }
    }
}
