package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

import javax.print.attribute.standard.MediaSize;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "a/123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Address entered must be in the following format \"a/BLOCK, STREET, UNIT, POSTAL_CODE\"";
    public static final String ADDRESS_VALIDATION_REGEX = "\\d+\\s*+[,][-\\w\\s]+[,]\\s*[-\\d|#|-]+\\s*[,]\\s*\\d*+";

    public final Block block;
    public final Street street;
    public final Unit unit;
    public final PostalCode postalCode;

    public final String value;

    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] addressParts = trimmedAddress.split(",");
        for (String addressPart : addressParts) {
            addressPart = addressPart.trim();
        }
        block = new Block(addressParts[0]);
        street = new Street(addressParts[1]);
        unit = new Unit(addressParts[2]);
        postalCode = new PostalCode(addressParts[3]);

        value = toString();
    }


    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", block, street, unit, postalCode);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == this) // short circuit if same object
            return true;
        Address other = (Address) otherObject;
        return block.equals(other.block.getBlock()) &&
                street.equals(other.street.getStreet()) &&
                unit.equals(other.unit.getUnit()) &&
                postalCode.equals(other.postalCode.getPostalCode());
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
