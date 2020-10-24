
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RandomStuffContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RandomStuffContainerTest
{
    /**
     * Default constructor for test class RandomStuffContainerTest
     */
    public RandomStuffContainerTest()
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
        RandomStuffContainer<String> container=new RandomStuffContainer<String>(); 
        container.addToBack("aaa"); 
        container.addToBack("gaa"); 
        container.addToBack("kaa"); 
        container.addToBack("maa");
        container.addToBack("xaa");
        String [] arr=new String [] {"aaa","gaa","kaa","maa","xaa"};
        assertArrayEquals(arr, container.toArray());
    }

    @Test
    public void TestAddToFront()
    {
        RandomStuffContainer<String> container=new RandomStuffContainer<String>(); 
        container.addToBack("aaa"); 
        container.addToBack("gaa"); 
        container.addToFront("kaa"); 
        container.addToFront("maa");
        container.addToFront("xaa");
        String [] arr=new String [] {"xaa","maa","kaa","aaa","gaa"};
        assertArrayEquals(arr, container.toArray());
    }

    @Test
    public void TestSelectionSort()
    {
        RandomStuffContainer<String> container=new RandomStuffContainer<String>(); 
        container.addToBack("aaa"); 
        container.addToBack("gaa"); 
        container.addToFront("kaa"); 
        container.addToFront("maa");
        container.addToFront("xaa");
        container.selectionSort(); 
        String [] arr=new String [] {"aaa","gaa","kaa","maa","xaa"};
        assertArrayEquals(arr, container.toArray());
    }
    
        @Test
    public void TestBubbleSort()
    {
        RandomStuffContainer<String> container=new RandomStuffContainer<String>(); 
        container.addToBack("aaa"); 
        container.addToBack("gaa"); 
        container.addToFront("kaa"); 
        container.addToFront("maa");
        container.addToFront("xaa");
        container.bubbleSort(); 
        String [] arr=new String [] {"aaa","gaa","kaa","maa","xaa"};
        assertArrayEquals(arr, container.toArray());
    }
            @Test
    public void TestReverse()
    {
        RandomStuffContainer<String> container=new RandomStuffContainer<String>(); 
        container.addToBack("aaa"); 
        container.addToBack("gaa"); 
        container.addToFront("kaa"); 
        container.addToFront("maa");
        container.addToFront("xaa");
        container.reverseSort(); 
        String [] arr=new String [] {"xaa","maa","kaa","gaa","aaa"};
        assertArrayEquals(arr, container.toArray());
    }
}
