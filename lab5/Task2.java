import java.math.BigInteger;

public class Task2 {
    public static void main(String[] args) {
        BigInteger two = new BigInteger("2");
        BigInteger mersennePrime;
        System.out.println("p     2^p - 1");
        for (int i = 2; i <= 100; i++) {
            mersennePrime = two.pow(i).subtract(BigInteger.ONE);
            System.out.printf("%-3d  %s%n", i, mersennePrime.toString());
        }
    }
}
