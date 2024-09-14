public class RogueThread implements Runnable {
    @Override
    public void run() {
        Util util = new Util();

        while (true) {
            util.sleepRandomTime("Rogue");
            String sNewWord = MerkleManager.grabWord();
            if (sNewWord != null) {
                System.out.println("Rogue grabbed a word! STRIKE!");
                MerkleManager.strikes++;
            }
        }
    }
}
