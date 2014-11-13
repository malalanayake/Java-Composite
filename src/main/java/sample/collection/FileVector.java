package sample.collection;

import java.util.Iterator;
import java.util.Vector;
import sample.predicate.Predicate;

/**
 *
 * @author malalanayake
 */
public class FileVector<T> extends Vector<T> {

    public Iterator<T> getSelectiveIterator(Predicate<T> predicate) {
        return new SelectiveIterator<T>(this,predicate);
    }

    public class SelectiveIterator<T> implements Iterator<T> {

        private FileVector<T> myVector;
        private int currentIndex = 0;
        Predicate<T> predicate;

        SelectiveIterator(FileVector fileVector, Predicate<T> predicate) {
            this.myVector = myVector;
            this.predicate = predicate;
        }

        @Override
        public boolean hasNext() {
            while (myVector.size() > currentIndex) {
                //predicate is null then work for all
                if (predicate != null) {
                    if (predicate.isValid(myVector.get(currentIndex))) {
                        currentIndex++;
                        return true;
                    } else {
                        currentIndex++;
                    }
                } else {
                    currentIndex++;
                    return true;
                }
            }
            return false;
        }

        @Override
        public T next() {
            T next = myVector.get(currentIndex - 1);
            return next;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
