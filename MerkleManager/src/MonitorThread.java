public class MonitorThread implements Runnable {
    public void run() {
        Util util = new Util();

        while (true) {
            if (MerkleManager.merkleRoot != null) {
                if (MerkleManager.merkleRoot.equals(MerkleManager.userMerkleRoot)) {
                    System.out.println("You win! Merkle root: " + MerkleManager.merkleRoot);
                    System.exit(0);
                } else {
                    System.out.println("You lost! Merkle root did not match.");
                    System.exit(0);
                }
            }

            if (MerkleManager.strikes == 3) {
                System.out.println("3 strikes: you lost!");
                System.exit(0);
            }

            util.sleep(1);  // Sleep for 1 second
        }
    }
}