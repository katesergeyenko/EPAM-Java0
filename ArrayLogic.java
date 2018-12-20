public class ArrayLogic {
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array[i] += array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] -= array[array.length - 1 - i];
        }

        return array;
    }

    public static String GenerateResultMessage(int[] array) {
        return java.util.Arrays.toString(array);
    }
}
