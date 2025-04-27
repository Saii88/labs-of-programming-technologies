package task2;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this(System.currentTimeMillis());
    }

    public MyTime(long elapsedTime) {
        setTime(elapsedTime);
    }

    public MyTime(int hour, int minute, int second) {
        this();
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000; // Переводим миллисекунды в секунды
        second = (int) (totalSeconds % 60);    // Секунды
        long totalMinutes = totalSeconds / 60; // Переводим секунды в минуты
        minute = (int) (totalMinutes % 60);    // Минуты
        long totalHours = totalMinutes / 60;   // Переводим минуты в часы
        hour = (int) (totalHours % 24);       // Часы (в формате 0-23)
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
