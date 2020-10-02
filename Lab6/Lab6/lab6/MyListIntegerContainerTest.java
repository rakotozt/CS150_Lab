
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyListIntegerContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyListIntegerContainerTest
{
    /**
     * Default constructor for test class MyListIntegerContainerTest
     */
    public MyListIntegerContainerTest()
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
    public void testAddToFront() {
        MyListIntegerContainer s = new MyListIntegerContainer();
        s.addToFront(1);
        s.addToFront(2);
        s.addToFront(3);
        s.addToFront(4);
        s.addToFront(5);
        assertEquals(s.searchWithoutIterator(5), 0);
        assertEquals(s.searchWithoutIterator(4), 1);
        assertEquals(s.searchWithoutIterator(3), 2);
        assertEquals(s.searchWithoutIterator(2), 3);
        assertEquals(s.searchWithoutIterator(1), 4);
    }

    @Test
    public void testAddToBack() {
        MyListIntegerContainer s = new MyListIntegerContainer();
        s.addToBack(1);
        s.addToBack(2);
        s.addToBack(3);
        s.addToBack(4);
        s.addToBack(5);
        assertEquals(s.searchWithIterator(1), 0);
        assertEquals(s.searchWithIterator(2), 1);
        assertEquals(s.searchWithIterator(3), 2);
        assertEquals(s.searchWithIterator(4), 3);
        assertEquals(s.searchWithIterator(5), 4);
    }

    @Test
    public void testSearchWithoutIterator() {
        MyListIntegerContainer s = new MyListIntegerContainer();
        s.addToBack(1);
        s.addToBack(2);
        s.addToBack(3);
        s.addToBack(4);
        s.addToBack(5);
        assertEquals(s.searchWithoutIterator(8), -1);
        assertEquals(s.searchWithoutIterator(4), 3);

    }

    @Test
    public void testSearchWithIterator() {
        MyListIntegerContainer s = new MyListIntegerContainer();
        s.addToBack(1);
        s.addToBack(2);
        s.addToBack(3);
        s.addToBack(4);
        s.addToBack(5);
        assertEquals(s.searchWithIterator(8), -1);
        assertEquals(s.searchWithIterator(4), 3);

    }
}
