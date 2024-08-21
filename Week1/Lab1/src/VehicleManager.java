import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleManager {
    private Car[] cars = new Car[3];
    private Motorcycle[] motorcycles = new Motorcycle[3];

    String[] typesOfMotorcycles = {"Sports Bike", "Harley Davidson", "Scooter"};
    int[] horsePowersMotorcycles = {550, 250, 80};

    int[] horsePowersCars = {125, 365, 425};
    int[] seatsCars = {2, 4, 5};

    boolean validInput = false;


    Scanner scnr = new Scanner(System.in);

    public void run() {
        for (int i = 0; i < 3; i++) {

            cars[i] = new Car();
            cars[i].setRunning(false);
            cars[i].setHorsePower(horsePowersCars[i]);
            cars[i].setSeats(seatsCars[i]);

            motorcycles[i] = new Motorcycle();
            motorcycles[i].setRunning(false);
            motorcycles[i].setHorsePower(horsePowersMotorcycles[i]);
            motorcycles[i].setType(typesOfMotorcycles[i]);

        }

        // menu for choosing what car to start
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car "  + "[" + (i+1) + "]");
        }
        // list the cars with number and ask which one to start (1 - 3)
        System.out.print("Select which car you'd like to start (1 - 3): ");
        while (!validInput) {
            try {

                int carChoice = scnr.nextInt();

                // when # is picked, then the start method for that object is called (0-2)
                if (carChoice >= 1 && carChoice <= 3) {
                    cars[carChoice - 1].start();
                    validInput = true;
                    break;
                } else {
                    System.out.print("Invalid choice. Please select a number between a number between 1 and 3: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please select a number between a number between 1 and 3: ");
                scnr.next();  // Clear the invalid input from the scanner buffer
            }
         } validInput = false;

        // same above; Start for Motorcycle
        for (int i = 0; i < motorcycles.length; i++) {
            System.out.println("Motorcycle " + "[" + (i+1) + "]");
        }

        System.out.print("Select which motorcycle you'd like to start (1 - 3): ");
        while (!validInput) {
            try {
                int userChoiceMotor = scnr.nextInt();

                if (userChoiceMotor >= 1 && userChoiceMotor <= 3) {
                    motorcycles[userChoiceMotor - 1].start();
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please select a number between a number between 1 and 3: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please select a number between a number between 1 and 3: ");
                scnr.next();  // Clear the invalid input from the scanner buffer
            }
        } validInput = false;

        // Third is which car to STOP
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + "[" + (i+1) + "]");
        }
        System.out.print("Select which car you'd like to stop (1 - 3): ");
        while(!validInput) {
            try {
                int userStopChoice = scnr.nextInt();

                if (userStopChoice >= 1 && userStopChoice <= 3) {
                    cars[userStopChoice - 1].stop();
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please select a number between a number between 1 and 3: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please select a number between a number between 1 and 3: ");
                scnr.next();  // Clear the invalid input from the scanner buffer
            }
        } validInput = false;
        // last is which motorcycle to stop

        for (int i = 0; i < motorcycles.length; i++) {
            System.out.println("Motorcycle " + "[" + (i+1) + "]");
        }
        System.out.print("Select which motorcycle you'd like to stop (1 - 3): ");
        while(!validInput) {
            try {
                int userStopMotor = scnr.nextInt();

                if (userStopMotor >= 1 && userStopMotor <= 3) {
                    motorcycles[userStopMotor - 1].stop();
                    validInput = true;
                } else {
                    System.out.print("Invalid choice. Please select a number between a number between 1 and 3: ");

                }
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please select a number between a number between 1 and 3: ");
                scnr.next();  // Clear the invalid input from the scanner buffer
            }
        } validInput = false;

        // Display all vehicles status on whether they're running or not.
        for (int i = 0; i < 3; i++) {System.out.println("Car " + (i + 1) + " running = " + cars[i].getRunning());}
        for (int i = 0; i < 3; i++) {System.out.println("Motorcycle " + (i+1) + " running = " + cars[i].getRunning());}




    }

}
