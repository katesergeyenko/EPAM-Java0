package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.Duration;

import java.util.List;
import java.util.ArrayList;

public class DiskFilter {
    public List<Composition> filterByName(Disk disk, String low, String high) {
        List<Composition> resultList = new ArrayList<>();

        for (Composition composition : disk.getCompositions()) {
            if (composition.getName().compareToIgnoreCase(low) >= 0 && composition.getName().compareToIgnoreCase(high) <= 0) {
                resultList.add(composition);
            }
        }

        return resultList;
    }

    public List<Composition> filterByMusician(Disk disk, String low, String high) {
        List<Composition> resultList = new ArrayList<>();

        for (Composition composition : disk.getCompositions()) {
            if (composition.getMusician().compareToIgnoreCase(low) >= 0 && composition.getMusician().compareToIgnoreCase(high) <= 0) {
                resultList.add(composition);
            }
        }

        return resultList;
    }

    public List<Composition> filterByYear(Disk disk, int low, int high) {
        List<Composition> resultList = new ArrayList<>();

        for (Composition composition : disk.getCompositions()) {
            if (composition.getYear() >= low && composition.getYear() <= high) {
                resultList.add(composition);
            }
        }

        return resultList;
    }

    public List<Composition> filterByDuration(Disk disk, Duration low, Duration high) {
        List<Composition> resultList = new ArrayList<>();

        for (Composition composition : disk.getCompositions()) {
            if (composition.getDuration().getTotalSeconds() >= low.getTotalSeconds() && composition.getDuration().getTotalSeconds() <= high.getTotalSeconds()) {
                resultList.add(composition);
            }
        }

        return resultList;
    }
}
