package by.epam.javatraining.katesergeyenko.tasks.maintask02.model.composition;

import java.util.Comparator;

public class YearComparator implements Comparator<Composition> {
    @Override
    public int compare(Composition firstComposition, Composition secondComposition) {
        return firstComposition.year - firstComposition.year;
    }
}
