package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.*;

import java.util.Collections;

public class DiskSeacherByExtremums {
    public Composition searchMinByName(Disk disk, Composition composition) {
        return Collections.min(disk.getCompositions(), new NameComparator());
    }

    public Composition searchMaxByName(Disk disk, Composition composition) {
        return Collections.max(disk.getCompositions(), new NameComparator());
    }

    public Composition searchMinByMusician(Disk disk, Composition composition) {
        return Collections.min(disk.getCompositions(), new MusicianComparator());
    }

    public Composition searchMaxByMusician(Disk disk, Composition composition) {
        return Collections.max(disk.getCompositions(), new MusicianComparator());
    }

    public Composition searchMinByYear(Disk disk, Composition composition) {
        return Collections.min(disk.getCompositions(), new YearComparator());
    }

    public Composition searchMaxByYear(Disk disk, Composition composition) {
        return Collections.max(disk.getCompositions(), new YearComparator());
    }

    public Composition searchMinByDuration(Disk disk, Composition composition) {
        return Collections.min(disk.getCompositions(), new DurationComparator());
    }

    public Composition searchMaxByDuration(Disk disk, Composition composition) {
        return Collections.max(disk.getCompositions(), new DurationComparator());
    }
}
