public class NumberOfHeadsAndEyesOfDragon {
    private static final int FIRST_INTERVAL = 200;
    private static final int SECOND_INTERVAL = 100;
    private static final int HEADS_PER_YEAR_IN_FIRST_INTERVAL = 3;
    private static final int HEADS_PER_YEAR_IN_SECOND_INTERVAL = 2;
    private  static final int EYES_PER_HEAD = 2;

    public static int GetNumberOfHeads(int age) {
        int numberOfHeads = 0;

        if (age > FIRST_INTERVAL) {
            age -= FIRST_INTERVAL;
            numberOfHeads += FIRST_INTERVAL * HEADS_PER_YEAR_IN_FIRST_INTERVAL;
        }
        if (age > SECOND_INTERVAL) {
            age -= SECOND_INTERVAL;
            numberOfHeads += SECOND_INTERVAL * HEADS_PER_YEAR_IN_SECOND_INTERVAL;
        }
        numberOfHeads += age;

        return numberOfHeads;
    }

    public static int GetNumberOfEyes(int numberOfHeads) {
        return numberOfHeads * EYES_PER_HEAD;
    }

    public static String GenerateResultMessage(int numberOfHeads, int numberOfEyes) {
        return "Wow! Dragon has " + numberOfHeads + " heads & " + numberOfEyes + " eyes!";
    }
}
