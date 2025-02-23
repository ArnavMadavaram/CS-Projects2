public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String road, String town, String st, String zipCode) {
        street = road;
        city = town;
        state = st;
        zip = zipCode;
    }

    // toString method
    public String toString() {
        return (street + ", " + city + ", " + state + " " + zip);
    }
}
