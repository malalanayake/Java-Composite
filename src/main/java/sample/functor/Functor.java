package sample.functor;

/**
 *
 * @author malalanayake
 */
public interface Functor<T, R> {

    public void execute(T data);

    public R getValue();
}
