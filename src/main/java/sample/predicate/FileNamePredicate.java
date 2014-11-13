/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.predicate;

import java.util.ArrayList;
import java.util.List;
import sample.filestructure.Component;

/**
 *
 * @author malalanayake
 */
public class FileNamePredicate extends Predicate<Component> {

    String name;

    public FileNamePredicate(String name) {
        this.name = name;
    }

    @Override
    public boolean isValid(Component t) {
        if (t.getName().startsWith(this.name)) {
            for (Predicate p : this.andPredicate) {
                if (!p.isValid(t)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

}
