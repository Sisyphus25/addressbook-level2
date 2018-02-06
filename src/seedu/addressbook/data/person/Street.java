package seedu.addressbook.data.person;

public class Street {
    private String street;
    public Street(String str) {
        street = str;
    }

    /**
     * Getter method
     * @return street of address
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @return if the streets are the same
     */
    public boolean equal(Street other) {
        return street.equals(other.getStreet());
    }
}
