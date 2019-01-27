package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.comparators;

import by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition.Composition;

import java.util.Comparator;

public class CompositionDurationComparator implements Comparator<Composition> {
    @Override
    public int compare(Composition firstComposition, Composition secondComposition) {
        return firstComposition.getDuration().getTotalSeconds() - secondComposition.getDuration().getTotalSeconds();
    }
}
