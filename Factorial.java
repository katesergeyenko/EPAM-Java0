public class Factorial {
    public static boolean isPositive(int number) {
        boolean result = false;

        if (number >= 0) {
            result = true;
        }

        return result;
    }
    public static int calculateFactorial(int number) {
        int result = -1;

        if (isPositive(number)) {
            result = 1;

            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }

        return result;
    }

    public static String GenerateResultMessage(int factorial) {
        String resultMsg = "";
        if (factorial != -1) {
            resultMsg += factorial;
        } else {
            resultMsg = "Number is negative.";
        }

        return resultMsg;
    }
}
