import java.math.BigInteger;

public class Task3 {
    public static void main(String[] args) {
        BigInteger maxValue = BigInteger.valueOf(Long.MAX_VALUE);
        int count = 0;

        BigInteger bigNum = maxValue.sqrt().add(BigInteger.ONE);

        while (count < 10) {
            BigInteger square = bigNum.multiply(bigNum);
            if (square.compareTo(maxValue) > 0) {
                System.out.println(bigNum + "^2 = " + square);
                count++;
                bigNum = bigNum.add(BigInteger.ONE);
            }
        }

    }
}
