import ch.juventus.java.javadoc.MathUtils;
import object.Person;


public class Main {

    public static void main(String[] args) {
        MathUtils calc = new MathUtils();
        double result = calc.subtraction(1,15);

        System.out.println( result );

        Person andi     =   new Person("Andi",12);
        Person peter    =   new Person("Andi",12);

        System.out.println(andi.equals(peter));
        System.out.println(andi.toString());
    }
}
