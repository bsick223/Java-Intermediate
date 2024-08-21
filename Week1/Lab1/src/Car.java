public class Car extends MotorVehicle{
    private int seats;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void start() {
        setRunning(true);

        // The inherited variables
        System.out.println("Running = " + getRunning());
        System.out.println("Horsepower = " + getHorsePower());

        // special instance variable
        System.out.println("Number of seats = " + seats);

        // What type of vehicle (car or motorcycle)
        System.out.println("This is a car");

        // whether it has been started or stopped
        System.out.println("This car has started. ");
    }

    public void stop() {
        setRunning(false);

        // The inherited variables
        System.out.println("Running = " + getRunning());
        System.out.println("Horsepower = " + getHorsePower());

        // special instance variable
        System.out.println("Number of seats = " + seats);

        // What type of vehicle (car or motorcycle)
        System.out.println("This is a car");

        // whether it has been started or stopped
        System.out.println("This car has stopped. ");

    }
}
