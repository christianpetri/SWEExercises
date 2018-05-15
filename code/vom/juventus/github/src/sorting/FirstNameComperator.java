package code.vom.juventus.github.src.sorting;

import java.util.Comparator;

public class FirstNameComperator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getFirstName().compareTo(o2.getFirstName());
        if(result == 0) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
        return result;
    }
}
