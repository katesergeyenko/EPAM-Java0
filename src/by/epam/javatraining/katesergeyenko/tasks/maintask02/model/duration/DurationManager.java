package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration;

public class DurationManager {
    public static void durationsSum(Duration diskDuration, Duration soundDuration) {
        diskDuration.setTotalSeconds(diskDuration.getTotalSeconds() + soundDuration.getTotalSeconds());
    }

    public static void durationsSub(Duration diskDuration, Duration soundDuration) {
        diskDuration.setTotalSeconds(diskDuration.getTotalSeconds() - soundDuration.getTotalSeconds());
    }
}
