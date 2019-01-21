package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.EmptyDurationException;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.NegativeDurationException;

public class Duration {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;

    private int totalSeconds;

    private int hours;
    private int minutes;
    private int seconds;

    public Duration() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Duration(int totalSeconds) throws  EmptyDurationException, NegativeDurationException {
        if (totalSeconds == 0) {
            throw new EmptyDurationException();
        } else if (totalSeconds < 0) {
            throw new NegativeDurationException();
        } else {
            this.totalSeconds = totalSeconds;
        }
    }

    public Duration(int hours, int minutes, int seconds) throws EmptyDurationException, NegativeDurationException {
        if (hours == 0 && minutes == 0 && seconds == 0) {
            throw new EmptyDurationException();
        } else if (hours < 0 || minutes < 0 || seconds < 0) {
            throw new NegativeDurationException();
        } else {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            convertHoursMinutesSecondsToTotalSeconds();
        }
    }

    public Duration(Duration duration) {
        this.hours = duration.hours;
        this.minutes = duration.minutes;
        this.seconds = duration.seconds;
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }

    public void setTotalSeconds(int totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        convertTotalSecondsToHoursMinutesSeconds();
        return getClass().getSimpleName() + ": hours = " + hours + "; minutes = " + minutes + "; seconds = " + seconds + "; ";
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
        return hours == duration.hours && minutes == duration.minutes && seconds == duration.seconds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + hours;
        result = prime * result + minutes;
        result = prime * result + seconds;

        return result;
    }

    public void convertTotalSecondsToHoursMinutesSeconds() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = totalSeconds;
        while (this.seconds >= SECONDS_IN_MINUTE) {
            this.minutes++;
            this.seconds -= SECONDS_IN_MINUTE;
        }
        while (this.minutes >= MINUTES_IN_HOUR) {
            this.hours++;
            this.minutes -= MINUTES_IN_HOUR;
        }
    }

    public void convertHoursMinutesSecondsToTotalSeconds() {
        this.totalSeconds = hours * MINUTES_IN_HOUR * SECONDS_IN_MINUTE
                + minutes * SECONDS_IN_MINUTE + seconds;
    }
}
