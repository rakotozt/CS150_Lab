
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyQueueTest
{
    /**
     * Default constructor for test class MyQueueTest
     */
    public MyQueueTest()
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
    public void testPeek() {
        MyQueue queue=new MyQueue();
        queue.add(5);
        queue.add(6);

        assertEquals(5, queue.peek()); 
    }

    @Test
    public void testRemove() {
        MyQueue queue=new MyQueue();
        queue.add(5);
        queue.add(6);
        queue.remove();
        assertEquals(6,queue.peek() ); 
    }

    @Test
    public void testAdd() {
        MyQueue queue=new MyQueue();
        queue.add(5); 
        queue.add(6);

        assertEquals(6, queue.queue.getTail().getVal());
    }
}
