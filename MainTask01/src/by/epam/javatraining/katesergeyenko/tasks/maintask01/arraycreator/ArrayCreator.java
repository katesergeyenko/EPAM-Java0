/**
 *  Array creator.
 *  Contains following methods:
 *      createArrayFromString(String string)
 *      createRandomArray
 */

package by.epam.javatraining.katesergeyenko.tasks.maintask01.arraycreator;

import java.util.Random;
import java.util.StringTokenizer;

public class ArrayCreator {
    public static final String DELIMITERS = " ";

    public static double[] createArrayFromString(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        int length = Integer.parseInt(stringTokenizer.nextToken(DELIMITERS));
        double[] array = new double[length];

        for (int i = 0 ; i < length; i++) {
            array[i] = Double.parseDouble(stringTokenizer.nextToken(DELIMITERS));
        }

        return array;
    }

    public static double[] createRandomArray() {
        Random random = new Random();
        int length = Math.abs(random.nextInt(100));
        double[] array = new double[length];

        for (int i = 0 ; i < length; i++) {
            array[i] = random.nextDouble();
        }

        return array;
    }
}
