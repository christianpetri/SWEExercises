package code.vom.juventus.github.src.foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

    final static Logger log = LoggerFactory.getLogger(Java8.class);

    public static void main(String [ ] args) {


        log.debug("debug log");











//        List<String> strings = new ArrayList<>();
//        strings.add("hello world");
//        strings.add("java8");
//        strings.add("lilililulululololo");
//
//        Consumer<String> consumer = s -> System.out.println(s + " " + s.length());
//
//        strings.forEach(consumer);



//        Function<Date, String> function = date -> "Now is " + date.toString();
//        System.out.println(function.apply(new Date()));
//
//        Function<Integer, Integer> function1 =  x -> x+1;


//        MathOperation addition = (int a, int b) -> a + b;
//        MathOperation subtraction = (int a, int b) -> a - b;
//        MathOperation multiplication = (int a, int b) -> a * b;
//        MathOperation division = (int a, int b) -> a / b;
//
//        System.out.println("Addition " + operate(2, 3, addition));
//        System.out.println("Subtraction " + operate(10, 5, subtraction));
//        System.out.println("Multiplication " + operate(1, 1, multiplication));
//        System.out.println("Division " + operate(20, 2, division));
//        System.out.println("Other division " + operate(20, 2, (a, b) -> a / b));


        // Map Methode um alle Integer in einem Stream * 2 zu rechnen:
//        Stream<Integer> names = Stream.of(1, 2, 3, 4, 5);
//        System.out.println(names.map(integer -> {
//            return integer*2;
//        }).collect(Collectors.toList()));
//
//
//        Stream<List<Integer>> namesOriginalList = Stream.of(
//                Arrays.asList(1,2,3),
//                Arrays.asList(1,3,4),
//                Arrays.asList(3, 10, 88));
//
//        System.out.println(namesOriginalList);
//
//        Stream<Integer> flatStream = namesOriginalList.flatMap(integers -> integers.stream());




//        Person person2 = new Person("Peter", 22);
//        Person person3 = new Person("Hans", 33);
//        Person person4 = new Person("Anan", 26);
//        List<Person> people = new ArrayList<>();
//        people.add(person1);
//        people.add(person2);
//        people.add(person3);
//        people.add(person4);
//
//        boolean allOver18 = people.stream()
//                .filter(p -> p.getName().startsWith("A"))
//                .map(p -> {
//                    p.setName(p.getName().toUpperCase());
//                    return p;})
//                .allMatch(p -> p.getAge() > 18);
//
//        System.out.println(allOver18);


    }

//    private static int operate(int a, int b, MathOperation mathOperation) {
//        return mathOperation.operation(a, b);
//    }


}
