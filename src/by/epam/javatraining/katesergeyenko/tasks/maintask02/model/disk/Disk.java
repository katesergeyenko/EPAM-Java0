package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.exceptions.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;

import java.util.ArrayList;
import java.util.List;

public class Disk {
    private String name;
    private List<Composition> compositions;

    public Disk() {
        name = "Unknown name";
        compositions = new ArrayList<>();
    }

    public Disk(String name) {
        if (name == null || name.length() == 0) {
            new Disk();
        } else {
            this.name = name;
            this.compositions = new ArrayList<>();
        }
    }

    public Disk(String name, List<Composition> compositions) throws NegativeDurationException, EmptyDurationException {
        if (name == null || name.length() == 0) {
            new Disk();
        } else {
            this.name = name;
            this.compositions = new ArrayList<>();
            for (Composition composition : compositions) {
                addComposition(composition);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyNameException {
        if (name == null || name.length() == 0) {
            throw new EmptyNameException();
        }
        this.name = name;
    }

    public Duration getDuration() throws NegativeDurationException, EmptyDurationException {
        Duration duration = new Duration();

        if (compositions.size() > 0) {
            for (Composition composition : compositions) {
                duration.setTotalSeconds(duration.getTotalSeconds() + composition.getDuration().getTotalSeconds());
            }
        }

        return duration;
    }

    public List<Composition> getCompositions() {
        return compositions;
    }

    public void setCompositions(List<Composition> compositions) {
        this.compositions = compositions;
    }

    public boolean addComposition(Composition composition) throws NegativeDurationException, EmptyDurationException {
        return compositions.add(composition);
    }

    public boolean removeComposition(Composition composition) throws NegativeDurationException, EmptyDurationException {
        return compositions.remove(composition);
    }

    @Override
    public String toString() {
        StringBuilder resultListToString = new StringBuilder("List: ");
        for (Composition composition : compositions) {
            resultListToString.append(composition);
            resultListToString.append("; ");
        }

        return getClass().getSimpleName() + ": name = " + name + "; " + resultListToString + "; ";
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
        return name.equals(disk.name) && compositions.equals(disk.compositions);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((name != null) ? name.hashCode() : 0);
        result = prime * result + ((compositions != null) ? compositions.hashCode() : 0);

        return result;
    }
}
