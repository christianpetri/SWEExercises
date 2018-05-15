package code.vom.juventus.github.src.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hans", "Muster"));
        people.add(new Person("Peter", "Keller"));
        people.add(new Person("Peter", "Kuster"));
        people.add(new Person("Lisa", "Muster"));

        System.out.println("List before sorting:");
        System.out.println(people);
        System.out.println("List after sorting:");
        Collections.sort(people, new FirstNameComperator());
        System.out.println(people);

        List<Person> peopleWithPlz = new ArrayList<>();
        peopleWithPlz.add(new Person("Hans", "Muster", 8037));
        peopleWithPlz.add(new Person("Peter", "Keller", 8048));
        peopleWithPlz.add(new Person("Peter", "Kuster", 8037));
        peopleWithPlz.add(new Person("Lisa", "Muster", 8052));

        System.out.println("List before sorting according to plz:");
        System.out.println(peopleWithPlz);
        System.out.println("List after sorting according to plz:");
        Collections.sort(peopleWithPlz, new PlzComperator());
        System.out.println(peopleWithPlz);
    }
}