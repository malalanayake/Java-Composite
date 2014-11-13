package sample.filestructure;

/**
 *
 * @author malalanayake
 */
public class XL extends Component {

    public XL(String name, String modifiedDate, int size, Component parent) {
        super(name, modifiedDate, size, parent);
        parent.addComponent(this);
    }

    @Override
    public String getType() {
        return "XL";
    }

    @Override
    public void addComponent(Component component) {

    }

}
