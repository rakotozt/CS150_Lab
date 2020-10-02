import java.util.*; 
/**
 * Measures the execution time using iterator and not using iterator 
 *
 * @author Tafita Rakotozandry 
 * @version1
 */
public class ExperimentController
{

    public static void main(String [] args) {
        ExperimentController exp = new ExperimentController(); 
        //set the number of elements and the seeds 
        int[] numberOfItems = {10,100,1000,10000,100000,1000000,10000000};
        int[] seeds = {12552, 58286, 1528526, 428289, 5788286, 52741274};
        //set different time variable for the two functions 
        long time1 = 0;
        long time2 = 0;
        int min=1; 
        int max=1000; 
        //using enhanced for loop 
        //go through each element of number
        for (int num : numberOfItems) {
            time1 = 0;
            time2=0;
            for (int seed : seeds) {
                MyListIntegerContainer l= new MyListIntegerContainer(); 
                Random random=new Random(seed); 
                int search=0; 
                for(int j=0; j<num; j++){
                    int val=random.nextInt(max - min) + min; //the random generated number 
                    if(j==num-1) search=val; // pick the last value of the random number as a searching variable
                    l.addToBack(val); //add the list 
                }
                time1 += exp.timeSearchWithIterator(l,num, seed,search); //add the time1 each other 
                time2 += exp.timeSearchWithoutIterator(l,num,seed,search);//add the time1 each other 
            }
            //take the average of the sum of the different time measured 
            // divide them all to the number seeds used
            //print them 
            System.out.println("With    Iterator "+num + " : " + time1/((double) seeds.length));
            System.out.println("Without Iterator "+num + " : " + time2/((double) seeds.length));
        }
    }

    /**
     *Measures the execution time performing an a search using an iterator 
     *@param numberOfItems: number of items 
     *@param seed seeds 
     *@param searchingVal the variable to search for 
     *
     */
    public long timeSearchWithIterator(MyListIntegerContainer s,int numberOfItems, int seed,int searchingVal)
    {

        //start measuring execution time 
        long initalTime=System.currentTimeMillis();
        s.searchWithIterator(searchingVal);//run the searching method 
        //record the final time of the execution 
        long finalTime=System.currentTimeMillis();
        // return the difference 
        return finalTime-initalTime;
    }

    /**
     *Measures the execution time performing a search using the classic for loop 
     *@param numberOfItems: number of items 
     *@param seed seeds 
     *@param searchingVal the variable to search for 
     *
     */
    public long timeSearchWithoutIterator(MyListIntegerContainer s, int numberOfItems, int seed,int searchingVal)
    {
        //start measuring execution time 
        long initalTime=System.currentTimeMillis();
        s.searchWithoutIterator(searchingVal);//run the searching method 
        //record the final time of the execution 
        long finalTime=System.currentTimeMillis();
        // return the difference 
        return finalTime-initalTime;
    }
}
