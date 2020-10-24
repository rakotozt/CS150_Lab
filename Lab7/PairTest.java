
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PairTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PairTest
{
    /**
     * Default constructor for test class PairTest
     */
    public PairTest()
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
    public void pairTest() {
        Pair <Integer, Integer> t1 = new Pair(1,3);
        Pair<Integer, Integer> t2 = new Pair();
        t2.setKey(1);
        t2.setValue(3);

        assertEquals(t1.getValue(),t2.getValue());
        assertEquals(t1.getKey(),t2.getKey());
    }

}
