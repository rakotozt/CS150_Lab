import java.util.*; 
import java.io.*;
/**
 * Compares the stack and the queue
 *
 * @author Tafita Rakoto
 * @version 1
 */
public class ExperimentController {
    long startTime; //start time
    long stopTime; // stop time
    int max=500; 
    public static void main(String[] args) throws FileNotFoundException {
        ExperimentController exp = new ExperimentController();
        int[] numberOfElements = {10, 100, 1000,3000,6000,9000,12000,15000 }; 
        int[] seeds = {457, 652, 849, 1111, 6969, 18357}; 

        /*
         * Uncomment this to print the result on a csv file 
        PrintStream out = new PrintStream(new FileOutputStream("result.csv"));
        System.setOut(out); 
         */
        System.out.println("Time to insert stack element to queue");
        for (int i = 0; i < numberOfElements.length; i++) {
            long time = 0; 

            for (int j = 0; j < seeds.length; j++) {
                time=time + exp.timeInsertStackElementToQueue(numberOfElements[i], seeds[j]);
            }
            time=time/seeds.length; //avarage time 
            System.out.println(numberOfElements[i]+","+time); //time result 
        }
        System.out.println("Time to insert queue element to stack");

        for (int i = 0; i < numberOfElements.length; i++) {
            long time = 0; 

            for (int j = 0; j < seeds.length; j++) {
                time=time + exp.timeInsertQueueElementToStack(numberOfElements[i], seeds[j]);
            }
            time=time/seeds.length; //avarage time 
            System.out.println(numberOfElements[i]+","+time); //time result 
        }

    }    

    /**
     * Time inserting elements into the stack, then move to the queue
     * @param numberOfItems the number of items 
     * @param seed seed value 
     */
    public long timeInsertStackElementToQueue(int numberOfItems, int seed) {
        MyStack <Integer> testStack1 = new MyStack <Integer>();
        MyQueue <Integer> testQueue1 = new MyQueue <Integer>();

        Random random = new Random(seed);

        for (int i = 0; i < numberOfItems; i++) {
            testStack1.push(random.nextInt(max)); 
        }

        startTime = System.currentTimeMillis(); 

        for (int i = 0; i < (numberOfItems); i++) {
            testQueue1.add((Integer) testStack1.stack.getNode(i).val);
        }

        stopTime = System.currentTimeMillis(); 

        return stopTime - startTime; // return time difference 
    }

    /**
     * Time inserting elements into the stack, then move to the queue
     * @param numberOfItems the number of items 
     * @param seed seed value 
     */
    public long timeInsertQueueElementToStack(int numberOfItems, int seed) {
        MyQueue <Integer> testQueue2 = new MyQueue <Integer>();
        MyStack <Integer> testStack2 = new MyStack <Integer>();

        Random random = new Random(seed);

        for (int i = 0; i < numberOfItems; i++) {
            testQueue2.add(random.nextInt(max)); 
        }

        startTime = System.currentTimeMillis(); 

        for (int i = 0; i < (numberOfItems); i++) {
            testStack2.push((Integer) testQueue2.queue.getNode(i).val);
        }

        stopTime = System.currentTimeMillis(); 

        return stopTime - startTime; // Returns the time difference
    }
}