package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;

public abstract class Composition {
    protected String name;
    protected String musician;
    protected int year;
    protected Duration duration;

    protected Composition() {
        name = "Unknown name";
        musician = "Unknown musician";
        year = 0;
        duration = new Duration();
    }

    protected Composition(String name, String musician, int year, Duration duration)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException {
        if (name == null || name.length() == 0) {
            throw new EmptyNameException();
        } else if (musician == null || musician.length() == 0) {
            throw new EmptyMusicianException();
        } else if (year == 0) {
            throw new EmptyYearException();
        } else if (year < 0) {
            throw new NegativeYearException();
        } else {
            this.name = name;
            this.musician = musician;
            this.year = year;
            this.duration = duration;
        }
    }

    protected Composition(String name, String musician, int year,  int hours, int minutes, int seconds)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException,
            EmptyDurationException, NegativeDurationException {
            if (name == null || name.length() == 0) {
                throw new EmptyNameException();
            } else if (musician == null || musician.length() == 0) {
                throw new EmptyMusicianException();
            } else if (year == 0) {
                throw new EmptyYearException();
            } else if (year < 0) {
                throw new NegativeYearException();
            } else {
                this.name = name;
                this.musician = musician;
                this.year = year;
                this.duration = new Duration(hours, minutes, seconds);
        }
    }

    protected Composition(String name, String musician, int year, int totalSeconds)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException,
            EmptyDurationException, NegativeDurationException {
        if (name == null || name.length() == 0) {
            throw new EmptyNameException();
        } else if (musician == null || musician.length() == 0) {
            throw new EmptyMusicianException();
        } else if (year == 0) {
            throw new EmptyYearException();
        } else if (year < 0) {
            throw new NegativeYearException();
        } else {
            this.name = name;
            this.musician = musician;
            this.year = year;
            this.duration = new Duration(totalSeconds);
        }
    }

    protected Composition(Composition composition) {
        name = composition.name;
        musician = composition.musician;
        year = composition.year;
        duration = composition.duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name = " + name + "; musician = " + musician + "; year = " + year + "; " + duration;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Composition composition = (Composition) object;
        return name.equals(composition.name) && musician.equals(composition.musician)
                && year == composition.year && duration.equals(composition.duration);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((name != null) ? name.hashCode() : 0);
        result = prime * result + ((musician != null) ? musician.hashCode() : 0);
        result = prime * result + year;
        result = prime * result + ((duration != null) ? duration.hashCode() : 0);

        return result;
    }
}
