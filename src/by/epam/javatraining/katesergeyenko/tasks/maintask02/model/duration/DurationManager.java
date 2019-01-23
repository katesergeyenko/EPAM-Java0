package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.EmptyDurationException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.NegativeDurationException;

public class DurationManager {
    public static Duration durationsSum(Duration diskDuration, Duration soundDuration) throws NegativeDurationException, EmptyDurationException {
        Duration result = new Duration(diskDuration.getTotalSeconds() + soundDuration.getTotalSeconds());
        result.convertTotalSecondsToHoursMinutesSeconds();
        return result;
    }

    public static Duration durationsSub(Duration diskDuration, Duration soundDuration) throws NegativeDurationException, EmptyDurationException {
        Duration result = new Duration(diskDuration.getTotalSeconds() - soundDuration.getTotalSeconds());
        result.convertTotalSecondsToHoursMinutesSeconds();
        return result;
    }
}
