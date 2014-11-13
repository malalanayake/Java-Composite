package sample.filestructure;

/**
 *
 * @author malalanayake
 */
public class DOCX extends Component {

    public DOCX(String name, String modifiedDate, int size, Component parent) {
        super(name, modifiedDate, size, parent);
        parent.addComponent(this);
    }

    @Override
    public String getType() {
        return "DOCX";
    }

    @Override
    public void addComponent(Component component) {

    }

    @Override
    public void print() {
        System.out.println("" + this.name + " " + this.getType() + " "
                + this.size + " " + this.modifiedDate + " " + this.parent.getName());
    }

}
