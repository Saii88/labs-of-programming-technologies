import java.math.BigInteger;

public class Task1 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(Long.toString(Long.MAX_VALUE));
        for (int i = 0; i < 5; i++) {
            bigInteger = bigInteger.nextProbablePrime();
            System.out.println(bigInteger.toString());
        }
    }
}
