import java.math.BigInteger;

public class Task2 {
    public static void main(String[] args) {
        BigInteger minNumber = BigInteger.TEN.pow(49);

        int count = 0;
        BigInteger current = minNumber;

        System.out.println("Первые 10 50-значных чисел, кратных 2 или 3:");

        while (count < 10) {
            if (current.mod(BigInteger.TWO).equals(BigInteger.ZERO) ||
                    current.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {

                System.out.println((count + 1) + ": " + current);
                count++;
            }
            current = current.add(BigInteger.ONE);
        }

    }
}
