public class ReplaceNumbers {
    public static void PrintResult(int a, int b, String msg) {
        System.out.print("*******" + msg + "*******\n");
        System.out.print(a + ", " + b + " --> ");

        a += b;
        b = a - b;
        a -= b;

        System.out.print(a + ", " + b + "\n");
    }
}
