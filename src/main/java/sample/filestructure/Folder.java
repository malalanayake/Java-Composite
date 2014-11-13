/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.filestructure;

import java.util.Vector;
import sample.collection.FileVector;
import sample.predicate.Predicate;

/**
 *
 * @author malalanayake
 */
public class Folder extends Component {

    FileVector<Component> list;

    public Folder(String name, String modifiedDate, Component parent) {
        super(name, modifiedDate, 0, parent);
        list = new FileVector<>();
        if (parent != null) {
            parent.addComponent(this);
        }
    }

    @Override
    public String getType() {
        return "Folder";
    }

    @Override
    public void addComponent(Component component) {
        list.add(component);
    }

    @Override
    public int getSize() {
        this.size = 0;
        for (Component component : list) {
            size = size + component.getSize();
        }
        return size;
    }

    @Override
    public void print() {

        System.out.print("" + this.name + " " + this.getType() + " "
                + this.getSize() + " " + this.modifiedDate + " ");
        if (this.parent != null) {
            System.out.print(this.parent.getName());
        } else {
            System.out.print("null");
        }

        System.out.println();

        for (Component component : list) {
            component.print();
        }
    }

    @Override
    public void print(Predicate<Component> predicate) {
        if (predicate.isValid(this)) {
            System.out.println(this.toString());
        }

        for (Component c : this.list) {
            if (predicate.isValid(c)) {
                System.out.println(c.toString());
            }
        }
    }

}
