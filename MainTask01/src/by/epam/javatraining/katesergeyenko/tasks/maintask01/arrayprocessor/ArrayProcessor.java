/**
 * Library for working with array.
 * Contains following methods:
 *  findMinimum()
 *  findMaximum()
 *  calculateAverageArithmetical(double[] array)
 *  calculateAverageGeometrical(double[] array)
 *  isSorted(double[] array)
 *  findLocalMinimum()
 *  indLocalMaximum()
 *  findElementLinearSearch(double[] array, double element)
 *  findElementBinarySearch(double[] array, double element) - use only with sorted array
 *  reverseElements(double[] array)
 *  sortElementsBubbleSortAscending(double[] array)
 *  sortElementsBubbleSortDescending(double[] array)
 *  sortElementsInsertionSortAscending(double[] array)
 *  sortElementsInsertionSortDescending(double[] array)
 *  sortElementsMergeSortAscending(double[] array, int left, int right)
 */

package by.epam.javatraining.katesergeyenko.tasks.maintask01.arrayprocessor;

import by.epam.javatraining.katesergeyenko.tasks.maintask01.logger.ConsoleLogger;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.logger.Logger;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.projectexceptions.ArrayNotDefinedException;
import by.epam.javatraining.katesergeyenko.tasks.maintask01.projectexceptions.EmptyArrayException;

public class ArrayProcessor {
    static final Logger.ILogger consoleLogger = new ConsoleLogger();

    static void checkArray(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        if (array == null) {
            consoleLogger.error("Array is not defined exception");
            throw new ArrayNotDefinedException();
        }
        if (array.length == 0) {
            consoleLogger.error("Array is empty exception");
            throw new EmptyArrayException();
        }
    }

    public static double findMinimum(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        double result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }

       return result;
    }

    public static double findMaximum(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        double result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }

        return result;
    }

    public static double calculateAverageArithmetical(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        double result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i] / array.length;
        }

        return result;
    }

    public static double calculateAverageGeometrical(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        double result = 1;

        for (int i = 0; i < array.length; i++) {
            result *= Math.pow(array[i], 1. / array.length);
        }
        //result = Math.pow(result, 1 / array.length)

        return result;
    }

    public static boolean isSorted(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        boolean result = false;
        int ascending = 0;
        int descending = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                ascending++;
            } else if (array[i] > array[i + 1]) {
                descending++;
            }
        }

        if (ascending == 0 || descending == 0) {
            result = true;
        }
        return result;
    }

    public static int findLocalMinimum(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        int result = -1;

        if (array[0] < array[1]) {
            result = 0;
        }
        if (result == -1) {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                    result = i;
                    break;
                }
            }
        }
        if (result == -1 && array[array.length - 1] < array[array.length - 2]) {
            result = array.length - 1;
        }

        return result;
    }

    public static int findLocalMaximum(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        int result = -1;

        if (array[0] > array[1]) {
            result = 0;
        }
        if (result == -1) {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    result = i;
                    break;
                }
            }
        }
        if (result == -1 && array[array.length - 1] > array[array.length - 2]) {
            result = array.length - 1;
        }

        return result;
    }

    public static int findElementLinearSearch(double[] array, double element) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static int findElementBinarySearch(double[] sortedArray, double element) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(sortedArray);

        int result = -1;
        int left = 0;
        int right = sortedArray.length;
        int middle;

        while (right > left) {
            middle = (right + left) / 2;
            if (element < sortedArray[middle]) {
                right = middle;
            } else if (element > sortedArray[middle]) {
                left = middle + 1;
            } else {
                result = middle;
                break;
            }
        }

        return result;
    }

    public static double[] reverseElements(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        for (int i = 0; i < array.length / 2; i++) {
            array[i] += array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length -  1 - i];
            array[i] -= array[array.length - 1 - i];
        }

        return array;
    }

    public static double[] sortElementsBubbleSortAscending(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                }
            }
        }

        return array;
    }

    public static double[] sortElementsBubbleSortDescending(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                }
            }
        }

        return array;
    }

    public static double[] sortElementsInsertionSortAscending(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        double separator;
        int j;

        for (int i = 1; i < array.length; i++) {
            separator = array[i];
            j = i - 1;

            while (separator < array[j] && j >= 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = separator;
        }

        return array;
    }

    public static double[] sortElementsInsertionSortDescending(double[] array) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        double separator;
        int j;

        for (int i = 1; i < array.length; i++) {
            separator = array[i];
            j = i - 1;

            while (j >= 0 && separator > array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = separator;
        }

        return array;
    }

    public static double[] sortElementsMergeSortAscending(double[] array, int left, int right) throws ArrayNotDefinedException, EmptyArrayException {
        checkArray(array);

        if (right <= left) {
            return array;
        }

        int middle = (left + right) / 2;
        double[] newArray = new double[array.length];
        int l;
        int m;

        sortElementsMergeSortAscending(array, left, middle);
        sortElementsMergeSortAscending(array, middle + 1, right);

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        l = left;
        m = middle + 1;

        for (int i = left; i < right + 1; i++) {
            if (l > middle) {
                array[i] = newArray[m];
                m++;
            } else if (m > right) {
                array[i] = newArray[l];
                l++;
            } else if (newArray[m] < newArray[l]) {
                array[i] = newArray[m];
                m++;
            } else {
                array[i] = newArray[l];
                l++;
            }
        }

        return array;
    }
}
