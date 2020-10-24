
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WeightedElementTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WeightedElementTest
{
    /**
     * Default constructor for test class WeightedElementTest
     */
    public WeightedElementTest()
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
    public void testComparator()
    {
        WeightedElement<Integer,Integer> first= new WeightedElement<Integer,Integer> (41,36);
        WeightedElement<Integer,Integer> second= new WeightedElement<Integer,Integer> (51,95);
        assertEquals(first.compareTo(second),-1);
    }
}

