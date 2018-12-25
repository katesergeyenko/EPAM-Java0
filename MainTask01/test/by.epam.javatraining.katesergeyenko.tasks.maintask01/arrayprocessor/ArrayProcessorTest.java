package by.epam.javatraining.katesergeyenko.tasks.maintask01.arrayprocessor;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayProcessorTest {
    // Test findMinimum()
    @Test
    public void testFindMinimum() {
        double array[] = new double[]{5, 3, 1, -6, 1, 2};
        double expected = -6;
        double actual = ArrayProcessor.findMinimum(array);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindMinimum2() {
        double array[] = new double[]{0};
        double expected = 0;
        double actual = ArrayProcessor.findMinimum(array);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindMinimum3() {
        double array[] = new double[]{5};
        double expected = 5;
        double actual = ArrayProcessor.findMinimum(array);
        assertEquals(expected, actual, 0.001);
    }

    // Test findMaximum()
    @Test
    public void testFindMaximum() {
        double array[] = new double[]{5, 3, 1, -6, 1, 2, 5.9};
        double expected = 5.9;
        double actual = ArrayProcessor.findMaximum(array);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindMaximum2() {
        double array[] = new double[]{0};
        double expected = 0;
        double actual = ArrayProcessor.findMaximum(array);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindMaximum3() {
        double array[] = new double[]{5};
        double expected = 5;
        double actual = ArrayProcessor.findMaximum(array);
        assertEquals(expected, actual, 0.001);
    }

    // Test calculateAverageArithmetical()
    @Test
    public void testCalculateAverageArithmetical() {
        double array[] = new double[]{1, 3, 5, -3, 4};
        double expected = 2;
        double actual = ArrayProcessor.calculateAverageArithmetical(array);
        assertEquals(expected, actual, 0.001);
    }

    // Test calculateAverageGeometrical()
    @Test
    public void testCalculateAverageGeometrical() {
        double array[] = new double[]{1, 2, 3, 4, 5, 6};
        double expected = 2.99379517;
        double actual = ArrayProcessor.calculateAverageGeometrical(array);
        assertEquals(expected, actual, 0.001);
    }

    // Test isSorted()
    @Test
    public void testIsSorted() {
        double array[] = new double[]{1, 2, 3, 4, 5, 6};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted2() {
        double array[] = new double[]{0};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted3() {
        double array[] = new double[]{1, 1, 1, 1};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted4() {
        double array[] = new double[]{1, 2, 3, 4, 5};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted5() {
        double array[] = new double[]{5, 4, 3, 2, 1};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted6() {
        double array[] = new double[]{1, 1, 1, 1, 2};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted7() {
        double array[] = new double[]{1, 1, 1, 1, 0};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted8() {
        double array[] = new double[]{0, 0, 1, 1, 1};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted9() {
        double array[] = new double[]{1, 1, 2, 2, 3, 3};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSorted10() {
        double array[] = new double[]{1, 1, 2, 2, 3, 3, 1, 1};
        boolean actual = ArrayProcessor.isSorted(array);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    //Test findLocalMinimum()
    @Test
    public void testFindLocalMinimum() {
        double array[] = new double[]{1, 1, 1, 1};
        int actual = ArrayProcessor.findLocalMinimum(array);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLocalMinimum2() {
        double array[] = new double[]{5, 5, 5, 7, 3, 8};
        int actual = ArrayProcessor.findLocalMinimum(array);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLocalMinimum3() {
        double array[] = new double[]{1, 2, 3, 4, 5};
        int actual = ArrayProcessor.findLocalMinimum(array);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLocalMinimum4() {
        double array[] = new double[]{5, 4, 3, 2, 1};
        int actual = ArrayProcessor.findLocalMinimum(array);
        int expected = 4;
        assertEquals(expected, actual);
    }

    //Test findLocalMaximum()
    @Test
    public void testFindLocalMaximum() {
        double array[] = new double[]{1, 1, 1, 1};
        int actual = ArrayProcessor.findLocalMaximum(array);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLocalMaximum2() {
        double array[] = new double[]{5, 5, 5, 7, 3, 8, 7};
        int actual = ArrayProcessor.findLocalMaximum(array);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLocalMaximum3() {
        double array[] = new double[]{1, 2, 3, 4, 5};
        int actual = ArrayProcessor.findLocalMaximum(array);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLocalMaximum4() {
        double array[] = new double[]{5, 4, 3, 2, 1};
        int actual = ArrayProcessor.findLocalMaximum(array);
        int expected = 0;
        assertEquals(expected, actual);
    }

    // Test findElementLinearSearch()
    @Test
    public void testFindElementLinearSearch() {
        double array[] = new double[]{5, 4, 3, 2, 1};
        int actual = ArrayProcessor.findElementLinearSearch(array, 3);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindElementLinearSearch2() {
        double array[] = new double[]{5, 4, 7, 2, 1};
        int actual = ArrayProcessor.findElementLinearSearch(array, 3);
        int expected = -1;
        assertEquals(expected, actual);
    }

    //Task findElementBinarySearch()
    @Test
    public void testFindElementBinarySearch() {
        double array[] = new double[]{1, 2, 3, 4, 5};
        int actual = ArrayProcessor.findElementBinarySearch(array, 3);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindElementBinarySearch2() {
        double array[] = new double[]{1, 2, 3, 4, 5};
        int actual = ArrayProcessor.findElementBinarySearch(array, 10);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindElementBinarySearch3() {
        double array[] = new double[]{1, 2, 3, 4, 5};
        int actual = ArrayProcessor.findElementBinarySearch(array, 1);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindElementBinarySearch4() {
        double array[] = new double[]{1, 2, 3, 4, 5};
        int actual = ArrayProcessor.findElementBinarySearch(array, 5);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindElementBinarySearch5() {
        double array[] = new double[]{1, 2, 3, 4, 5, 6};
        int actual = ArrayProcessor.findElementBinarySearch(array, 3);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindElementBinarySearch6() {
        double array[] = new double[]{1, 2, 3, 4, 5, 6};
        int actual = ArrayProcessor.findElementBinarySearch(array, 4);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindElementBinarySearch7() {
        double array[] = new double[]{1, 2, 3, 4, 5, 6};
        int actual = ArrayProcessor.findElementBinarySearch(array, 1);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testFindElementBinarySearch8() {
        double array[] = new double[]{1, 2, 3, 4, 5, 6};
        int actual = ArrayProcessor.findElementBinarySearch(array, 6);
        int expected = 5;
        assertEquals(expected, actual);
    }

    //Test reverseElements()
    @Test
    public void testReverseElements() {
        double array[] = new double[]{5, 4, 7, 2, 1};
        double[] actual = ArrayProcessor.reverseElements(array);
        double[] expected = {1, 2, 7, 4, 5};
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testReverseElements2() {
        double array[] = new double[]{-4, -6, 8, 6, -7, 0};
        double[] actual = ArrayProcessor.reverseElements(array);
        double[] expected = {0, -7, 6, 8, -6, -4};
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testReverseElements3() {
        double array[] = new double[]{-1};
        double[] actual = ArrayProcessor.reverseElements(array);
        double[] expected = {-1};
        assertArrayEquals(expected, actual, 0.001);
    }

    // Test sortElementsBubbleSortAscending()
    @Test
    public void testSortElementsBubbleSortAscending() {
        double array[] = new double[]{-1};
        double[] actual = ArrayProcessor.sortElementsBubbleSortAscending(array);
        double[] expected = {-1};
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testSortElementsBubbleSortAscending2() {
        double array[] = new double[]{-1, 4, 5, 2, 3};
        double[] actual = ArrayProcessor.sortElementsBubbleSortAscending(array);
        double[] expected = {-1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual, 0.001);
    }

    // Test sortElementsBubbleSortDescending()
    @Test
    public void testSortElementsBubbleSortDescending() {
        double array[] = new double[]{-1};
        double[] actual = ArrayProcessor.sortElementsBubbleSortDescending(array);
        double[] expected = {-1};
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testSortElementsBubbleSortDescending2() {
        double array[] = new double[]{-1, 4, 5, 2, 3};
        double[] actual = ArrayProcessor.sortElementsBubbleSortDescending(array);
        double[] expected = {5, 4, 3, 2, -1};
        assertArrayEquals(expected, actual, 0.001);
    }

    // Test sortElementsInsertionSortAscending()
    @Test
    public void testSortElementsInsertionSortAscending() {
        double array[] = new double[]{-1};
        double[] actual = ArrayProcessor.sortElementsInsertionSortAscending(array);
        double[] expected = {-1};
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testSortElementsInsertionSortAscending2() {
        double array[] = new double[]{-1, 4, 5, 2, 3};
        double[] actual = ArrayProcessor.sortElementsInsertionSortAscending(array);
        double[] expected = {-1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual, 0.001);
    }

    // Test sortElementsInsertionSortDescending()
    @Test
    public void testSortElementsInsertionSortDescending() {
        double array[] = new double[]{-1};
        double[] actual = ArrayProcessor.sortElementsInsertionSortDescending(array);
        double[] expected = {-1};
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testSortElementsInsertionSortDescending2() {
        double array[] = new double[]{-1, 4, 5, 2, 3};
        double[] actual = ArrayProcessor.sortElementsInsertionSortDescending(array);
        double[] expected = {5, 4, 3, 2, -1};
        assertArrayEquals(expected, actual, 0.001);
    }

    // Test sortElementsMergeSortAscending()
    @Test
    public void testSortElementsMergeSortAscending() {
        double array[] = new double[]{-1};
        double[] actual = ArrayProcessor.sortElementsMergeSortAscending(array, 0, array.length - 1);
        double[] expected = {-1};
        assertArrayEquals(expected, actual, 0.001);
    }

    @Test
    public void testSortElementsMergeSortAscending2() {
        double array[] = new double[]{-1, 4, 5, 2, 3};
        double[] actual = ArrayProcessor.sortElementsMergeSortAscending(array, 0 , array.length - 1);
        double[] expected = {-1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual, 0.001);
    }
}

