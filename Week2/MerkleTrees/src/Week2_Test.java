import java.util.ArrayList;

public class Week2_Test {

    public static void main(String[] args) {

        // *****************************
        // BEGIN merkle Root test
        ArrayList<String> lstWords = new ArrayList<>();
        lstWords.add("word1"); // leafs of merkle tree
        lstWords.add("word2");
        lstWords.add("word3");
        lstWords.add("word4");

        Util oUtil = new Util();
        String sMerkleRoot = oUtil.getMerkleRoot(lstWords);

        System.out.println("Merkle root: "+ sMerkleRoot);

        // *********************************
        // *** BEGIN Multithreaded test ****

        // 1. Create an instance of the target class
        MinerThread oMiner1 = new MinerThread();
        oMiner1.threadName = "Miner 1";
        MinerThread oMiner2 = new MinerThread();
        oMiner2.threadName = "Miner 2";

        // 2. Instantiate a Thread class and pass in the above object
        Thread oThread1 = new Thread(oMiner1);
        Thread oThread2 = new Thread(oMiner2);

        // 3. Call the start method on the Thread instance.
        // use the instance^^
        oThread1.start(); //Spawns off the new thread (the run method).
        oThread2.start(); //Spawns off the new thread (the run method).

        System.out.println("This is the main thread.");
    }
}























/*
word1 = 8b10450019daaf7c2812e14cf6edeb2263e2b45f3a2ef4342a8a3cde8ff7df5f
word2 = afb39cadcd789669ee335b580724df9adbee7200c0340047d5ab6e9c69487a2b
word3 = ffca7f8893c2cd4d63996c0135c8e1f35fdfc981486a8e4c24fe8fb5d8758510
word4 = da466d4eb03fcd5bfd5275282f9f595eca6e88b45f96a3ff0e10a6ad7e84743b

Node5 = 0f4c8f50cd8f237c93dfebab45a57aff1be47ec8cdd8466cf6b7df51a159eb60

Node6 = 6e81f923a72e4ce3d91d7131d38453b6ee2221dfa32a4a20b8c2ca15f8313d21

Node7 (Merkle Root) = 0264d08de65fcd9ee5767a3c8e87a56a6f554137082898a10fd228331c092ffa
 Success!
 https://xorbin.com/tools/sha256-hash-calculator
 */