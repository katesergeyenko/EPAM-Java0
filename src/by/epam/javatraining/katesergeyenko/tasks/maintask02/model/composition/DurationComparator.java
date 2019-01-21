package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition;

import java.util.Comparator;

public class DurationComparator implements Comparator<Composition> {
    @Override
    public int compare(Composition firstComposition, Composition secondComposition) {
        return firstComposition.getDuration().getTotalSeconds() - secondComposition.getDuration().getTotalSeconds();
    }
}
