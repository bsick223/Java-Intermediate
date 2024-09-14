import java.security.SecureRandom;

public class Week3Test {
    public static void main(String[] args) {
//        SecureRandom oRand = new SecureRandom();
//
//        oRand.setSeed(25);
//        int iNum = oRand.nextInt(10); // 10, would be 0 - 9
//        System.out.println("num: " + iNum);
//
//        iNum = oRand.nextInt(10);
//        System.out.println("Num2: " + iNum);

        Week3Test oTest = new Week3Test();

        oTest.createGameGrid();

    }

    public void createGameGrid() {

        // array of integer grid
        int[][] aiGrid = new int[10][8];

        SecureRandom oRand = new SecureRandom();
        int iWallChance = 10;

        for (int y = 0; y < aiGrid.length; y++) {
            for (int x = 0; x < aiGrid[y].length; x++) {

                int iChance = oRand.nextInt(100);
                // If chance below wall chance, then add wall.
                if(iChance < iWallChance) {
                    aiGrid[y][x] = 1;
                } else {
                    aiGrid[y][x] = 0;
                }

//                aiGrid[y][x] = oRand.nextInt(2); // exclusive upward bound
                System.out.print(aiGrid[y][x] + " ");

            }

            System.out.println();
        }
    }


}










//        // used in databases
//        System.out.println(System.currentTimeMillis());