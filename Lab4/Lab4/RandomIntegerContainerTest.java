

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RandomIntegerContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RandomIntegerContainerTest
{
    /**
     * Default constructor for test class RandomIntegerContainerTest
     */
    public RandomIntegerContainerTest()
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
    public void TestBubbleSort()
    {
        RandomIntegerContainer container=new RandomIntegerContainer(); 
        container.addToBack(9); 
        container.addToBack(10); 
        container.addToFront(11); 
        container.addToFront(50);
        container.addToFront(4);
        assertEquals(84, container.sum());
    }
}
