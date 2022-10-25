public class Main {
    public static void main(String[] args) {
        byte i = 8;
        short j = 10;
        int k = 100;
        double d = 500;
        float f = 4.0f;
        long l = 99999999;

        char letter = 'a';
        boolean t = true;

        int number;
        float fval = 32.555f;
        number = (int)fval;

        int number2;
        double dval = 32.55;
        number2 = (int)dval;

        System.out.println("Primetive Data Type-!");
        System.out.println("1.Numeric Data Type-!");
        System.out.println("byte i = " + i);
        System.out.println("short j = " + j);
        System.out.println("int k = " + k);
        System.out.println("double d = " + d);
        System.out.println("float f =" + f);
        System.out.println("long l = " + l);
        System.out.println("2. Non-Numeric Data Type-!");
        System.out.println("letter = "+ letter);
        System.out.println("boolean b = " + t);
        System.out.println("(int)fval = " + number);
        System.out.println("(int)dval = " + number2);
    }
}