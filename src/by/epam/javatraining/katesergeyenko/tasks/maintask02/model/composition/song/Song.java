package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.song.style.Style;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;

public class Song extends Composition {
    private Enum<Style> style;
    private String lyrics;

    public Enum<Style> getStyle() {
        return style;
    }

    public void setStyle(Enum<Style> style) {
        this.style = style;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public Song() {
        super();
        style = Style.UNKNOWN;
        lyrics = "Unknown lyrics";
    }

    public Song(String name, String musician, int year, Duration duration, Enum<Style> style, String lyrics)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException {
        super(name, musician, year, duration);
        this.style = style;
        this.lyrics = lyrics;
    }

    public Song(String name, String musician, int year, int hours, int minutes, int seconds, Enum<Style> style, String lyrics)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException,
            EmptyDurationException, NegativeDurationException {
        super(name, musician, year, hours, minutes, seconds);
        this.style = style;
        this.lyrics = lyrics;
    }

    public Song(String name, String musician, int year, int totalSeconds, Enum<Style> style, String lyrics)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException,
            EmptyDurationException, NegativeDurationException {
        super(name, musician, year, totalSeconds);
        this.style = style;
        this.lyrics = lyrics;
    }

    public Song(Song song)
            throws EmptyNameException, EmptyMusicianException,
            EmptyYearException, NegativeYearException {
        super(song.name, song.musician, song.year, song.duration);
        this.style = song.style;
        this.lyrics = song.lyrics;
    }

    @Override
    public String toString() {
        return super.toString() + "style = " + style + "; lyrics = " + lyrics;
    }


    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Song song = (Song) object;
        return super.equals(object) && style.equals(song.style) && lyrics.equals(song.lyrics);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + super.hashCode();
        result = prime * result + ((style != null) ? style.hashCode() : 0);
        result = prime * result + ((lyrics != null) ? lyrics.hashCode() : 0);

        return result;
    }
}
