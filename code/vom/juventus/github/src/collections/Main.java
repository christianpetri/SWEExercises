package code.vom.juventus.github.src.collections;

import java.util.*;

public class Main {

    public static void main(String [ ] args) {

        List list = new ArrayList();
        list.add("Hund");
        list.add("Katze");
        list.add("Maus");
        list.add("Vogel");
        list.add("Reh");
        list.add("Elefant");
        list.add("Tieger");
        list.add("Spinne");
        list.add("Bär");
        list.add("Frosch");

        //System.out.println("Size: " + list.size());
        //System.out.println("Contains element 'Frosch'? " + list.contains("Frosch"));
        //System.out.println("Read element with index 2: " + list.get(2));
        //System.out.println("Delete element with index 20 ");
        //list.remove(20);
        //System.out.println("Delete element 'Foo' ");
        //list.remove("Foo");
        //System.out.println("Delete all elements");
        //list.clear();
        //System.out.println("List: " + list);


        LinkedList linkedList = new LinkedList();
        linkedList.add("Hund");
        linkedList.add("Katze");
        linkedList.add("Maus");
        linkedList.add("Vogel");
        linkedList.add("Reh");
        linkedList.add("Elefant");
        linkedList.add("Tieger");
        linkedList.add("Spinne");
        linkedList.add("Bär");
        linkedList.add("Frosch");

        //System.out.println("Size: " + linkedList.size());
        //System.out.println("Index of 'Elefant': " + linkedList.indexOf("Elefant"));
        //System.out.println("Index of 'Foo': " + linkedList.indexOf("Foo"));
        //System.out.println("Element with index 2: " + linkedList.get(2));
        //System.out.println("Read first and last element: " + linkedList.getFirst() + ", " + linkedList.getLast());
        //System.out.println("Delete first and last element");
        //linkedList.removeFirst();
        //linkedList.removeLast();
        //System.out.println("List: " + linkedList);

        Set hashSet = new HashSet();
        hashSet.add(new Person("Hans", "Muster"));
        hashSet.add(new Person("Peter", "Keller"));
        hashSet.add(new Person("Hans", "Muster"));
        hashSet.add(new Person("Anna", "Mueller"));

        //System.out.println("Is set empty? " + hashSet.isEmpty());
        //System.out.println("Size " + hashSet.size());
        //System.out.println("Contains Anna Mueller? " + hashSet.contains(new Person("Anna", "Mueller")));
        //System.out.println("Delete Anna Mueller");
        //hashSet.remove(new Person("Anna", "Mueller"));
        //System.out.println("Set: " + hashSet);

        Set treeSet = new TreeSet();
        treeSet.add("Adler");
        treeSet.add("Zebra");
        treeSet.add("Bär");

        System.out.println(treeSet);

        List<Person> family = new ArrayList<>();
        family.add(new Person("Lydia", "Krüger"));
        family.add(new Person("Viola", "Krüger"));
        family.add(new Person("Richi", "Krüger"));

        List<Person> friends = new ArrayList<>();
        friends.add(new Person("Anne", "Rieder"));
        friends.add(new Person("Stephen", "Lynch"));
        friends.add(new Person("Anthony", "Chappuis"));

        List<Person> office = new ArrayList<>();
        office.add(new Person("Martina", "Wulf"));
        office.add(new Person("Jose", "Badeau"));

        Map<String, List<Person>> hashMap = new HashMap();

        hashMap.put("family", family);
        hashMap.put("office", null);
        hashMap.put("friends", friends);

        //System.out.println("Map: " + hashMap);
        //System.out.println("Add office entry");
        //hashMap.put("office", office);
        //System.out.println("Map: " + hashMap);
        //System.out.println("Entry set: " + hashMap.entrySet());
        //System.out.println("Key set: " + hashMap.keySet());
        //System.out.println("Values: " + hashMap.values());

        System.out.println("-----List-----");
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();
        System.out.println("-----Set-----");
        Iterator<Person> setIterator = hashSet.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        System.out.println();
        System.out.println("-----Map-----");
        Iterator<Map.Entry<String, List<Person>>> mapIterator = hashMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, List<Person>> element = mapIterator.next();
            System.out.println(element.getKey() + ": " + element.getValue());
        }

    }
}
