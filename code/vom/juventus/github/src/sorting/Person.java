package code.vom.juventus.github.src.sorting;

public class Person {
    private String firstName;
    private String lastName;
    private Integer plz;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Integer plz) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.plz = plz;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getPlz() {
        return plz;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", plz=" + plz +
                '}';
    }
}
