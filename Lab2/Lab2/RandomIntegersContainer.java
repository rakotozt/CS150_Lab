
/**
 * A class that manages random integers 
 *
 * @author Tafita Rakoto
 * @version 08/24/20
 */
import java.util.*;
public class RandomIntegersContainer
{
    // instance variables - replace the example below with your own
    private int [] array;
    private int lastItem;

    /**
     * Constructor creates an array of size 10
     */
    public RandomIntegersContainer()
    {
        // initialise instance variables
        array=new int [10]; 
        lastItem=0;
    }

    /**
     * Takes one int paramater and inserts it as the last element
     *
     * @param  num a integer number 
     */
    public void addToBack(int num)
    {
        if (lastItem<this.array.length){this.array[lastItem]=num; 
            lastItem++; }
        else {
            this.array = Arrays.copyOf(this.array, 2*(this.array.length));
            this.array[lastItem]=num; 
            lastItem++; 
        }
    }

    /**
     * Applies front inserting technique 
     * @param  num a integer number 
     */
    public void addToFrontProcess(int num){  
        // create a new array 
        int [] newArray=new int[lastItem+1]; 
        //copy the data from the old array to the new array 
        for (int i=0;i<lastItem+1;i++){
            newArray[i]=this.array[i];
        }
        //insert the start of the old array 
        this.array[0]=num; 
        //copy the new array to the old array by starting from index 1 
        for (int i=0;i<lastItem+1;i++){
            this.array[i+1]=newArray[i];
        }
        lastItem++;}

    /**
     * Takes one int paramater and inserts it as the last element
     *
     * @param  num a integer number 
     */
    public void addToFront(int num)
    {
        //if the array is not full 
        if (lastItem+1<this.array.length){
            this.addToFrontProcess(num);}
        //if the array is full 
        else {
            //double the array if there is not enough space
            this.array = Arrays.copyOf(this.array, 2*(this.array.length));
            this.addToFrontProcess(num);
        }
    }

    /**
     * inserts val at position pos
     *
     * @param  val  the value 
     * @param pos the index position 
     */
    public boolean addAt(int val, int pos)
    {
        //check if the position number is less than the maximum length
        if(pos<this.array.length & lastItem+2<this.array.length){
           //make a new array
            int newLength=(this.array.length-pos);
            int [] newArray=new int[newLength];
            //copy all the item inside the array after the provided index into another array 
            for (int i=pos;i<newLength;i++){
                newArray[i-pos]=this.array[i];
            }
            //insert the new value 
            this.array[pos]=val; 
            //append the copied items to the old array
            for (int i=pos+1;i<newLength;i++){
                this.array[i]=newArray[i-(pos+1)];
            }
            lastItem++;
            return true ;
        }
        else if (pos<this.array.length & lastItem+2>this.array.length){
            //same technique as previously but here the array is doubled before performing an insertion
            this.array = Arrays.copyOf(this.array, 2*(this.array.length));
            int newLength=(this.array.length-pos);
            int [] newArray=new int[newLength];
            for (int i=pos;i<newLength;i++){
                newArray[i-pos]=this.array[i];
            }
            this.array[pos]=val; 
            for (int i=pos+1;i<newLength;i++){
                this.array[i]=newArray[i-(pos+1)];
            }
            lastItem++;
            return true ;
        }
        else{
            return false;}

    }

    /**
     * Return the number of ints stored in the array 
     *
     * @return number of ints stored in the array 
     */
    public int numEntries()
    {
        return lastItem; 
    }

    /**
     * Return to array 
     *
     */
    public int [] toArray()
    {
        return this.array;
    }

    /**
     * Return the array in form of string 
     *
     */
    @Override 
    public String toString(){
        return Arrays.toString(this.array); 
    }
}
