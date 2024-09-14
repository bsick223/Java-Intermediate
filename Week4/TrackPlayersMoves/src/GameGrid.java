import java.security.SecureRandom;
import java.util.Scanner;

public class GameGrid {
    public void run(){

        LinkedList oLinkedList = new LinkedList();

        // array of integer grid
        int rows = 10;
        int columns = 10;


        int[][] aiGrid = new int[rows][columns];

        SecureRandom oRand = new SecureRandom();

        int iWallChance = 10;

        for (int y = 0; y < aiGrid.length; y++) {

            for (int x = 0; x < aiGrid[y].length; x++) {

                int iChance = oRand.nextInt(100);
                // If chance below wall chance, then add wall.
                if (iChance < iWallChance) {
                    aiGrid[y][x] = 1;
                } else {
                    aiGrid[y][x] = 0;
                }

    //                aiGrid[y][x] = oRand.nextInt(2); // exclusive upward bound

                // printing grid...
                // System.out.print(aiGrid[y][x] + " ");
            }
            // printing grid...
            // System.out.println();
        }
            // Starting position is 0
        aiGrid[0][0] = 0;

        // user's position
        int iUserRow = 0;
        int iUserCol = 0;

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nYour position: (" + iUserRow + ", " + iUserCol + ")");
            System.out.println("Use WASD controls.. Enter S for DOWN, D for RIGHT. Enter Q to exit.");

            String userInput = sc.next().toLowerCase();

            oLinkedList.addNode(iUserCol, iUserRow);

            if (userInput.equals("s")) {
                iUserRow += 1;
            } else if (userInput.equals("q")) {
                exit = true;
            } else {
                // Move right
                iUserCol += 1;
            }

            // check for barrier
            if (aiGrid[iUserRow][iUserCol] == 1) {
                System.out.println("Ouch!  You hit a barrier, game over. ");
                exit = true;
            }

            if (iUserRow == rows - 1 || iUserCol == columns - 1) {
                System.out.println("Winner!  Good job.");
                exit = true;
            }
        }

        int count = 0;
        // Linked List removed and processed
        while (oLinkedList.headNode != null) {


            Node returnedNode = oLinkedList.removeNode();
//            if (returnedNode != null) {
            aiGrid[returnedNode.yPosition][returnedNode.xPosition] = 8;
            count++;
//            } else {
//                break;
//            }


            // count
        }

        // print the final grid
        for (int y = 0; y < aiGrid.length; y++) {

            for (int x = 0; x < aiGrid[y].length; x++) {

                // check if user is here
                if (iUserRow == y && iUserCol == x) {
                    System.out.print("X ");
                } else {
                    // printing grid...
                    System.out.print(aiGrid[y][x] + " ");
                }



            }
            // printing grid...
            System.out.println();
        }

        System.out.println("Total Player moves = " + count);

    }
}


