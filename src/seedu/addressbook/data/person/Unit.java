package seedu.addressbook.data.person;

public class Unit {
    private String unit;
    public Unit(String unit) {
        this.unit = unit;
    }

    /**
     * Getter method
     * @return unit of address
     */
    public String getUnit() {
        return unit;
    }

    /**
     *
     * @return if the units are the same
     */
    public boolean equal(Unit other) {
        return unit.equals(other.getUnit());
    }
}
