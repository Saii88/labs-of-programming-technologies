package task3;

import task1.Circle;
import task1.Triangle;
import java.util.ArrayList;
import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        String string1 = "Hello";
        list1.add(new Triangle(3, 4, 5));
        list1.add(new Date());
        list1.add(string1);
        list1.add(new Circle(3));
        for (Object object : list1) {
            System.out.println();
            System.out.println(object);
        }
    }
}
