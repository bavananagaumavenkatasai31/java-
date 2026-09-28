public class typecasting
{

    static int a = 10;

    // Widening casting: int → double
    static double b = a;

    // Narrowing casting: double → int
    static int c = (int) b;

    static double marks = 95.75;

    // double → int
    static int d = (int) marks;

    static int number = 50;

    // int → byte
    static byte b1 = (byte) number;

    // String → int
    static String s = "50";
    static int n = Integer.parseInt(s);

    public static void main(String[] args)
    {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(marks);
        System.out.println(d);

        System.out.println(number);
        System.out.println(b1);

        System.out.println(s);
        System.out.println(n);
    }
}