public class EgualityOfNumbers {
    public static void PrintResult(double a, double b, double c, String msg) {
        System.out.print("*******" + msg + "*******\n");
        if (isEqual(a, b, c)) {
            System.out.print("Numbers " + a + ", " + b + ", " + c + " are equal.\n");
        } else {
            System.out.print("Numbers " + a + ", " + b + ", " + c + " aren't equal.\n");
        }
    }

    public static boolean isEqual(double a, double b, double c) {
        return (a == b) && (a == c);
    }
}
