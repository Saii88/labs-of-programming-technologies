public class MyString1 {
    public static void main(String[] args) {
        char[] test = {'Т', 'е', 'С', 'т'};
        char[] test2 = {'T', 'e', 'S', 't', '2'};
        MyString1 myString1 = new MyString1(test);
        MyString1 myString2 = new MyString1(test2);
        System.out.println("myString1.charAt(): " + myString1.charAt(1));
        System.out.println("myString1.length(): " + myString1.length());
        System.out.println("myString1.substring(): ");
        MyString1 substr = myString1.substring(2,4);
        for (int i = 0; i < substr.length(); i++) {
            System.out.print(substr.charAt(i));
        }
        System.out.println("myString1.lowercase():");
        MyString1 lower = myString1.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            System.out.print(lower.charAt(i));
        }
        System.out.println("myString1.equals(myString2): " + myString1.equals(myString2));
        System.out.print("myString1.valueof(): ");
        MyString1 value = myString1.valueOf(145);
        for (int i = 0; i < value.length(); i++) {
            System.out.print(value.charAt(i));
        }
    }
    
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] ch = new char[end - begin];
        for (int i = begin, j = 0; i < end; i++, j++) {
            ch[j] = chars[i];
        }
        return new MyString1(ch);
    }

    public MyString1 toLowerCase() {
        char[] ch = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z')
                ch[i] = (char)(chars[i] + 32);
            else
                ch[i] = chars[i];
        }
        return new MyString1(ch);
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length())
            return false;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != s.charAt(i))
                return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        int length = 0;
        int n = i;
        while (n >= 1) {
            n /= 10;
            length++;
        }

        char[] ch = new char[length];

        for (int j = 0, k = (int)Math.pow(10, length - 1);
             j < length; j++, k /= 10) {
            ch[j] = Character.forDigit((i / k), 10);
            i %= k;
        }

        return new MyString1(ch);
    }
}
