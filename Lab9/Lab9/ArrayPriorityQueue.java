import java.util.*;
/**
 * Priority Queue Implementation 
 *
 * @author Tafita Rakotozandry 
 * @version 1
 */
public class ArrayPriorityQueue  <T extends Comparable <? super T>> 
{
    private ArrayList<T> priorityQueue; // The queue binary heap array

    /**
     * Constructor for objects of class ArrayPriorityQueue
     */
    public ArrayPriorityQueue()
    {
        priorityQueue = new ArrayList<T>();

    }

    /**
     * Insert t at the end of the ArrayList, returning true if successful

     *
     * @param  t element 
     * @return    boolean 
     */
    public boolean add(T t)
    {
        priorityQueue.add(t); 

        return true;
    }

    /**
     *  Find the minimal element, remove it from the ArrayList, and return it. Use a simple linear scan.
     *
     * @return    minimum element 
     */
    public T poll()
    {
        int minIndex=0;
        T temp;
        if (priorityQueue.size()==0)
            return null;
        else{//linear search the smallest value 
            for(int i=0;i<priorityQueue.size()-1;i++){
                if(priorityQueue.get(minIndex).compareTo(priorityQueue.get(i+1))>0){
                    minIndex= i+1;
                }
            }
            temp=priorityQueue.get(minIndex);
            priorityQueue.remove(minIndex);
            return temp; 
        }

    }

    /**
     *  Find and return the minimal element, without removing it
     *
     * @return  return the minimal element
     */
    public T peek()
    {
        int minIndex=0;
        T temp;
        //if empty return null 
        if (priorityQueue.size()==0)
            return null;
        else{ //linear search the smallest value 
            for(int i=0;i<priorityQueue.size()-1;i++){
                if(priorityQueue.get(minIndex).compareTo(priorityQueue.get(i+1))>0){
                    minIndex= i+1;
                }
            }
            temp=priorityQueue.get(minIndex);
            return temp; 
        }
    }

}

