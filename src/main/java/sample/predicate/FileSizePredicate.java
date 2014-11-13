
package sample.predicate;

import java.util.ArrayList;
import java.util.List;
import sample.filestructure.Component;

/**
 *
 * @author malalanayake
 */
public class FileSizePredicate extends Predicate<Component>{
    int size;

    public FileSizePredicate(int size) {
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

    
}
