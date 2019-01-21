package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music.maininstrument.MainInstrument;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;

public class Music extends Composition {
    private Enum<MainInstrument> mainInstrument;

    public Enum<MainInstrument> getMainInstrument() {
        return mainInstrument;
    }

    public void setMainInstrument(Enum<MainInstrument> mainInstrument) {
        this.mainInstrument = mainInstrument;
    }

    public Music() {
        super();
        mainInstrument = MainInstrument.UNKNOWN;
    }

    public Music(String name, String musician, int year, Duration duration, Enum<MainInstrument> mainInstrument)
            throws EmptyNameException, EmptyMusicianException, EmptyYearException, NegativeYearException {
        super(name, musician, year, duration);
        this.mainInstrument = mainInstrument;
    }

    public Music(String name, String musician, int year, int hours, int minutes, int seconds, Enum<MainInstrument> mainInstrument)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException,
            EmptyDurationException, NegativeDurationException {
        super(name, musician, year, hours, minutes, seconds);
        this.mainInstrument = mainInstrument;
    }

    public Music(String name, String musician, int year, int totalSeconds, Enum<MainInstrument> mainInstrument)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException,
            EmptyDurationException, NegativeDurationException {
        super(name, musician, year, totalSeconds);
        this.mainInstrument = mainInstrument;
    }

    public Music(Music music)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException {
        super(music.name, music.musician, music.year, music.duration);
        this.mainInstrument = music.mainInstrument;
    }

    @Override
    public String toString() {
        return super.toString() + "main instrument = " + mainInstrument;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Music music = (Music) object;
        return super.equals(object) && mainInstrument.equals(music.mainInstrument);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + super.hashCode();
        result = prime * result + ((mainInstrument != null) ? mainInstrument.hashCode() : 0);

        return result;
    }
}
