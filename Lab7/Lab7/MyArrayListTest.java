import java.util.*; 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyArrayListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyArrayListTest
{
    /**
     * Default constructor for test class MyArrayListTest
     */
    public MyArrayListTest()
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
    public void quicksortNormalTest() {
        ArrayList <Pair<Integer, Integer>> expected = new ArrayList <Pair<Integer, Integer>> ();
        MyArrayList tester = new MyArrayList();
        expected.add(new Pair(0,1));
        expected.add(new Pair(3,2));
        expected.add(new Pair(5,3));
        expected.add(new Pair(4,4));
        expected.add(new Pair(2,5));        

        ArrayList <Pair<Integer, Integer>> test3 = new ArrayList <Pair<Integer, Integer>> ();

        test3.add(new Pair(0,1));
        test3.add(new Pair(5,3));
        test3.add(new Pair(3,2));
        test3.add(new Pair(2,5));
        test3.add(new Pair(4,4));
        tester.quicksort(test3);

        ArrayList <Pair<Integer, Integer>> result = test3;

        Integer i = tester.compareTo(expected,result);

        assertEquals((long) i, (long) 0);
    }

    @Test
    public void stableQuicksortNormalTest() {
        ArrayList <Pair<Integer, Integer>> expected = new ArrayList <Pair<Integer, Integer>> ();
        MyArrayList tester = new MyArrayList();
        expected.add(new Pair(0,1));
        expected.add(new Pair(3,1));
        expected.add(new Pair(5,1));
        expected.add(new Pair(7,1));
        expected.add(new Pair(9,1));        

        ArrayList <Pair<Integer, Integer>> t = new ArrayList <Pair<Integer, Integer>> ();

        t.add(new Pair(3,1));
        t.add(new Pair(5,1));
        t.add(new Pair(7,1));
        t.add(new Pair(9,1));
        t.add(new Pair(0,1));

        ArrayList <Pair<Integer, Integer>> result = tester.stableQuickSort(t);

        Integer i = tester.compareTo(expected,result);

        assertEquals((long) i, (long) 0);    
    }

    @Test
    public void binarySearchTest() {
        ArrayList <Pair<Integer, Integer>> test5 = new ArrayList <Pair<Integer, Integer>> ();
        MyArrayList tester = new MyArrayList();
        test5.add(new Pair(5,1));
        test5.add(new Pair(5,2));
        test5.add(new Pair(7,3));
        test5.add(new Pair(9,3));
        test5.add(new Pair(0,1));
        tester.quicksort(test5);  
        Pair result = tester.binarySearch(test5, (int) 1);
        Pair expected = new Pair(5,1);
        System.out.println(result.toString());
        Integer i = expected.compareTo(result);
        assertEquals((long) i, (long) 0);
    }
}
