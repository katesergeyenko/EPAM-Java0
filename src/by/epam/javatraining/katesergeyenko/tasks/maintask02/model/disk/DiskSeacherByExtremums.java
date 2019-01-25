package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.*;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators.CompositionDurationComparator;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators.CompositionMusicianComparator;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators.CompositionNameComparator;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators.CompositionYearComparator;

import java.util.Collections;

public class DiskSeacherByExtremums {
    public static Composition searchMinByName(Disk disk) {
        return Collections.min(disk.getCompositions(), new CompositionNameComparator());
    }

    public static Composition searchMaxByName(Disk disk) {
        return Collections.max(disk.getCompositions(), new CompositionNameComparator());
    }

    public static Composition searchMinByMusician(Disk disk) {
        return Collections.min(disk.getCompositions(), new CompositionMusicianComparator());
    }

    public static Composition searchMaxByMusician(Disk disk) {
        return Collections.max(disk.getCompositions(), new CompositionMusicianComparator());
    }

    public static Composition searchMinByYear(Disk disk) {
        return Collections.min(disk.getCompositions(), new CompositionYearComparator());
    }

    public static Composition searchMaxByYear(Disk disk) {
        return Collections.max(disk.getCompositions(), new CompositionYearComparator());
    }

    public static Composition searchMinByDuration(Disk disk) {
        return Collections.min(disk.getCompositions(), new CompositionDurationComparator());
    }

    public static Composition searchMaxByDuration(Disk disk) {
        return Collections.max(disk.getCompositions(), new CompositionDurationComparator());
    }
}
