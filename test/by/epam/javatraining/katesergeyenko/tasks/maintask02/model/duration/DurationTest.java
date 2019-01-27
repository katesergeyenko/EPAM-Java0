package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.EmptyDurationException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.NegativeDurationException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DurationTest {
    Duration actual;

    @BeforeMethod
    public void beforeMethod() {
        actual = new Duration();
    }

    // test setTotalSeconds(int totalSeconds)
    @Test(expectedExceptions = EmptyDurationException.class)
    public void testSetTotalSeconds() throws EmptyDurationException, NegativeDurationException {
        actual.setTotalSeconds(0);
    }

    @Test(expectedExceptions = NegativeDurationException.class)
    public void testSetTotalSeconds2() throws EmptyDurationException, NegativeDurationException {
        actual.setTotalSeconds(-1);
    }

    @Test
    public void testSetTotalSeconds3() throws EmptyDurationException, NegativeDurationException {
        actual.setTotalSeconds(1);
        Duration expected = new Duration(1);
        Assert.assertEquals(actual, expected);

    }
}
