import java.sql.SQLOutput;

public class Motorcycle extends MotorVehicle {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void start() {
        setRunning(true);

        // The inherited variables
        System.out.println("Running = " + getRunning());
        System.out.println("Horsepower = " + getHorsePower());

        // special instance variable
        System.out.println("This motorcycle is a " + type);

        // What type of vehicle (car or motorcycle)
        System.out.println("This is a motorcycle.");

        // whether it has been stopped or stopped
        System.out.println("This motorcycle has been started. ");
    }

    public void stop() {
        setRunning(false);

        // The inherited variables
        System.out.println("Running = " + getRunning());
        System.out.println("Horsepower = " + getHorsePower());

        // special instance variable
        System.out.println("This motorcycle is a " + type);

        // What type of vehicle (car or motorcycle)
        System.out.println("This is a motorcycle.");

        // whether it has been stopped or stopped
        System.out.println("This motorcycle has been stopped. ");
    }
}
