public class Fibonacci {
    public static boolean isPositive(int number) {
        boolean result = false;

        if (number >= 0) {
            result = true;
        }

        return result;
    }

    public static int calculateFibonacciNumber(int number) {
        int a = 0;
        int b = 1;

        int result = -1;

        if (isPositive(number)) {
            if (number == 0) {
                result = 0;
            } else if (number == 1) {
                result = 1;
            } else {
                for (int i = 1; i < number; i++) {
                    result = a + b;
                    a = b;
                    b = result;
                }
            }
        }

        return result;
    }

    public static String GenerateResultMessage(int fibonacci) {
        String resultMsg = "";
        if (fibonacci != -1) {
            resultMsg += fibonacci;
        } else {
            resultMsg = "Number is negative.";
        }

        return resultMsg;
    }
}
