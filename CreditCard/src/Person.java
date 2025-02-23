public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor
    public Person(String last, String first, Address residence) {
        lastName = last;
        firstName = first;
        home = residence;
    }

    // toString method
    public String toString() {
        return(firstName + " " + lastName + ", " + home.toString());
    }
}
