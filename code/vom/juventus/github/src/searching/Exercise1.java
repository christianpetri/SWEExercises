package code.vom.juventus.github.src.searching;


import code.vom.juventus.github.src.sorting.Person;


import java.util.*;

public class Exercise1 {

    static Map<Person, String> people;

    public static void main(String[] args) {
        people = new HashMap<>();
        people.put(new Person("Hans", "Muster"), "0791232345");
        people.put(new Person("Peter", "Keller"), "0769987656");
        people.put(new Person("Peter", "Kuster"), "0785546767");
        people.put(new Person("Lisa", "Muster"), "0773394545");

        System.out.println("Find person with phone number 0791232345:");
        System.out.println(findPersonByPhoneNumber("0791232345"));
        System.out.println("Find person with phone number 0091232345:");
        System.out.println(findPersonByPhoneNumber("0091232345"));
    }

    static Person findPersonByPhoneNumber (String number){
        if(!people.containsValue(number)) return null;
        Iterator<Map.Entry<Person, String>> iterator = people.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, String> entry = iterator.next();
            if(entry.getValue().equals(number)){
                return entry.getKey();
            }
        }
        return null;
    }
}