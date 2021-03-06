package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;

import java.util.ArrayList;
import java.util.List;

public class DiskSearcher {
    public int indexOfComposition(Disk disk, Composition composition) {
        return disk.getCompositions().indexOf(composition);
    }

    public List<Composition> searchCompositionByName(Disk disk, String name) {
        List<Composition> resultList = new ArrayList<>();

        for (Composition composition : disk.getCompositions()) {
            if (name.equals(composition.getName())) {
                resultList.add(composition);
            }
        }
        return resultList;
    }

    public List<Composition> searchCompositionByMusician(Disk disk, String musician) {
        List<Composition> resultList = new ArrayList<>();

        for (Composition composition : disk.getCompositions()) {
            if (musician.equals(composition.getMusician())) {
                resultList.add(composition);
            }
        }
        return resultList;
    }

    public List<Composition> searchCompositionByYear(Disk disk, int year) {
        List<Composition> resultList = new ArrayList<>();

        for (Composition composition : disk.getCompositions()) {
            if (year == composition.getYear()) {
                resultList.add(composition);
            }
        }
        return resultList;
    }

    public List<Composition> searchCompositionByDuration(Disk disk, Duration duration) {
        List<Composition> resultList = new ArrayList<>();

        for (Composition composition : disk.getCompositions()) {
            if (duration.equals(composition.getDuration())) {
                resultList.add(composition);
            }
        }
        return resultList;
    }
}
