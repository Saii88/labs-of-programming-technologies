public class MyTimeClient {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000);
        MyTime time3 = new MyTime(5, 23, 55);

        System.out.println("Текущее время (GMT): " + time1);
        System.out.println("Время 555550000 мс: " + time2);
        System.out.println("Время 5:23:55: " + time3);
    }
}
