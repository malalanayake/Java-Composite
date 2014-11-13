
package sample.predicate;

/**
 *
 * @author malalanayake
 */
public interface Predicate<T> {
    public boolean isValid(T t);
    Predicate<T> and(Predicate<T> p);
    Predicate<T> or(Predicate<T> p);
}
