
package sample.predicate;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author malalanayake
 */
public abstract class Predicate<T> {
    protected List<Predicate<T>> andPredicate;
    protected List<Predicate<T>> orPredicate;


    public Predicate() {
        andPredicate = new ArrayList<>();
    }
    
    
    public abstract boolean isValid(T t);
    public Predicate<T> and(Predicate<T> p){
        this.andPredicate.add(p);
        return this;
    }
    public Predicate<T> or(Predicate<T> p){
        this.orPredicate.add(p);
        p.orPredicate.add(p);
        return this;
    }
}
