
package sample.predicate;

import java.util.ArrayList;
import java.util.List;
import sample.filestructure.Component;

/**
 *
 * @author malalanayake
 */
public class FileSizePredicate implements Predicate<Component>{
    List<Predicate> andPredicate;
    int size;

    public FileSizePredicate(int size) {
        andPredicate = new ArrayList<>();
        this.size = size;
    }
    

    @Override
    public boolean isValid(Component t) {
        if(t.getSize() > this.size){
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
