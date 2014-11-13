package sample.client;

import sample.filestructure.Component;
import sample.filestructure.DOCX;
import sample.filestructure.Folder;
import sample.filestructure.TXT;
import sample.filestructure.XL;
import sample.predicate.FileNamePredicate;
import sample.predicate.FileSizePredicate;

/**
 *
 * @author malalanayake
 */
public class Client {

    public static void main(String[] args) {
        Component rootFolder = new Folder("Root", "12/12/1998", null);
        Component a = new TXT("a", "12/12/1999", 50, rootFolder);
        Component b = new DOCX("b", "12/12/2001", 20, rootFolder);
        Component userFolder = new Folder("User", "12/12/2002", rootFolder);
        Component c = new XL("c", "12/12/2002", 30, userFolder);
        
        Component cs433 = new Folder("cs433", "11/12/2014", userFolder);
        Component readme = new TXT("readme", "11/12/2014", 20, cs433);
        
        rootFolder.print();
        System.out.println("\n\n");
        FileSizePredicate fs = new FileSizePredicate(30);
        FileNamePredicate fn = new FileNamePredicate("U");
        rootFolder.print(fs.and(fn));
        
        
    }
}
