package sample.predicate;

import sample.filestructure.Component;

/**
 *
 * @author malalanayake
 */
public class FilterBySizePredicate extends Predicate<Component> {

    int size;

    public FilterBySizePredicate(int size) {
        this.size = size;
    }

    @Override
    public boolean isValid(Component t) {
        if (t.getSize() > this.size) {
            for (Predicate p : this.listOfPredicates) {
                if (!p.isValid(t)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

}
