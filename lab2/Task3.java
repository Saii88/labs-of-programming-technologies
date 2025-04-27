import static java.lang.System.currentTimeMillis;

class StopWatch {
    private static long startTime;
    private static long endTime;

    public StopWatch () {
        startTime = currentTimeMillis();
    }

    public static long getStartTime() {
        return startTime;
    }

    public static long getEndTime() {
        return endTime;
    }

    public long start() {
        return startTime = currentTimeMillis();
    }

    public long stop() {
        return endTime = System.currentTimeMillis();
    }

    public static long getElapsedTime() {
        return endTime - startTime;
    }
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int minInd = i;
            int min = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    minInd = j;
                    min = list[j];
                }
            }
            list[minInd] = list[i];
            list[i] = min;
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();

        int[] list = new int [100000];

        for (int i = 0; i < list.length - 1; i++) {
            list[i] = (int) (Math.random() * 100000);

        }


        time.start();
       System.out.println(time.getStartTime());
       time.selectionSort(list);
       time.stop();
       System.out.println(time.getEndTime());

        System.out.println("\n Время прошло в миллисекундах " + time.getElapsedTime());

    }
}
