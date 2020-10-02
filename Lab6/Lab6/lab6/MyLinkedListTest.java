

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyLinkedListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListTest
{
    /**
     * Default constructor for test class MyLinkedListTest
     */
    public MyLinkedListTest()
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
    public void TestAddFirst()
    {
        MyLinkedList<Integer> l = new MyLinkedList<Integer>();
        assertEquals(true, l.isEmpty());
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        System.out.println(l.toString());
        assertEquals(false, l.isEmpty());
        assertEquals(4, l.length());
        String s=" 4 3 2 1";
       assertEquals(s, l.toString());
    }
            @Test
    public void TestAddEnd()
    {
        MyLinkedList<Integer> l = new MyLinkedList<Integer>();
        assertEquals(true, l.isEmpty());
        l.addEnd(1);
        l.addEnd(2);
        l.addEnd(3);
        l.addEnd(4);
        System.out.println(l.toString());
        assertEquals(false, l.isEmpty());
        assertEquals(4, l.length());
        String s=" 1 2 3 4";
       assertEquals(s, l.toString());
    }
}
