package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators.CompositionDurationComparator;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators.CompositionMusicianComparator;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators.CompositionNameComparator;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators.CompositionYearComparator;

import java.util.Collections;

public class DiskSorter {
    public static void sortByName(Disk disk) {
        Collections.sort(disk.getCompositions(), new CompositionNameComparator());
    }

    public static void sortByMusician(Disk disk) {
        Collections.sort(disk.getCompositions(), new CompositionMusicianComparator());
    }

    public static void sortByYear(Disk disk) {
        Collections.sort(disk.getCompositions(), new CompositionYearComparator());
    }

    public static void sortByDuration(Disk disk) {
        Collections.sort(disk.getCompositions(), new CompositionDurationComparator());
    }
}
