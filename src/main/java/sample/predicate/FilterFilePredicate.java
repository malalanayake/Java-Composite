package sample.predicate;

import sample.filestructure.Component;

/**
 *
 * @author malalanayake
 */
public class FilterFilePredicate extends Predicate<Component>{

    String type;
    public FilterFilePredicate(String type) {
        this.type  = type;
    }
    
    

    @Override
    public boolean isValid(Component t) {
        if(t.getType().equals(this.type)){
           for(Predicate p:this.listOfPredicates){
               if(!p.isValid(t)){
                   return false;
               }
           }
           return true;
        }  
        return false;
    }

}
