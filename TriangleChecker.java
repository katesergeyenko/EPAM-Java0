public class TriangleChecker {
    private static double GetLengthOfSide(double firstX, double firstY,
                                          double secondX, double secondY) {
        return Math.sqrt((firstX - secondX) * (firstX - secondX) + (firstY - secondY) * (firstY - secondY));
    }
    public static int CheckTriangle(double firstX, double firstY,
                                    double secondX, double secondY,
                                    double thirdX, double thirdY) {
        int result = 0;
        double firstSide = GetLengthOfSide(firstX, firstY, secondX, secondY);
        double secondSide = GetLengthOfSide(firstX, firstY, thirdX, thirdY);
        double thirdSide = GetLengthOfSide(secondX, secondY, thirdX, thirdY);

        if (firstSide < secondSide + thirdSide
                && secondSide < firstSide + thirdSide
                && thirdSide < firstSide + secondSide) {
            result = 1;

            if (firstSide * firstSide == secondSide * secondSide + thirdSide * thirdSide
                    || secondSide * secondSide == firstSide * firstSide + thirdSide * thirdSide
                    || thirdSide * thirdSide == firstSide * firstSide + secondSide * secondSide) {
                result = 2;
            }
        }

        return result;
    }

    public static String GenerateResultMessage(int result) {
        String resultString;

        switch (result) {
            case 1: resultString = "This is triangle."; break;
            case 2: resultString = "This is right triangle."; break;
            default: resultString = "It's not a triangle.";
        }

        return resultString;
    }
}
