package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.disk;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;
import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.duration.DurationManager;

import java.util.Collections;

public class DiskManager {
    public static boolean addComposition(Disk disk, Composition composition) {
        disk.setNumberOfCompositions(disk.getNumberOfCompositions() + 1);
        DurationManager.durationsSum(disk.getDuration(), composition.getDuration());
        return disk.getCompositions().add(composition);
    }

    public static boolean removeComposition(Disk disk, Composition composition) {
        disk.setNumberOfCompositions(disk.getNumberOfCompositions() - 1);
        DurationManager.durationsSub(disk.getDuration(), composition.getDuration());
        return disk.getCompositions().remove(composition);
    }

    public static void shuffle(Disk disk) {
        Collections.shuffle(disk.getCompositions());
    }
}
