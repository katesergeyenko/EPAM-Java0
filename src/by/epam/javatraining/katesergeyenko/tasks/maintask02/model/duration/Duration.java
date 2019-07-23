package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.EmptyDurationException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.NegativeDurationException;

public class Duration {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;

    private int totalSeconds;

    public Duration() {
        totalSeconds = 0;
    }

    public Duration(int totalSeconds){
        if (totalSeconds == 0) {
            new Duration();
        } else if (totalSeconds < 0) {
            new Duration();
        }
        this.totalSeconds = totalSeconds;
    }

    public Duration(int hours, int minutes, int seconds) {
        if (hours == 0 && minutes == 0 && seconds == 0) {
            new Duration();
        } else if (hours < 0 || minutes < 0 || seconds < 0) {
            new Duration();
        }
        totalSeconds = hours * MINUTES_IN_HOUR * SECONDS_IN_MINUTE
                + minutes * SECONDS_IN_MINUTE + seconds;
    }

    public Duration(Duration duration) {
        totalSeconds = duration.totalSeconds;
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }

    public void setTotalSeconds(int totalSeconds) throws EmptyDurationException, NegativeDurationException {
        if (totalSeconds == 0) {
            throw new EmptyDurationException();
        } else if (totalSeconds < 0) {
            throw new NegativeDurationException();
        }
        this.totalSeconds = totalSeconds;
    }

    @Override
    public String toString() {
        int hours = 0;
        int minutes = 0;
        int seconds = totalSeconds;
        while (seconds >= SECONDS_IN_MINUTE) {
            minutes++;
            seconds -= SECONDS_IN_MINUTE;
        }
        while (minutes >= MINUTES_IN_HOUR) {
            hours++;
            minutes -= MINUTES_IN_HOUR;
        }

        return getClass().getSimpleName() + ": hours = " + hours + "; minutes = " + minutes
                + "; seconds = " + seconds + "; total seconds = " + totalSeconds + "; ";
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Duration duration = (Duration) object;
        return totalSeconds == duration.totalSeconds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + totalSeconds;

        return result;
    }
}
