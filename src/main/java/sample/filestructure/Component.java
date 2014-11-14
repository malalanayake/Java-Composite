package sample.filestructure;

import sample.functor.Functor;
import sample.predicate.Predicate;

/**
 *
 * @author malalanayake
 */
public abstract class Component {

    String name;
    String modifiedDate;
    int size;
    Component parent;

    public Component(String name, String modifiedDate, int size, Component parent) {
        this.name = name;
        this.modifiedDate = modifiedDate;
        this.size = size;
        this.parent = parent;
    }

    public Component getParent() {
        return this.parent;
    }

    public String dateModified() {
        return this.modifiedDate;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        String toString =  this.name + " " + this.getType() + " "
                + this.getSize() + " " + this.modifiedDate + " ";
        if (this.parent != null) {
            toString = toString + this.parent.getName();
        } else {
            toString = toString + "null";
        }

        return toString;

    }

    public abstract String getType();

    public abstract void addComponent(Component component);

    public void print(Predicate<Component> predicate) {
        if (predicate.isValid(this)) {
            System.out.println(this.toString());
        }
    }

    public void print() {
        System.out.println(this.toString());
    }
    
    public void compute(Predicate<Component> predicate, Functor<Component,Integer> functor){
        if(predicate.isValid(this)){
            functor.execute(this);
        }
    }
}
