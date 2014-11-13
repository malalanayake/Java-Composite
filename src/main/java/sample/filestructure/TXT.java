/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.filestructure;

/**
 *
 * @author malalanayake
 */
public class TXT extends Component{

    public TXT(String name, String modifiedDate, int size, Component parent) {
        super(name, modifiedDate, size, parent);
         parent.addComponent(this);
    }

    @Override
    public String getType() {
      return "TXT";    
    }

    @Override
    public void addComponent(Component component) {
        
    }
    
}
