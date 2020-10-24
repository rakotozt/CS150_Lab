
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RandomStringContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RandomStringContainerTest
{
    /**
     * Default constructor for test class RandomStringContainerTest
     */
    public RandomStringContainerTest()
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
    public void TestAddToFront()
    {
        RandomStringContainer con= new RandomStringContainer(); 
        con.addToBack("baa"); 
        con.addToBack("caa"); 
        con.addToBack("daa"); 
        con.addToFront("a"); 
        String [] arr=new String [] {"a","baa","caa","daa"};
        assertArrayEquals(arr, con.toArray());
    }

    @Test
    public void TestAddBack()
    {
        RandomStringContainer con= new RandomStringContainer(); 
        con.addToBack("baa"); 
        con.addToBack("daa"); 
        con.addToBack("cab"); 
        String [] arr=new String [] {"baa","daa","cab"};
        assertArrayEquals(arr, con.toArray());
    }

    @Test
    public void TestAddSorted()
    {
        RandomStringContainer con= new RandomStringContainer(); 
        con.addToBack("aaa"); 
        con.addToBack("baa"); 
        con.addToBack("daa"); 
        con.addSorted("ca");
        String [] arr=new String [] {"aaa","baa","ca","daa"};
        assertArrayEquals(arr, con.toArray());
    }

    @Test
    public void TestSelectionSort()
    {
        RandomStringContainer con= new RandomStringContainer(); 
        con.addToBack("xaa"); 
        con.addToBack("gaa"); 
        con.addToBack("aaa"); 
        con.addToBack("kaa"); 
        con.addToBack("maa"); 
        con.selectionSort();
        String [] arr=new String [] {"aaa","gaa","kaa","maa","xaa"};
        assertArrayEquals(arr, con.toArray());
    }

}

