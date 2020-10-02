import java.util.*;
/**
 * Evaluates the performance of selection sort and bubble sort 
 *
 * @author Tafita Rakotozandry 
 * @version 1
 */
public class ExperimentController
{

    public static void main() {
        ExperimentController exp = new ExperimentController(); 

        //minimum generated value and maximum generated value 
        int min = 0;
        int max = 100;
        //number of items and seeds 
        int[] numberOfItems = {10,100, 1000, 10000};
        int[] seeds = {89,558,7236,98654,10003};

        //time factors for the bubble sort 
        int timerand1=0; 
        int timerev1=0; 
        int timesor1=0;

        //time factors for the selection sort 
        int timerand2=0; 
        int timerev2=0; 
        int timesor2=0;
        for (int num : numberOfItems) {
            for (int seed : seeds) {

                //set initial at 0
                timerand1=0; 
                timerev1=0; 
                timesor1=0;

                //set the time at 0
                timerand2=0; 
                timerev2=0; 
                timesor2=0;

                //create 6 different containers that will contain the random list of items 
                //the randCon will contains all the random item list 
                //revCon will contains all item in reverse order 
                //sorCon will contain all item presorted 
                RandomIntegerContainer randCon1=new RandomIntegerContainer();
                RandomIntegerContainer revCon1=new RandomIntegerContainer();
                RandomIntegerContainer sorCon1=new RandomIntegerContainer();

                RandomIntegerContainer randCon2=new RandomIntegerContainer();
                RandomIntegerContainer revCon2=new RandomIntegerContainer();
                RandomIntegerContainer sorCon2=new RandomIntegerContainer();

                //create a list that will contain the initial items 
                ArrayList<Integer> list=new ArrayList(); 
                Random random = new Random(seed);
                for (int i=0;i<num;i++){
                    list.add(random.nextInt(max-min) + min);
                }

                //copy the generated numbers to the different containers 
                for (int i=0;i<num;i++){
                    randCon1.addToBack(list.get(i));
                    revCon1.addToBack(list.get(i));
                    sorCon1.addToBack(list.get(i));
                    randCon2.addToBack(list.get(i));
                    revCon2.addToBack(list.get(i));
                    sorCon2.addToBack(list.get(i));
                }

                //sort element in sorCon and reverse the sorting order of revCon containers 
                sorCon1.selectionSort(); 
                sorCon2.selectionSort(); 
                revCon1.reverseSort(); 
                revCon2.reverseSort(); 

                //add time based on the number of trials made 
                timerand1+=exp.timeBubbleSort(randCon1);
                timerand2+=exp.timeSelectionSort(randCon2);

                timesor1+=exp.timeBubbleSort(sorCon1);
                timesor2+=exp.timeSelectionSort(sorCon2);

                timerev1+=exp.timeBubbleSort(revCon1);
                timerev2+=exp.timeSelectionSort(revCon2);

            }

            //the printed trials numbers is the average of the different numbers 
            System.out.println( "Item Numbers: "+num); 
            System.out.println("Time to sort a random List"); 
            System.out.println("Bubble Sort: "+ timerand1/seeds.length); 
            System.out.println("Selection Sort: "+timerand2/seeds.length); 

            System.out.println("Time to sort a sorted List"); 
            System.out.println("Bubble Sort: "+ timesor1/seeds.length); 
            System.out.println("Selection Sort: "+ timesor2/seeds.length); 

            System.out.println("Time to sort a reverse List"); 
            System.out.println("Bubble Sort: "+ timerev1/seeds.length); 
            System.out.println("Selection Sort: "+ timerev2/seeds.length); 

            System.out.println(""); 
        }
    }

    /**
     * Returns time taken to  perform a selection sort 
     * 
     *@param con randomIntegerContainer used 
     */
    public long timeSelectionSort(RandomIntegerContainer con){
        long startTime = System.currentTimeMillis();//start time 
        con.selectionSort(); //selection sort 
        long stopTime = System.currentTimeMillis(); //stop time 
        return (stopTime - startTime); //return the difference between stop time and start time 
    }

    /**
     * Returns time taken to  perform a bubble sort 
     * 
     *@param con randomIntegerContainer used 
     */
    public long timeBubbleSort(RandomIntegerContainer test){
        long startTime = System.currentTimeMillis();//start time 
        test.bubbleSort(); //selection sort 
        long stopTime = System.currentTimeMillis(); //stop time 
        return (stopTime - startTime); //return the difference between stop time and start time 
    }
}
