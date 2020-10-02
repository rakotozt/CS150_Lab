
import java.util .*; 
/**
 *  A class that contains a generic ArrayList and implements comparable interface. 
 *  
 * @author Tafita Rakotozandry
 * @version 1
 */
public class RandomStuffContainer<T extends Comparable<T>>
{
    protected ArrayList<T> list;
    public static void main (String [] args){
        RandomStuffContainer<Integer> container=new RandomStuffContainer<Integer>(); 
        container.addToBack(98); 
        container.addToBack(32); 
        container.addToBack(8); 
        container.addToFront(40); 
        System.out.println(container.toString());
        //container.selectionSort();
        //container.bubbleSort();
        container.reverseSort();
        System.out.println(container.toString());
    }

    /**
     * Constructs a new generic arrayList
     */
    public RandomStuffContainer()
    {
        list= new ArrayList<T> ();
    }

    /**
     * Copies elements from a given index until the end of the list 
     *
     * @param  index the starting index
     * * @param newList the list in which the elements will be copied
     */
    private void copyElements(int index,ArrayList<T> newList)
    {
        //iterate from the given index until the end of the list 
        for (int i=index; i<list.size(); i++){
            //append the elements to the new arrayList
            newList.add(list.get(i)); 
        }   
    } 

    /**
     * Copies the elements from the new arrayList to the original arrayList 
     *
     * @param  index the index in which the append process should start 
     * @param newList the arrrayList in which the data will be withdrawn
     */
    private void appendCopiedElements (int index, ArrayList<T> newList)
    {
        //check if the list is not empty
        //start iteration from the index 0 
        for (int i=0; i<newList.size()-1; i++){
            //set the elements from the copiedList to the original starting from the desired index
            list.set(index, newList.get(i));
            index++; 
        }
        //append the last element of the copied version to the desired location
        list.add(newList.get(newList.size()-1)); 

    }

    /**
     * Inserts a new element at the beginning of the container 
     *
     * @param e the element/object to insert
     */
    public void  addToFront(T e)
    {
        ArrayList<T> newList=new ArrayList<T>(); //create a new list 
        copyElements(0,newList); //copy elements from 0 till the end of the list 
        list.set(0,e); //set the new elemement as a first element
        appendCopiedElements(1,newList); //append the rest of the elements behind the new inserted element 

    }

    /**
     * Adds element to the end of the container 
     *
     * @param e the element to insert
     */
    public void  addToBack(T e)
    {
        list.add(e); // append the element in the back 
    }

    /**
     * Sorts the elements using the selection sort technique 
     * 
     */
    public void  selectionSort()
    {
        //variable delcaration 
        int minIndex; 
        int numbersSize=list.size();
        T temp; 
        //star of the loop 
        for (int i = 0; i < numbersSize - 1; ++i) {

            minIndex = i; //assign the current index as the one possessing the smallest order of elements
            //compare that elements to next elements 
            for (int j = i + 1; j < numbersSize; ++j) {

                if (list.get(j).compareTo(list.get(minIndex))<0) {
                    minIndex = j;//assign as the minIndex to the index that possess the smallest elements 
                }
            }
            //when the smallest element is found
            //proceed to the swapping system 
            temp = list.get(i); //save that element in temporary variable
            list.set(i,list.get(minIndex)); //copy the original element to the other position
            list.set(minIndex, temp);//and set the smallest element to the location of the first element
        }

    }

    /**
     * Sorts the elements/objects using the bubble sort technique 
     * 
     */
    public void  bubbleSort()
    {
        int numbersSize=list.size(); //size of the list 
        T temp;//create a temp variable 
        for (int i = 0; i < numbersSize;i++) {//run a foor loop that go through the entire list 
            for (int j=1; j<numbersSize-i; j++){//run a for loop that goes from the index 1 to the end of the list
                if (list.get(j-1).compareTo(list.get(j))>0) //compare the two succeeding  items on the list 
                { //if the preceeding item is bigger than the next item
                    //make a swap
                    temp=list.get(j-1) ; //save the preceeding item in a temporary variabe 
                    list.set( j-1,list.get(j)); //set the new smaller item in place of the bigger one
                    list.set(j,temp); //set the item on the temporary variable to the next step
                }
            }

        }

    }

    /**
     * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     */
    public String [] toArray()
    {
        String[] arr = new String[list.size()]; 
        return list.toArray(arr); 
    }

    /**
     * Returns the element of the list into string   
     * 
     */
    @Override 
    public String toString()
    {
        return list.toString();
    }

    /**
     * Reverse the list order from highest to smallest 
     *
     */
    public void reverseSort()
    {
        selectionSort();  
        Collections.reverse(list); 
    }
}
