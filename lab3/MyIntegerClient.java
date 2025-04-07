public class MyIntegerClient {
    public static void main(String[] args) {
        MyInteger myInt1 = new MyInteger(5);
        MyInteger myInt2 = new MyInteger(12);

        System.out.println("myInt1 четное? " + myInt1.isEven());
        System.out.println("myInt1 нечетное? " + myInt1.isOdd());
        System.out.println("myInt1 простое? " + myInt1.isPrime());
        System.out.println("myInt2 четное? " + myInt2.isEven());
        System.out.println("myInt2 нечетное? " + myInt2.isOdd());
        System.out.println("myInt2 простое? " + myInt2.isPrime());
        System.out.println("16 четное? " + MyInteger.isEven(16));
        System.out.println("16 нечетное? " + MyInteger.isOdd(16));
        System.out.println("16 простое? " + MyInteger.isPrime(16));
        System.out.println("myInt1 равно 7? " + myInt1.equals(7));
        System.out.println("myInt1 равно myInt2? " + myInt1.equals(myInt2));

        char[] chars = {'1', '2', '3'};
        System.out.println("Преобразованное число из массива символов: " + MyInteger.parseInt(chars));

        String str = "456";
        System.out.println("Преобразованное число из строки: " + MyInteger.parseInt(str));
    }
}
