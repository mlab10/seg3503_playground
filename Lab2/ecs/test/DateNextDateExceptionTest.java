import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest {

    private int year; // Year value for the date to be tested
    private int month; // Month value for the date to be tested
    private int day; // Day value for the date to be tested

    /**
     * Constructor for a parameterized test case.
      * 
      * The constructor stores the parameters in instance variables for use by
      * whichever test method is being run. Because we don't know exactly which
      * method will be run (in general), the parameters have to be set up for all
      * possible test methods for the set of values.
      *
     * @param year
     *            Year value for the date to be tested
     * @param month
     *            Month value for the date to be tested
     * @param day
     *            Day value for the date to be tested
     */
    public DateNextDateExceptionTest(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    /**
     * Set up parameters for the test cases.
     *
     * @return A list of parameter arrays. Each array contains the parameters for
     * one test case.
     */
    @Parameters
    public static List<Object[]> data() {
        List<Object[]> data = new LinkedList<>();

        data.add(new Object[] {1500, 2, 31});   // TC16
        data.add(new Object[] {1500, 2, 29});   // TC17
        data.add(new Object[] {-1, 10, 20});    // TC18
        data.add(new Object[] {1458, 15, 12});  // TC19
        data.add(new Object[] {1975, 6, -50});  // TC20

        return data;
    }

    /**
     * Test method for nextDate with invalid date values. The test expects an
     * IllegalArgumentException to be thrown when a Date object is created with
     * invalid parameters.
     */
    @Test
    public void testException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(year, month, day);
        });
    }
}