package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.EmptyDurationException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.NegativeDurationException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DurationTest {

    // test Duration(int totalSeconds)
    @Test(expectedExceptions = EmptyDurationException.class)
    public void testDuration() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(0);

    }

    @Test(expectedExceptions = NegativeDurationException.class)
    public void testDuration2() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(-1);

    }

    @Test
    public void testDuration3() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(1);
        Duration expected = new Duration(1);
        Assert.assertEquals(actual, expected);

    }

    // test Duration(int hours, int minutes, int seconds)
    @Test(expectedExceptions = EmptyDurationException.class)
    public void testDuration4() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(0, 0, 0);

    }

    @Test(expectedExceptions = NegativeDurationException.class)
    public void testDuration5() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(-1, 1, 1);

    }

    @Test(expectedExceptions = NegativeDurationException.class)
    public void testDuration6() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(1, -1, 1);

    }

    @Test(expectedExceptions = NegativeDurationException.class)
    public void testDuration7() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(1, 1, -1);

    }

    @Test
    public void testDuration8() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(1, 0, 0);
        Duration expected = new Duration(1, 0, 0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDuration9() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(0, 1, 0);
        Duration expected = new Duration(0, 1, 0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDuration10() throws EmptyDurationException, NegativeDurationException {
        Duration actual = new Duration(0, 0, 1);
        Duration expected = new Duration(0, 0, 1);
        Assert.assertEquals(actual, expected);
    }
}
