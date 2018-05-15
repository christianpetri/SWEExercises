package code.vom.juventus.github.src.sorting;

import java.util.Comparator;

public class PlzComperator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPlz().compareTo(o2.getPlz());
    }
}
