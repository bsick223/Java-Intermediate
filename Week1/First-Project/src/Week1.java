import java.sql.SQLOutput;
import java.util.Objects;

public class Week1 {

    // property
    // instance variable
    public String season = "summer";
    public boolean running;



    // when a method is static, it's available to all classes
    public static void main(String[] args) {
        System.out.println("hey");

        // keep the fun in getting things to work
        // Enjoy the feeling of success

        // creating an instance of
        // oWeek1 is a variable *object week 1, that can hold the Week1 object
        // oWeek1 is point to the object in memory.
        // Don't think of the variable as the object itself

        Week1 oWeek1 = new Week1();

        // oWeek1.running

        oWeek1.test("working");

        // test("test");

    }
    // no static
    public void test(String sMessage) {
        System.out.println(sMessage);
    }
}
