import java.util.GregorianCalendar;

public class Task2 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.print(calendar.get(GregorianCalendar.YEAR) + " ");
        System.out.print(calendar.get(GregorianCalendar.MONTH + 1) + " ");
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
        long time = 123456789875L;
        calendar.setTimeInMillis(time);
        System.out.print(calendar.get(GregorianCalendar.YEAR) + " ");
        System.out.print(calendar.get(GregorianCalendar.MONTH) + " ");
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
