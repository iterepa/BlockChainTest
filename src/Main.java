public class Main {
    public static void main(String[] args) {

        //first block in chain named genesis block
        Block genesisBlock = new Block("Hi im the first block", "0");
        System.out.println("Hach for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Hi im the second block", genesisBlock.hash);
        System.out.println("Hach for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hi im the third block", secondBlock.hash);
        System.out.println("Hach for block 3 : " + thirdBlock.hash);
    }

}