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
public class FileNamePredicate implements Predicate<Component>{
List<Predicate> andPredicate;
    String name;

    public FileNamePredicate(String name) {
        andPredicate = new ArrayList<>();
        this.name = name;
    }
    
    
    
    @Override
    public boolean isValid(Component t) {
        if(t.getName().startsWith(this.name)){
            for(Predicate p: this.andPredicate){
                if(!p.isValid(t)){
                    return false;
                }
            }
            return true;
        }
        
        return false;
    }

    @Override
    public Predicate<Component> and(Predicate<Component> p) {
        this.andPredicate.add(p);
        return this;
    }

    @Override
    public Predicate<Component> or(Predicate<Component> p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
