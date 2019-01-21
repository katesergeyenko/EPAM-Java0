package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.EmptyDurationException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.NegativeDurationException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DurationManagerTest {
    // test durationSum
    @Test
    public void testDurationSum() throws EmptyDurationException, NegativeDurationException {
        Duration firstDuration = new Duration(2, 30, 59);
        Duration secondDuration = new Duration(1, 30, 1);
        DurationManager.durationsSum(firstDuration, secondDuration);
        Duration expected = new Duration(4, 1, 0);
        Assert.assertEquals(firstDuration, expected);
    }

    @Test
    public void testDurationSum2() throws EmptyDurationException, NegativeDurationException {
        Duration firstDuration = new Duration(2, 30, 59);
        Duration secondDuration = new Duration(1, 30, 1);
        DurationManager.durationsSum(firstDuration, secondDuration);
        Assert.assertEquals(firstDuration, new Duration(14460));
    }

    @Test
    public void testDurationSum3() throws EmptyDurationException, NegativeDurationException {
        Duration firstDuration = new Duration(9059);
        Duration secondDuration = new Duration(5401);
        DurationManager.durationsSum(firstDuration, secondDuration);
        Assert.assertEquals(firstDuration, new Duration(4, 1, 0));
    }

    @Test
    public void testDurationSum4() throws EmptyDurationException, NegativeDurationException {
        Duration firstDuration = new Duration(9059);
        Duration secondDuration = new Duration(5401);
        DurationManager.durationsSum(firstDuration, secondDuration);
        Assert.assertEquals(firstDuration, new Duration(14460));
    }

    // test durationSub
}
