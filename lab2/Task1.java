import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i<50; i++){
            int x = random.nextInt(100);
            System.out.print(x + " ");
        }
}
