import java.util.*; 
/**
 * Analyze the run time of the method append and toString 
 *
 * @author Tafita Rakotozandry
 * @version  1
 */
public class ExperimentController
{
    public static void main(){
        ExperimentController controller = new ExperimentController();

        int[] numberOfItems = {10,100, 1000,2000,3000,4000};
        int[] seeds = {89,558,7236,98654,10003};

        System.out.println("Time Append");
        for (int num=0;num< numberOfItems.length;num++) {
            long time=0;
            //add time result from different seed 
            for (int seed=0;seed<seeds.length; seed++) {
                time+=controller.timeAppend(numberOfItems[num],seeds[seed]); 
            }
            //take the average of the time 
            time=time/seeds.length; 
            System.out.println(numberOfItems[num]+"----->"+time); 
        }
        //similar process as previous ones but withtimeToString
        System.out.println("Time to String");
        for (int num=0;num< numberOfItems.length;num++) {
            long time=0;
            for (int seed=0;seed<seeds.length; seed++) {
                time+=controller.timeToString(numberOfItems[num],seeds[seed]); 
            }
            time=time/seeds.length; 
            System.out.println(numberOfItems[num]+"----->"+time);
        }        
    }

    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {

    }

    /**
     * Returns time taken to call append method   
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public long timeAppend(int numberOfItems, int seed)
    {
        //variable creation
        int min=0;
        int max=200;
        IntegerListADT list=new IntegerList();
        Random random = new Random(seed);
        long startTime = System.currentTimeMillis();//start time
        for (int i=0;i<numberOfItems;i++){
            list.append(random.nextInt(max-min) + min);
        }
        long stopTime = System.currentTimeMillis(); //stop time 

        return (stopTime - startTime); //return the difference between stop time and start time 
    }

    /**
     * Returns time taken to call toString method   
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public long timeToString(int numberOfItems, int seed)
    {
        //variable creation
        int min=0;
        int max=200;
        IntegerListADT list=new IntegerList();
        Random random = new Random(seed);

        for (int i=0;i<numberOfItems;i++){
            list.append(random.nextInt(max-min) + min);
        }
        long startTime = System.currentTimeMillis();//start time
        list.toString(); 
        long stopTime = System.currentTimeMillis(); //stop time 
        return (stopTime - startTime); //return the difference between stop time and start time 
    }
}

