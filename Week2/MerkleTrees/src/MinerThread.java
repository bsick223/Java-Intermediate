public class MinerThread implements Runnable {
    // multi-threading
    public String threadName;

    public void run() {

        System.out.println(threadName + " has started!");

        Util oUtil = new Util();
        // Endless loop to keep thread alive.
        while(true){

            oUtil.sleepRandomTime(threadName);

            System.out.println(threadName + " just woke up.");

        }
    }
}
