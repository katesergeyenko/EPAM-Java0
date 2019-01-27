package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.music;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;

public class Music extends Composition {
    private Enum<InstrumentType> instrumentType;

    public Music() {
        super();
        instrumentType = InstrumentType.UNKNOWN;
    }

    public Music(String name, String musician, int year, Duration duration, Enum<InstrumentType> instrumentType) {
        super(name, musician, year, duration);
        this.instrumentType = instrumentType;
    }

    public Music(String name, String musician, int year, int hours, int minutes, int seconds, Enum<InstrumentType> instrumentType) {
        super(name, musician, year, hours, minutes, seconds);
        this.instrumentType = instrumentType;
    }

    public Music(String name, String musician, int year, int totalSeconds, Enum<InstrumentType> instrumentType) {
        super(name, musician, year, totalSeconds);
        this.instrumentType = instrumentType;
    }

    public Music(Music music) {
        super(music.name, music.musician, music.year, music.duration);
        instrumentType = music.instrumentType;
    }

    public Enum<InstrumentType> getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(Enum<InstrumentType> instrumentType) {
        this.instrumentType = instrumentType;
    }

    @Override
    public String toString() {
        return super.toString() + "instrument = " + instrumentType;
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
        return super.equals(object) && instrumentType.equals(music.instrumentType);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + super.hashCode();
        result = prime * result + ((instrumentType != null) ? instrumentType.hashCode() : 0);

        return result;
    }
}
