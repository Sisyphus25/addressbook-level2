package seedu.addressbook.data.person;

public class PostalCode {
    private String postalCode;
    public PostalCode(String posCode) {
        postalCode = posCode;
    }

    /**
     * Getter method
     * @return postal code of address
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     *
     * @return if the postal codes are the same
     */
    public boolean equal(PostalCode other) {
        return postalCode.equals(other.getPostalCode());
    }
}
