

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IntegerListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IntegerListTest
{
    /**
     * Default constructor for test class IntegerListTest
     */
    public IntegerListTest()
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
    
        // Tests the isEmpty function 
    @Test 
    public void testIsEmpty() {
        IntegerList list = new IntegerList();
        assertTrue(list.isEmpty());
        list.append(1);
        assertFalse(list.isEmpty());
        list.append(2);
        assertFalse(list.isEmpty());
    }
    
        @Test
    public void testAppendAndToString() {
        String s = "";
        Integer val=0; 
        IntegerList list = new IntegerList();
        assertNull(list.getRoot()); // Test if the value was set properly
        val=2;
        list.append(val);
        assertNotNull(list.getRoot());
        assertEquals(list.getRoot().getVal(), val); // Test if the value was set properly
        s += val;
        assertEquals(list.toString(), s); // Test toString() in the case of a single cell
        val=4;
        list.append(val);
        assertEquals(list.getRoot().getNext().getVal(), val); // Test if the cell was appended
        s +=val;
        assertEquals(list.toString(), s); // Test toString() for 2 cells
        val=6;
        list.append(val);
        assertEquals(list.getRoot().getNext().getNext().getVal(), val); // Check if 3rd cell was appended to 2nd cell
        s += val;
        assertEquals(list.toString(), s); // Test toString() for multiple cells
        val=8;
        list.append(val);
        s += val;
        assertEquals(list.toString(), s); // Test toString() for multiple cells with repetitions
    }
}
