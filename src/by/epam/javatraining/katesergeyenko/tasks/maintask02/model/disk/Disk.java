package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;

import java.util.LinkedList;
import java.util.List;

public class Disk {
    private String name;
    private Duration duration;
    private List<Composition> compositions;
    private int numberOfCompositions;

    public Disk() {
        name = "Unknown name";
        duration = new Duration();
        compositions = new LinkedList<>();
        numberOfCompositions = compositions.size();
    }

    public Disk(String name) throws EmptyNameException {
        if (name == null || name.length() == 0) {
            throw new EmptyNameException();
        } else {
            this.name = name;
            this.duration = new Duration();
            this.compositions = new LinkedList<>();
            this.numberOfCompositions = this.compositions.size();
        }
    }

    public Disk(String name, Duration duration, List<Composition> compositions)
            throws EmptyNameException  {
        if (name == null || name.length() == 0) {
            throw new EmptyNameException();
        } else {
            this.name = name;
            this.duration = duration;
            this.compositions = compositions;
            this.numberOfCompositions = compositions.size();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public List<Composition> getCompositions() {
        return compositions;
    }

    public void setCompositions(List<Composition> compositions) {
        this.compositions = compositions;
    }

    public int getNumberOfCompositions() {
        return numberOfCompositions;
    }

    public void setNumberOfCompositions(int numberOfCompositions) {
        this.numberOfCompositions = numberOfCompositions;
    }

    public String listToString(List<Composition> compositions) {
        String result = "List: ";
        for (Composition composition : compositions) {
            result += composition + "; ";
        }

        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name = " + name + "; "
                + duration + listToString(compositions)
                + "; number of composition = " + numberOfCompositions + "; ";
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Disk disk = (Disk) object;
        return name.equals(disk.name) && duration.equals(disk.duration)
                && compositions.equals(disk.compositions) && numberOfCompositions == disk.numberOfCompositions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((name != null) ? name.hashCode() : 0);
        result = prime * result + ((duration != null) ? duration.hashCode() : 0);
        result = prime * result + ((compositions != null) ? compositions.hashCode() : 0);
        result = prime * result + numberOfCompositions;

        return result;
    }
}
