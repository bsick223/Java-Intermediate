

// Name: Brendan Sick
// CSIS 294
// Summary -> Build an app that randomly creates a 10 by 10 grid of 0s and 1s where the 0s represent open spaces and 1s represent  blocked spaces (like we did in class),
// and then see if user can navigate from position 0,0 to where either the first index or second index equal 9 w/o hitting a 1.
// In other words the user must move clear across the grid without hitting a 1 or the game is over.

public class GameGrid_Test {
    public static void main(String[] args) {
        GameGrid oGameGrid = new GameGrid();
        oGameGrid.run();
    }
}
