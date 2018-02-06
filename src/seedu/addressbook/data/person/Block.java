package seedu.addressbook.data.person;

public class Block {
    private String block;
    public Block(String blk) {
        block = blk;
    }

    /**
     * Getter method
     * @return block of address
     */
    public String getBlock() {
        return block;
    }

    /**
     *
     * @return if the block number is the same
     */
    public boolean equal(Block other) {
        return block.equals(other.getBlock());
    }
}
