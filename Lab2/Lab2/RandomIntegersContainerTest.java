
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RandomIntegersContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RandomIntegersContainerTest
{
    /**
     * Default constructor for test class RandomIntegersContainerTest
     */
    public RandomIntegersContainerTest()
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
    public void TestAddToBack()
    {
        RandomIntegersContainer t = new RandomIntegersContainer();
        t.addToBack(1);
        t.addToBack(2);
        t.addToBack(3);
        int[] a=new int[10];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        assertArrayEquals(a, t.toArray());
    }

    @Test
    public void TestAddToBack2()
    {
        RandomIntegersContainer t = new RandomIntegersContainer();
        t.addToBack(1);
        t.addToBack(2);
        t.addToBack(3);
        t.addToBack(4);
        t.addToBack(5);
        t.addToBack(6);
        t.addToBack(7);
        t.addToBack(8);
        t.addToBack(9);
        t.addToBack(10);
        t.addToBack(11); 
        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10,11,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(a, t.toArray());
    }

    @Test
    public void TestAddToFront()
    {
        RandomIntegersContainer t = new RandomIntegersContainer();
        t.addToBack(1);
        t.addToBack(2);
        t.addToBack(3);
        t.addToFront(8);
        int[] a=new int[]{8,1,2,3,0,0,0,0,0,0};
        assertArrayEquals(a, t.toArray());
    }
        @Test
    public void TestAddToFront2()
    {
        RandomIntegersContainer t = new RandomIntegersContainer();
        t.addToBack(1);
        t.addToBack(2);
        t.addToBack(3);
        t.addToBack(4);
        t.addToBack(5);
        t.addToBack(6);
        t.addToBack(7);
        t.addToBack(8);
        t.addToBack(9);
        t.addToBack(10);
        t.addToFront(11); 
        int[] a=new int[]{11,1,2,3,4,5,6,7,8,9,10,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(a, t.toArray());
    }
        @Test
    public void TestAddAt()
    {
        RandomIntegersContainer t = new RandomIntegersContainer();
        t.addToBack(1);
        t.addToBack(2);
        t.addToBack(3);
        t.addAt(8,1);
        int[] a=new int[]{1,8,2,3,0,0,0,0,0,0};
        assertArrayEquals(a, t.toArray());
    }
       @Test
    public void TestAddAt2()
    {
        RandomIntegersContainer t = new RandomIntegersContainer();
        t.addToBack(1);
        t.addToBack(2);
        t.addToBack(3);
        t.addToBack(4);
        t.addToBack(5);
        t.addToBack(6);
        t.addToBack(7);
        t.addToBack(8);
        t.addToBack(9);
        t.addToBack(10);
        t.addAt(11,3); 
        int[] a=new int[]{1,2,3,11,4,5,6,7,8,9,10,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(a, t.toArray());
    }
      @Test
    public void TestnumEntries()
    {
        RandomIntegersContainer t = new RandomIntegersContainer();
        t.addToBack(1);
        t.addToBack(2);
        t.addToBack(3);
        t.addToBack(4);
        t.addToBack(5);
        t.addToBack(6);
        t.addToBack(7);
        t.addToBack(8);
        t.addToBack(9);
        t.addToBack(10);
        t.addAt(11,3); 
        int[] a=new int[]{1,2,3,11,4,5,6,7,8,9,10,0,0,0,0,0,0,0,0,0};
        assertEquals(11, t.numEntries());
    }

}

