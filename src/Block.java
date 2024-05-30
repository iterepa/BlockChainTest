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
    }

}
