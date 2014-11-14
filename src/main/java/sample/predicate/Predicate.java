package sample.predicate;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author malalanayake
 */
public abstract class Predicate<T> {

    protected List<Predicate<T>> listOfPredicates;

    public Predicate() {
        listOfPredicates = new ArrayList<>();
    }

    public abstract boolean isValid(T t);

    public Predicate<T> and(Predicate<T> p) {
        this.listOfPredicates.add(p);
        return this;
    }

}
