
/**
 * This class is used to measure the time spent by the
 *
 * @author Tafita Rakotozandry 
 * @version version1
 */
import java.util.*;
public class ExperimentController
{
    // instance variables - replace the example below with your own
    private int x;
    public static void main() {
        ExperimentController experiment = new ExperimentController(); 
        int[] numberOfItems = {10,100, 1000, 10000, 100000};
        int[] seeds = {89,558,7236,98654,10003,5461538};
        long time = 0;

        System.out.println ("Runtime AddToFront method");
        for (int num : numberOfItems) {
            time = 0;
            for (int seed : seeds) {
                time += experiment.timeAddToFront(num, seed);
            }
            System.out.println(num + " ==> " + time/6);
        }
        System.out.println ("Runtime AddToBack method");
        for (int num : numberOfItems) {
            time = 0;
            for (int seed : seeds) {
                time += experiment.timeAddToBack(num, seed);
            }
            System.out.println(num + " ==> " + time/6);
        }
        System.out.println ("Runtime AddAt method ");
        for (int num : numberOfItems) {
            time = 0;
            for (int seed : seeds) {
                time += experiment.timeAddAt(num, seed);
            }
            System.out.println(num + " ==> " + time/6);
        }
    }

    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {

    }

    /**
     * Time that takes to perform a Add to Front 
     *
     * @param  numberOfItems number of items to be added. 
     * @return    time taken to perform a add to Front in milliseconds 
     */
    public long timeAddToFront( int numberOfItems, int seed)
    {
        RandomIntegersContainer con=new RandomIntegersContainer(); 
        Random random = new Random(seed);
        int min = 0;
        int max = 10000;
        int randomIndex; 
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfItems; i++) {
            con.addToFront(random.nextInt(max-min) + min);   
        }

        long endTime = System.currentTimeMillis();
        return endTime-startTime; 
    }

    /**
     * Time that takes to perform a Add to Front 
     *
     * @param  numberOfItems number of items to be added. 
     * @return    time taken to perform a add to Front in milliseconds 
     */
    public long timeAddToBack( int numberOfItems, int seed)
    {
        RandomIntegersContainer con=new RandomIntegersContainer(); 
        Random random = new Random(seed);
        int min = 0;
        int max = 10000;
        int randomIndex; 
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfItems; i++) {
            con.addToBack(random.nextInt(max-min) + min);   
        }

        long endTime = System.currentTimeMillis();
        return endTime-startTime; 
    }

    /**
     * Time that takes to perform a Add At 
     *
     * @param  numberOfItems number of items to be added. 
     * @return time taken to perform a add to Front in milliseconds 
     */
    public long timeAddAt( int numberOfItems, int seed)
    {
        RandomIntegersContainer con=new RandomIntegersContainer(); 
        Random random = new Random(seed);
        int min = 0;
        int max = 10000;
        int randomIndex; 
        long startTime = System.currentTimeMillis();
        for (int i = 20; i >0; i--) {
            con.addToFront(i);   
        }

        for (int i = 0; i < numberOfItems; i++) {
            con.addAt(random.nextInt(max-min) + min,random.nextInt(20-1) + 1);   
        }

        long endTime = System.currentTimeMillis();
        return endTime-startTime; 
    }
}
