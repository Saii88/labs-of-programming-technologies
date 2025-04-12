public class MyDateClient {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(561555550000L);

        System.out.println("Year1: " + date1.getYear());
        System.out.println("Month1: " + date1.getMonth());
        System.out.println("Day1: " + date1.getDay());
        System.out.println("Year2: " + date2.getYear());
        System.out.println("Month2: " + date2.getMonth());
        System.out.println("Day2: " + date2.getDay());

    }
}
