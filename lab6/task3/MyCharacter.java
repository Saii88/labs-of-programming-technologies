public class MyCharacter {

    public static void main(String[] args) {
        MyCharacter myCharacter1 = new MyCharacter('a');
        MyCharacter myCharacter2 = new MyCharacter('0');
        System.out.println("myCharacter1.charValue(): " + myCharacter1.charValue());
        System.out.println("myCharacter2.charValue(): " + myCharacter2.charValue());
        System.out.println();
        System.out.println("MyCharacter.compare('a', '0'): " + MyCharacter.compare('a', '0'));
        System.out.println();
        System.out.println("myCharacter1.compareTo(myCharacter2): " + myCharacter1.compareTo(myCharacter2));
        System.out.println("myCharacter2.compareTo(myCharacter1): " + myCharacter2.compareTo(myCharacter1));
        System.out.println();
        System.out.println("myCharacter1.getNumericValue(): " + myCharacter1.getNumericValue());
        System.out.println("myCharacter2.getNumericValue(): " + myCharacter2.getNumericValue());
        System.out.println();
        System.out.println("myCharacter1.isLetter(): " + myCharacter1.isLetter());
        System.out.println("myCharacter2.isLetter(): " + myCharacter2.isLetter());
        System.out.println();
        System.out.println("myCharacter1.isDigit(): " + myCharacter1.isDigit());
        System.out.println("myCharacter2.isDigit(): " + myCharacter2.isDigit());
        System.out.println();
        System.out.println("myCharacter1.isLetterOrDigit(): " + myCharacter1.isLetterOrDigit());
        System.out.println("myCharacter2.isLetterOrDigit(): " + myCharacter2.isLetterOrDigit());
        System.out.println();
        System.out.println("myCharacter1.isLowerCase(): " + myCharacter1.isLowerCase());
        System.out.println("myCharacter2.isLowerCase(): " + myCharacter2.isLowerCase());
        System.out.println();
        System.out.println("myCharacter1.isUpperCase(): " + myCharacter1.isUpperCase());
        System.out.println("myCharacter2.isUpperCase(): " + myCharacter2.isUpperCase());
        System.out.println();
        System.out.println("myCharacter1.toUpperCase(): " + myCharacter1.toUpperCase());
        System.out.println("myCharacter2.toUpperCase(): " + myCharacter2.toUpperCase());
        System.out.println();
        System.out.println("myCharacter1.toLowerCase(): " + myCharacter1.toLowerCase());
        System.out.println("myCharacter2.toLowerCase(): " + myCharacter2.toLowerCase());
        System.out.println();
        System.out.println("myCharacter1.toString(): " + myCharacter1.toString());
        System.out.println("myCharacter2.toString(): " + myCharacter2.toString());
        System.out.println();
        System.out.println("MyCharacter.valueOf('1'): " + MyCharacter.valueOf('1').toString());
        System.out.println("MyCharacter.valueOf('q'): " + MyCharacter.valueOf('q').toString());
        System.out.println();
    }
    
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public static int compare(char x, char y) {
        if (x < y) return -1;
        if (x > y) return 1;
        return 0;
    }

    public static MyCharacter valueOf(char c) {
        return new MyCharacter(c);
    }

    public char charValue() {
        return value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        if (this.value < anotherCharacter.value) return -1;
        if (this.value > anotherCharacter.value) return 1;
        return 0;
    }

    public boolean equals(MyCharacter anotherCharacter) {
        return this.value == anotherCharacter.value;
    }

    public int getNumericValue() {
        if (isDigit()) return (this.value - '0');
        else return -1;
    }

    public boolean isLetter() {
        return isUpperCase() || isLowerCase();
    }

    public boolean isDigit() {
        return value >= '0' && value <= '9';
    }

    public boolean isLetterOrDigit() {
        return isLetter() || isDigit();
    }

    public boolean isLowerCase() {
        return value >= 'a' && value <= 'z';
    }

    public boolean isUpperCase() {
        return value >= 'A' && value <= 'Z';
    }

    public char toLowerCase() {
        if (isUpperCase()) return (char) (value + ('a' - 'A'));
        else return value;
    }

    public char toUpperCase() {
        if (isLowerCase()) return (char) (value - ('a' - 'A'));
        else return value;
    }

    @Override
    public String toString() {
        return value + "";
    }

}
