public class TypeOfSequence {
    public static void PrintResult(int number, String msg) {
        System.out.print("*******" + msg + "*******\n");
        switch (getTypeOfSequence(number)){
            case 1: System.out.print("Sequence is increasing.\n"); break;
            case 2: System.out.print("Sequence is decreasing.\n"); break;
            default: System.out.print("Sequence is chaotic.\n");
        }
    }

    public static int getTypeOfSequence(int number) {
        int result = -1;

        if (number % 10 > (number /= 10) % 10) {
            if (number % 10 > (number /= 10) % 10) {
                if (number % 10 > (number /= 10) % 10) {
                    result = 1;
                }
            }
        } else if (number % 10 < (number /= 10) % 10) {
            if (number % 10 < (number /= 10) % 10) {
                result = 2;
            }
        } else {
            result = 3;
        }

        return result;
    }
}
