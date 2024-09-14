import java.util.Scanner;



/**
 * Hash codes
 *
 * apple (H0): 3a7bd3e2360a3d29eea436fcfb7e44c735d117c42d1c1835420b6b9942dd4f1b
 *
 * banana (H1): b493d48364afe44d11c0165cf470a4164d1e2609911ef998be868d46ade3de4e
 *
 * orange (H2): 1b4c9133da73a711322404314402765ab0d23fd362a167d6f0c65bb215113d94
 *
 * cherry (H3): 2daf0e6c79009f9234ed9baa5bb930898e2847810617e118518d88e4d3140a2e
 *
 * H4 (H0 + H1): 004e48bbd922653f4cb0b656f13dbaaf72974acea5d6d836ba240ddcc780a994
 *
 * H5 (H2 + H3): 0c6c5a2340cc121ed96a9750c4368e924f7c6e596eff0e7c458b1f7ea16f7e98
 *
 * Merkle Root-H6 (H4 + H5): 1eb2b6fdf90cae9e012e9cda924d4992cf5ed2325e6f087929b87823ba512c15
 */

public class MerkleManager {
    Scanner scnr = new Scanner(System.in);


    public static volatile String userWord;
    public static String userMerkleRoot;
    public static String merkleRoot = null;
    public static int strikes = 0;

    public void manage() {
        Util oUtil = new Util();

        System.out.println("Please enter the expected Merkle Root: ");
        userMerkleRoot = scnr.nextLine();


        // Starting threads here

        MerkleThread oMerkleThread = new MerkleThread();
        RogueThread oRogueThread = new RogueThread();
        MonitorThread oMonitorThread = new MonitorThread();

        Thread oThread1 = new Thread(oMerkleThread);
        Thread oThread2 = new Thread(oRogueThread);
        Thread oThread3 = new Thread(oMonitorThread);

        oThread1.start();
        oThread2.start();
        oThread3.start();


        while (true) {
            System.out.println("Please enter a word: ");
            userWord = scnr.nextLine();

        }
    }

    public static synchronized String grabWord(){
        String tempWord = userWord;
        userWord = null;
        return tempWord;
    }

}

