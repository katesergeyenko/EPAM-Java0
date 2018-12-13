public class ReverseNumber {
    public static void PrintResult(int number, String msg) {
        System.out.print("*******" + msg + "*******\n");
        System.out.print(number + " --> " + getReverseNumber(number) + "\n");
    }

    public static int getReverseNumber(int number) {
        int result = 0;

        result += 1000000 * (number % 10)
                + 100000 * ((number /= 10) % 10)
                + 10000 * ((number /= 10) % 10)
                + 1000 * ((number /= 10) % 10)
                + 100 * ((number /= 10) % 10)
                + 10 * ((number /= 10) % 10)
                + ((number /= 10) % 10);

        return result;
    }
}
