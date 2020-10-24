import java.util.*;
import java.io.*; 
/**
 * Test the priority queues 
 *
 * @author Tafita Rakoto 
 * @version 1
 */
public class ExperimentController
{
    // instance variables - replace the example below with your own
    private int min=0; 
    private int max=10000;
    public static void main(String[] args)throws FileNotFoundException {
        //variable declaration 
        int [] numberOfItems={10000,50000,100000,500000,1000000,5000000}; 
        int []seeds={266844,8626254,652332,45566415};
        long time1=0;
        long time2=0;
        ArrayPriorityQueue<Integer> p1;
        PriorityQueue<Integer> p2;
        //creation of experiment controller object 
        ExperimentController experiment = new ExperimentController(); 

        // Uncomment the following program if you want to print the data on the csv file 
        experiment.writeCSV(); 

        //run the time addToFront test 
        System.out.println ("Runtime timeCreate ArrayPriortiyQueue");
        System.out.println("ItemNumbers"+","+"MyPQ"+","+"JavaPQ");
        for (int num : numberOfItems) {
            time1 = 0;
            time2 = 0;
            p1=new ArrayPriorityQueue<Integer>();
            p2=new PriorityQueue<Integer>();
            for (int seed : seeds) {
                time1 += experiment.timeCreatePQ(p1,num, seed);
                time2 += experiment.timeCreateJavaPQ(p2,num, seed);
            }
            System.out.println(num + "," + time1/seeds.length+","+ time2/seeds.length);
        }

        //run the timeaddToBack test 
        System.out.println ("Runtime Peek PriortiyQueue");
        System.out.println("ItemNumbers"+","+"MyPQ"+","+"JavaPQ");
        for (int num : numberOfItems) {
            time1 = 0;
            time2 = 0;
            p1=new ArrayPriorityQueue<Integer>();
            p2=new PriorityQueue<Integer>();
            for (int seed : seeds) {
                time1 += experiment.timePeekMyPQ(p1,num, seed);
                time2 += experiment.timePeekJavaPQ(p2,num, seed);
            }
            System.out.println(num + "," + time1/seeds.length+","+ time2/seeds.length);
        }   

        System.out.println ("Runtime Poll PriortiyQueue");
        System.out.println("ItemNumbers"+","+"MyPQ"+","+"JavaPQ");
        for (int num : numberOfItems) {
            time1 = 0;
            time2 = 0;
            p1=new ArrayPriorityQueue<Integer>();
            p2=new PriorityQueue<Integer>();
            for (int seed : seeds) {
                time1 += experiment.timePollMyPQ(p1,num, seed);
                time2 += experiment.timePollJavaPQ(p2,num, seed);
            }
            System.out.println(num + "," + time1/seeds.length+","+ time2/seeds.length);
        }  

    }

    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {

    }

    /**
     * Print Data into a csv file 
     * use only when to export data into file 
     * 
     */
    public  void writeCSV()throws FileNotFoundException{
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out); 
    }

    /**
     * Return time to perform a peek 
     *
     * @param  p priorityQueue array
     * @param  numberOfItems number of items 
     * @param  seed seed numbers 
     * @return time to perform a peek 
     */
    public long timePeekJavaPQ(PriorityQueue<Integer> p, int numberOfItems, int seed)
    {
        Random random = new Random(seed);
        for (int i=0;i<numberOfItems;i++){
            p.add(random.nextInt(max-min) + min);
        }
        long startTime = System.currentTimeMillis(); //take initial time 
        p.peek(); 
        long stopTime = System.currentTimeMillis(); //t
        return stopTime-startTime;
    }

    /**
     * Return time to perform a peek 
     *
     * @param  p priorityQueue array
     * @param  numberOfItems number of items 
     * @param  seed seed numbers 
     * @return time to perform a peek 
     */
    public long timePeekMyPQ(ArrayPriorityQueue<Integer> p, int numberOfItems, int seed)
    {
        Random random = new Random(seed);
        for (int i=0;i<numberOfItems;i++){
            p.add(random.nextInt(max-min) + min);
        }
        long startTime = System.currentTimeMillis(); //take initial time 
        p.peek(); 
        long stopTime = System.currentTimeMillis(); //t
        return stopTime-startTime;
    }

    /**
     * Return time to perform a poll 
     *
     * @param  p priorityQueue array
     * @param  numberOfItems number of items 
     * @param  seed seed numbers 
     * @return time to perform a poll 
     */
    public long timePollMyPQ(ArrayPriorityQueue<Integer> p, int numberOfItems, int seed)
    {
        Random random = new Random(seed);
        for (int i=0;i<numberOfItems;i++){
            p.add(random.nextInt(max-min) + min);
        }
        long startTime = System.currentTimeMillis(); //take initial time 
        p.poll(); 
        long stopTime = System.currentTimeMillis(); //t\

        return stopTime-startTime; 
    }

    /**
     * Return time to perform a poll
     *
     * @param  p priorityQueue array
     * @param  numberOfItems number of items 
     * @param  seed seed numbers 
     * @return time to perform a poll
     */
    public long timePollJavaPQ(PriorityQueue<Integer> p, int numberOfItems, int seed)
    {
        Random random = new Random(seed);
        for (int i=0;i<numberOfItems;i++){
            p.add(random.nextInt(max-min) + min);
        }
        long startTime = System.currentTimeMillis(); //take initial time 
        p.poll(); 
        long stopTime = System.currentTimeMillis(); //t
        return stopTime-startTime; 
    }

    /**
     * Return time to create priorit queue
     *
     * @param  p priorityQueue array
     * @param  numberOfItems number of items 
     * @param  seed seed numbers 
     * @return time to create priority queue
     */
    public long timeCreatePQ(ArrayPriorityQueue<Integer> p, int numberOfItems, int seed)
    {

        Random random = new Random(seed);
        long startTime = System.currentTimeMillis();//start time
        for (int i=0;i<numberOfItems;i++){
            p.add(random.nextInt(max-min) + min);
        }
        long stopTime = System.currentTimeMillis();//start time
        return stopTime-startTime; 
    }

    /**
     * Return time to create priority queue Java 
     *
     * @param  p priorityQueue array
     * @param  numberOfItems number of items 
     * @param  seed seed numbers 
     * @return time to perform  a priority queue 
     */
    public long timeCreateJavaPQ(PriorityQueue<Integer> p, int numberOfItems, int seed)
    {

        Random random = new Random(seed);
        long startTime = System.currentTimeMillis();//start time
        for (int i=0;i<numberOfItems;i++){
            p.add(random.nextInt(max-min) + min);
        }
        long stopTime = System.currentTimeMillis();//start time
        return stopTime-startTime;
    }
}
