import java.util.Date;

/**
 * This class is a block from which all blockchain consist
 */
public class Block {

    public String hash;
    public String previousHash;
    public String data; //data will be a simple message
    public long timestamp; //time as number of milliseconds

    //Block Constructor
    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash(); // we need to calculate hash after all other values are set
    }

    /**
     * This method calculates fingerprint we use to chain blocks
     */
    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(
                previousHash + data + Long.toString(timestamp)
        );
        return calculatedhash;
    }
}
