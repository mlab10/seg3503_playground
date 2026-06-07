import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Example of a parameterized test case.
 * Parameterized test cases are run multiple times with different data. Two
 * items are needed to set this up: a constructor for instances of this class
 * that assigns the parameters to instance variables, and a method with the
 * &#64;Parameters notation that returns a list of parameter arrays.
 *
 */
@RunWith(Parameterized.class)
public class DateNextDateOkTest
{
    private Date date; // Date value for the date to be tested

    private Date expectedResult; // Expected date value for the result of nextDate

    /**
     * Constructor for a parameterized test case.
     * 
     * The constructor stores the parameters in instance variables for use by
     * whichever test method is being run. Because we don't know exactly which
     * method will be run (in general), the parameters have to be set up for all
     * possible test methods for the set of values.
     *
     * @param date
     *            Date value for the date to be tested
     * @param expected
     *            Expected date value for the result of nextDate
     */
    public DateNextDateOkTest(Date date, Date expected)
    {
        this.date = date;
        this.expectedResult = expected;
    }

    /**
     * Set up parameters for the test cases.
     *
     * @return A list of parameter arrays. Each array contains the parameters for
     * one test case.
     */
    @Parameters
    public static List<Object[]> data()
    {
        List<Object[]> data = new LinkedList<>();
        data.add(new Object[] { new Date(1700,6,20), new Date(1700,6,21) }); //TC1
        data.add(new Object[] { new Date(2005,4,15), new Date(2005,4,16) }); //TC2
        data.add(new Object[] { new Date(1901,7,20), new Date(1901,7,21) }); //TC3
        data.add(new Object[] { new Date(3456,3,27), new Date(3456,3,28) }); //TC4
        data.add(new Object[] { new Date(1500,2,17), new Date(1500,2,18) }); //TC5
        data.add(new Object[] { new Date(1700,6,29), new Date(1700,6,30) }); //TC6
        data.add(new Object[] { new Date(1800,11,29), new Date(1800,11,30) }); //TC7
        data.add(new Object[] { new Date(3453,1,29), new Date(3453,1,30) }); //TC8
        data.add(new Object[] { new Date(444,2,29), new Date(444,3,1) }); //TC9
        data.add(new Object[] { new Date(2005,4,30), new Date(2005,5,1) }); //TC10
        data.add(new Object[] { new Date(3453,1,30), new Date(3453,1,31) }); //TC11
        data.add(new Object[] { new Date(3456,3,30), new Date(3456,3,31) }); //TC12
        data.add(new Object[] { new Date(1901,7,31), new Date(1901,8,1) }); //TC13
        data.add(new Object[] { new Date(3453,1,31), new Date(3453,2,1) }); //TC14
        data.add(new Object[] { new Date(3456,12,31), new Date(3457,1,1) }); //TC15
        return data;
    }

    /**
     * Test method for Date.
     * The input and expected values are set by the constructor. Perform the
	 * operation to get the actual value, and assert that it is as expected.
     */
    @Test
    public void testNextDate()
    {        
        Date actualResult = date.nextDate();
        Assert.assertEquals(expectedResult, actualResult);
    }
}