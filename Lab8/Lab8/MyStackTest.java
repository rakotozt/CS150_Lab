
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyStackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyStackTest
{
    /**
     * Default constructor for test class MyStackTest
     */
    public MyStackTest()
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
    public void testPush()
    {
        MyStack stack=new MyStack();
        stack.push(5);
     
        assertEquals(5, stack.peek());
    }    
    
    @Test
    public void testPeek()
    {
        MyStack stack=new MyStack();
        stack.push(5);
        stack.push(6);
     
        assertEquals(6, stack.peek());
    }
    
        @Test
    public void testPop()
    {
        MyStack stack=new MyStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.pop(); 
     
        assertEquals(7, stack.peek());
    }
    
            @Test
    public void testSearchNotFound()
    {
        MyStack stack=new MyStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

     
        assertEquals(-1, stack.search(2));
    }
    
                @Test
    public void testSearchFound()
    {
        MyStack stack=new MyStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

     
        assertEquals(3, stack.search(6));
    }
}

