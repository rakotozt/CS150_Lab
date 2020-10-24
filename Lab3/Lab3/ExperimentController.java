
import java.util.*;
/**
 * Class to experiment the time taken by calling the method AddToFront,AddToBack,AddSorted,selectionSort
 *
 * @author Tafita Rakotozandry
 * @version 1
 */
public class ExperimentController
{
    // instance variables 
    private ArrayList<String> twoLetterWords;

    public static void main(String[] args) {
        //variable declaration 
        int [] numberOfItems={10,100,1000,10000}; 
        int []seeds={266844,8626254,652332,45566415};
        long time=0;

        //creation of experiment controller object 
        ExperimentController experiment = new ExperimentController(); 

        //run the time addToFront test 
        System.out.println ("Runtime timeAddToFront method");
        for (int num : numberOfItems) {
            time = 0;
            for (int seed : seeds) {
                time += experiment.timeAddToFront(num, seed);
            }
            System.out.println(num + " ==> " + time/seeds.length);
        }

        //run the timeaddToBack test 
        System.out.println ("Runtime timeAddToBack method");
        for (int num : numberOfItems) {
            time = 0;
            for (int seed : seeds) {
                time += experiment.timeAddToBack(num, seed);
            }
            System.out.println(num + " ==> " + time/seeds.length);
        }   

        //run the timeAddSorted test 
        System.out.println ("Runtime timeAddSorted method");
        for (int num : numberOfItems) {
            time = 0;
            for (int seed : seeds) {
                time += experiment.timeAddSorted(num, seeds.length);
            }
            System.out.println(num + " ==> " + time/6);
        }  

        //run the timeSortofUnsortedList test 
        System.out.println ("Runtime timeSortofUnsortedList method");
        for (int num : numberOfItems) {
            time = 0;
            for (int seed : seeds) {
                time += experiment.timeSortofUnsortedList(num, seeds.length);
            }
            System.out.println(num + " ==> " + time/6);
        }  

        //run the timeSortofSortedList test
        System.out.println ("Runtime timeSortofSortedList method");
        for (int num : numberOfItems) {
            time = 0;
            for (int seed : seeds) {
                time += experiment.timeSortofSortedList(num, seeds.length);
            }
            System.out.println(num + " ==> " + time/6);
        }  

    }

    /**
     * Creates an array with several list of string 
     *
     */
    public ExperimentController()
    {
        // initialise instance variables
        twoLetterWords=new ArrayList<String>(Arrays.asList(new String[] {"aa","ab","ad","ae","ag","ah","ai","al","am","an","ar","as","at","aw","ax","ay","ba","be","bi","bo","by","da","de","do","ed","ef","eh","el","em","en","er","es","et","ew","ex","fa","fe","gi","go","ha","he","hi","hm","ho","id","if","in","is","it","jo","ka","ki","la","li","lo","ma","me","mi","mm","mo","mu","my","na","ne","no","nu","od","oe","of","oh","oi","ok","om","on","op","or","os","ow","ox","oy","pa","pe","pi","po","qi","re","sh","si","so","ta","te","ti","to","uh","um","un","up","us","ut","we","wo","xi","xu","ya","ye","yo","za"}));
    }

    /**
     * Returns a random element of the list 
     * 
     *@param list name of the list to withdraw the data
     *@param seed seed number of the random generator 
     */
    public String getRandomElement(List<String> list,int seed) 
    { 
        Random rand = new Random(seed); 
        return list.get(rand.nextInt(list.size())); 
    } 

    /**
     * Returns time taken to add items at the beginning of the container 
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public long timeAddToFront(int numberOfItems,int seed){
        RandomStringContainer test=new RandomStringContainer(); //creates randomStringContainer object  
        //adds 5 element as a starting point 
        int initialElementsNumber=5;
        for (int i=0;i<initialElementsNumber;i++){
            test.addToBack(getRandomElement(twoLetterWords,seed));
        } 
        long startTime = System.currentTimeMillis(); //take initial time 
        for (int i=0;i<numberOfItems;i++){
            test.addToFront(getRandomElement(twoLetterWords,seed)); //add to front of the element 
        } 
        long stopTime = System.currentTimeMillis(); //take final time 
        return (stopTime - startTime);  //return the difference between the final and intial time       
    }

    /**
     * Returns time taken to add items at the end of the container 
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public long timeAddToBack(int numberOfItems,int seed){
        RandomStringContainer test=new RandomStringContainer(); //creates randomStringContainer object 
        //adds 5 element as a starting point 
        int initialElementsNumber=5;
        for (int i=0;i<initialElementsNumber;i++){
            test.addToBack(getRandomElement(twoLetterWords,seed));
        } 
        long startTime = System.currentTimeMillis();//take initial time 
        for (int i=0;i<numberOfItems;i++){
            test.addToBack(getRandomElement(twoLetterWords,seed)); //add to the back of the element 
        }
        long stopTime = System.currentTimeMillis(); //take final time 
        return (stopTime - startTime);  //return the difference between the final and the initial time 
    }

    /**
     * Returns time taken to add items at the sorted container 
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public long timeAddSorted(int numberOfItems,int seed){
        RandomStringContainer test=new RandomStringContainer(); //creates a random string object 
        //adds element as a starting point 
        int initialElementsNumber=5;
        for (int i=0;i<initialElementsNumber;i++){
            test.addToBack(getRandomElement(twoLetterWords,seed));
        } 
        test.selectionSort(); //sort the container 
        long startTime = System.currentTimeMillis();// start time 
        for (int i=0;i<numberOfItems;i++){
            test.addSorted(getRandomElement(twoLetterWords,seed)); //proceed to addSorted 
        } 
        long stopTime = System.currentTimeMillis();//final time 
        return stopTime - startTime;        //difference between the final and start tie 
    }

    /**
     * Returns time taken sort unsorted list  
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public long timeSortofUnsortedList(int numberOfItems,int seed){
        RandomStringContainer test=new RandomStringContainer(); //create container object 
        //adds 5 element as a starting point 
        int initialElementsNumber=5;
        for (int i=0;i<initialElementsNumber;i++){
            test.addToBack(getRandomElement(twoLetterWords,seed));
        } 
        //introduce the number of elements desired 
        for (int i=0;i<numberOfItems;i++){
            test.addToBack(getRandomElement(twoLetterWords,seed));
        }
        long startTime = System.currentTimeMillis();// start time 
        test.selectionSort(); //sort the element 
        long stopTime = System.currentTimeMillis();//stop time 
        return (stopTime - startTime); //return the difference between stop and start time 
    }

    /**
     * Returns time taken sort a sorted list  
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public long timeSortofSortedList(int numberOfItems,int seed){
        RandomStringContainer test=new RandomStringContainer();
        //adds 5 element as a starting point 
        int initialElementsNumber=5;
        for (int i=0;i<initialElementsNumber;i++){
            test.addToBack(getRandomElement(twoLetterWords,seed));
        } 
        //add the desired number of inputs 
        for (int i=0;i<numberOfItems;i++){
            test.addToBack(getRandomElement(twoLetterWords,seed));
        }
        //procced to a selection sort 
        test.selectionSort();
        long startTime = System.currentTimeMillis();//start time 
        test.selectionSort(); //selection sort 
        long stopTime = System.currentTimeMillis(); //stop time 
        return (stopTime - startTime); //return the difference between stop time and start time 
    }    
}