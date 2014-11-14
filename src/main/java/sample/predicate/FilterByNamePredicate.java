package sample.predicate;

import sample.filestructure.Component;

/**
 *
 * @author malalanayake
 */
public class FilterByNamePredicate extends Predicate<Component> {

    String name;

    public FilterByNamePredicate(String name) {
        this.name = name;
    }

    @Override
    public boolean isValid(Component t) {
        if (t.getName().startsWith(this.name)) {
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
