package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition;

import java.util.Comparator;

public class NameComparator implements Comparator<Composition> {
    @Override
    public int compare(Composition firstComposition, Composition secondComposition) {
        return firstComposition.name.compareToIgnoreCase(secondComposition.name);
    }
}
