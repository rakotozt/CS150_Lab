
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*; 
/**
 * The test class ArrayPriorityQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayPriorityQueueTest
{
    /**
     * Default constructor for test class ArrayPriorityQueueTest
     */
    public ArrayPriorityQueueTest()
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
    public void TestAddInteger()
    {
        ArrayPriorityQueue<WeightedElement<Integer,Integer> > queue1 =new ArrayPriorityQueue<WeightedElement<Integer,Integer>>();
        PriorityQueue<WeightedElement<Integer,Integer>> queue2 = new PriorityQueue<WeightedElement<Integer,Integer>>(); 

        WeightedElement<Integer,Integer> first= new WeightedElement<Integer,Integer> (1,2);
        WeightedElement<Integer,Integer> second= new WeightedElement<Integer,Integer> (3,7);
        WeightedElement<Integer,Integer> third= new WeightedElement<Integer,Integer> (4,8);
        WeightedElement<Integer,Integer> fourth= new WeightedElement<Integer,Integer> (7,5);
        WeightedElement<Integer,Integer> fifth= new WeightedElement<Integer,Integer> (25,12);
        WeightedElement<Integer,Integer> sixth= new WeightedElement<Integer,Integer> (89,6);
        queue1.add(first);
        queue2.add(first);
        queue1.add(second);
        queue2.add(second);
        queue1.add(third);
        queue2.add(third);
        queue1.add(fourth);
        queue2.add(fourth);
        queue1.add(fifth);
        queue2.add(fifth);
        queue1.add(sixth);
        queue2.add(sixth);

        assertEquals(queue1.toString(), queue2.toString());
    }

    @Test
    public void TestAddString()
    {
        ArrayPriorityQueue<WeightedElement<String,String> > queue1 =new ArrayPriorityQueue<WeightedElement<String,String>>();
        PriorityQueue<WeightedElement<String,String>> queue2 = new PriorityQueue<WeightedElement<String,String>>(); 

        WeightedElement<String,String> first= new WeightedElement<String,String> ("sadf","sdfsdf");
        WeightedElement<String,String> second= new WeightedElement<String,String> ("fdv","xcvfg");
        WeightedElement<String,String> third= new WeightedElement<String,String> ("dffds","ewfed");
        WeightedElement<String,String> fourth= new WeightedElement<String,String> ("qwweer","wdeef");
        WeightedElement<String,String> fifth= new WeightedElement<String,String> ("egfthn","trgfd");
        WeightedElement<String,String> sixth= new WeightedElement<String,String> ("jkhn","frvf");
        queue1.add(first);
        queue2.add(first);
        queue1.add(second);
        queue2.add(second);
        queue1.add(third);
        queue2.add(third);
        queue1.add(fourth);
        queue2.add(fourth);
        queue1.add(fifth);
        queue2.add(fifth);
        queue1.add(sixth);
        queue2.add(sixth);

        assertEquals(queue1.toString(), queue2.toString());
    }

    @Test
    public void TestPeekInteger()
    {
        ArrayPriorityQueue<WeightedElement<Integer,Integer> > queue1 =new ArrayPriorityQueue<WeightedElement<Integer,Integer>>();
        PriorityQueue<WeightedElement<Integer,Integer>> queue2 = new PriorityQueue<WeightedElement<Integer,Integer>>(); 

        WeightedElement<Integer,Integer> first= new WeightedElement<Integer,Integer> (1,2);
        WeightedElement<Integer,Integer> second= new WeightedElement<Integer,Integer> (3,7);
        WeightedElement<Integer,Integer> third= new WeightedElement<Integer,Integer> (4,8);
        WeightedElement<Integer,Integer> fourth= new WeightedElement<Integer,Integer> (7,5);
        WeightedElement<Integer,Integer> fifth= new WeightedElement<Integer,Integer> (25,12);
        WeightedElement<Integer,Integer> sixth= new WeightedElement<Integer,Integer> (89,6);
        queue1.add(first);
        queue2.add(first);
        queue1.add(second);
        queue2.add(second);
        queue1.add(third);
        queue2.add(third);
        queue1.add(fourth);
        queue2.add(fourth);
        queue1.add(fifth);
        queue2.add(fifth);
        queue1.add(sixth);
        queue2.add(sixth);

        assertEquals(queue1.peek(), queue2.peek());

    }

    @Test
    public void TestPeekString()
    {
        ArrayPriorityQueue<WeightedElement<String,String> > queue1 =new ArrayPriorityQueue<WeightedElement<String,String>>();
        PriorityQueue<WeightedElement<String,String>> queue2 = new PriorityQueue<WeightedElement<String,String>>(); 

        WeightedElement<String,String> first= new WeightedElement<String,String> ("sadf","sdfsdf");
        WeightedElement<String,String> second= new WeightedElement<String,String> ("fdv","xcvfg");
        WeightedElement<String,String> third= new WeightedElement<String,String> ("dffds","ewfed");
        WeightedElement<String,String> fourth= new WeightedElement<String,String> ("qwweer","wdeef");
        WeightedElement<String,String> fifth= new WeightedElement<String,String> ("egfthn","trgfd");
        WeightedElement<String,String> sixth= new WeightedElement<String,String> ("jkhn","frvf");
        queue1.add(first);
        queue2.add(first);
        queue1.add(second);
        queue2.add(second);
        queue1.add(third);
        queue2.add(third);
        queue1.add(fourth);
        queue2.add(fourth);
        queue1.add(fifth);
        queue2.add(fifth);
        queue1.add(sixth);
        queue2.add(sixth);

        assertEquals(queue1.peek(), queue2.peek());
    }

    @Test
    public void TestPollInteger()
    {
        ArrayPriorityQueue<WeightedElement<Integer,Integer> > queue1 =new ArrayPriorityQueue<WeightedElement<Integer,Integer>>();
        PriorityQueue<WeightedElement<Integer,Integer>> queue2 = new PriorityQueue<WeightedElement<Integer,Integer>>(); 

        WeightedElement<Integer,Integer> first= new WeightedElement<Integer,Integer> (41,36);
        WeightedElement<Integer,Integer> second= new WeightedElement<Integer,Integer> (51,95);
        WeightedElement<Integer,Integer> third= new WeightedElement<Integer,Integer> (52,685);
        WeightedElement<Integer,Integer> fourth= new WeightedElement<Integer,Integer> (952,441);
        WeightedElement<Integer,Integer> fifth= new WeightedElement<Integer,Integer> (2,6);
        WeightedElement<Integer,Integer> sixth= new WeightedElement<Integer,Integer> (86,500);
        queue1.add(first);
        queue2.add(first);
        queue1.add(second);
        queue2.add(second);
        queue1.add(third);
        queue2.add(third);
        queue1.add(fourth);
        queue2.add(fourth);
        queue1.add(fifth);
        queue2.add(fifth);
        queue1.add(sixth);
        queue2.add(sixth);

        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.toString(), queue2.toString());

    }

    @Test
    public void TestPollString()
    {
        ArrayPriorityQueue<WeightedElement<String,String> > queue1 =new ArrayPriorityQueue<WeightedElement<String,String>>();
        PriorityQueue<WeightedElement<String,String>> queue2 = new PriorityQueue<WeightedElement<String,String>>(); 

        WeightedElement<String,String> first= new WeightedElement<String,String> ("sadf","sdfsdf");
        WeightedElement<String,String> second= new WeightedElement<String,String> ("fdv","xcvfg");
        WeightedElement<String,String> third= new WeightedElement<String,String> ("dffds","ewfed");
        WeightedElement<String,String> fourth= new WeightedElement<String,String> ("qwweer","wdeef");
        WeightedElement<String,String> fifth= new WeightedElement<String,String> ("egfthn","trgfd");
        WeightedElement<String,String> sixth= new WeightedElement<String,String> ("jkhn","frvf");
        queue1.add(first);
        queue2.add(first);
        queue1.add(second);
        queue2.add(second);
        queue1.add(third);
        queue2.add(third);
        queue1.add(fourth);
        queue2.add(fourth);
        queue1.add(fifth);
        queue2.add(fifth);
        queue1.add(sixth);
        queue2.add(sixth);

        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.toString(), queue2.toString());

    }

    @Test
    public void TestPollEmptyString()
    {
        ArrayPriorityQueue<WeightedElement<String,String> > queue1 =new ArrayPriorityQueue<WeightedElement<String,String>>();
        PriorityQueue<WeightedElement<String,String>> queue2 = new PriorityQueue<WeightedElement<String,String>>(); 

        WeightedElement<String,String> first= new WeightedElement<String,String> ("sadf","sdfsdf");

        queue1.add(first);
        queue2.add(first);

        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.toString(), queue2.toString());

    }

    @Test
    public void TestPollEmptyInteger()
    {
        ArrayPriorityQueue<WeightedElement<Integer,Integer> > queue1 =new ArrayPriorityQueue<WeightedElement<Integer,Integer>>();
        PriorityQueue<WeightedElement<Integer,Integer>> queue2 = new PriorityQueue<WeightedElement<Integer,Integer>>(); 

        WeightedElement<Integer,Integer> first= new WeightedElement<Integer,Integer> (1,3);

        queue1.add(first);
        queue2.add(first);

        assertEquals(queue1.poll(), queue2.poll());
        assertEquals(queue1.toString(), queue2.toString());

    }
}

