package ch.juventus.java.sort;

import ch.juventus.java.collections.Person;

import java.util.*;

/**
 * @author : ${user}
 * @since: ${date}
 */
public class Sort {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Hans", "Muster"));
        persons.add(new Person("Peter","Keller"));
        persons.add(new Person("Peter", "Kuster"));
        persons.add(new Person("Lisa", "Muster"));
        persons.add(new Person("Lisa", "Muster"));
        persons.add(new Person("Peter", "Z"));
        persons.add(new Person("Peter", "Y"));
        persons.add(new Person("Peter", "M"));

        System.out.println(persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getFirstName().equals(o2.getFirstName())){
                    return o1.getLastName().compareTo(o2.getLastName());
                }
               return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        System.out.println(persons);


        Map<Person, String > personsWithPhone = new HashMap<>();

        personsWithPhone.put(new Person("Hans","Meier"), "123");
        personsWithPhone.put(new Person("Hans","Keller"), "143");
        System.out.println(personsWithPhone);

        System.out.println(personsWithPhone.containsValue("123"));
        System.out.println(personsWithPhone.size());

        for(int i = 0; i < personsWithPhone.size(); i++ ){
            System.out.println(i);
                System.out.println(personsWithPhone.get(i));
        }
        //Iterator<Map.>


    }
}