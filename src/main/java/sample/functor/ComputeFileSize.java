
package sample.functor;

import sample.filestructure.Component;

/**
 *
 * @author malalanayake
 */
public class ComputeFileSize implements Functor<Component, Integer>{

    Integer totalSize;
    public ComputeFileSize() {
        totalSize = 0;
    }

    
    @Override
    public void execute(Component data) {
        this.totalSize = this.totalSize+data.getSize();
    }

    @Override
    public Integer getValue() {
        return this.totalSize;
    }
    
}
