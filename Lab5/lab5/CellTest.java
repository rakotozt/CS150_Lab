
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CellTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CellTest
{
    /**
     * Default constructor for test class CellTest
     */
    public CellTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAppendAndToString() {
        Integer val=2; //Set a defined integer 
        String s="2";//Set a string form of that integer 
        Cell c = new Cell(2); //Create a new similar using the same value as that val 
        assertEquals(c.getVal(), val); // Test if the value was set properly
        assertEquals(c.toString(), s); // Test toString() in the case of a single cell
        c.append(3); //Append value in the cell 
        val=3;//Update the variable val 
        assertEquals(c.getNext().getVal(), val); // Test if the cell was appended
        s =s+3;//Add the new value to the String variable 
        assertEquals(c.toString(), s); // Test toString() for 2 cells
        c.append(4); //Append the a new value on the cell 
        val=4; //Update the val integer
        assertEquals(c.getNext().getNext().getVal(), val); // Check if 3rd cell was appended to 2nd cell
        s=s+ 4;//Update the val integer
        assertEquals(c.toString(), s); // Test toString() for multiple cells
        c.append(5);//Append a new value 
        s = s+ 5;//Add the string to a new value 
        assertEquals(c.toString(), s); // Test toString() for multiple cells with repetitions
    }
}
