package sample.filestructure;

import sample.functor.Functor;
import sample.predicate.Predicate;

/**
 *
 * @author malalanayake
 */
public class FileProxy extends Component {

    Component component;

    public FileProxy(Component component) {
        super(component.getName(), component.modifiedDate, component.getSize(), component.getParent());
        this.component = component;
    }

    @Override
    public String getType() {
        return this.component.getType();
    }

    @Override
    public void addComponent(Component component) {
        System.out.println("=====Before=====");
        this.component.addComponent(component);
        System.out.println("=====After=====");
    }

    @Override
    public void print(Predicate<Component> predicate) {
        System.out.println("=====Before=====");
        this.component.print(predicate);
        System.out.println("=====After=====");
    }

    @Override
    public void print() {
        System.out.println("=====Before=====");
        this.component.print();
        System.out.println("=====After=====");
    }

    @Override
    public void compute(Predicate<Component> predicate, Functor<Component, Integer> functor) {
        System.out.println("=====Before=====");
        this.component.compute(predicate, functor); 
        System.out.println("=====After=====");
    }

}
