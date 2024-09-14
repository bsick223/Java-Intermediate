import java.util.ArrayList;

public class MerkleThread implements Runnable {
    public static volatile ArrayList<String> lstWords;
    private int iMerkleTreeInputs = 4;

    @Override
    public void run() {
        Util util = new Util();
        lstWords = new ArrayList<String>();

        while (true) {
            util.sleepRandomTime("Merkle");
            String sNewWord = MerkleManager.grabWord();
            if (sNewWord != null) {
                System.out.println("Merkle grabbed a word!");
                lstWords.add(sNewWord);
                if (lstWords.size() == iMerkleTreeInputs)
                    MerkleManager.merkleRoot = util.getMerkleRoot(lstWords);
            }
        }
    }
}
