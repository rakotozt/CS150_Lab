import java.util.*; 
/**
 * Resizable container of String elements. Includes different operations method such as AddToFront,AddToBack,AddSorted,selectionSort
 *
 * @author Tafita Rakotozandry
 * @version 1
 */
public class RandomStringContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<String> list; 

    /**
     * Creates an array list of string
     *  
     */
    public RandomStringContainer()
    {
        // initialise instance variables
        list =new ArrayList<String>(); 
    }

    /**
     * Copies elements from a given index until the end of the list 
     *
     * @param  index the starting index
     * * @param newList the list in which the elements will be copied
     */
    private void copyElements(int index,ArrayList<String> newList)
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
    private void appendCopiedElements (int index, ArrayList<String> newList)
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
     * Adds a new element at the beginning of the container 
     *
     * @param str the string element 
     */
    public void addToFront(String str)
    {

        ArrayList<String> newList=new ArrayList<String>(); //create a new list 
        copyElements(0,newList); //copy elements from 0 till the end of the list 
        list.set(0,str); //set the new elemement as a first element
        appendCopiedElements(1,newList); //append the rest of the elements behind the new inserted element 
    }

    /**
     * Adds element to the end of the container 
     *
     * @param  str the string element
     */
    public void addToBack(String str)
    {
        list.add(str); // append the element in the back 
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
     * Adds new string elements in a presorted list 
     *
     * @param  str the new string element 
     */
    public void addSorted(String str)
    {
        //start 
        int index=0; 
        //find the appropriate index to locate the new str 
        for (int i=0; i<list.size(); i++){
            if((str.compareTo(list.get(i)))<=0){
                index=i; 
                break; 
            }

        }

        ArrayList<String> newList=new ArrayList<String>();//create a new arrayList container 
        copyElements(index,newList); //copy the elements starting from the chosen index till the end of the list 
        list.set(index,str); // set the new str  on the chosen index 
        appendCopiedElements(index+1, newList); // append the remaining elements after the the new inserted elemements 
    }

    /**
     * Sorts the elements using the selection sort technique 
     * 
     */
    public void selectionSort(){
        //variable delcaration 
        int minIndex; 
        int numbersSize=list.size();
        String temp; 
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
     * Returns the array in form of string 
     * 
     */
    @Override 
    public String toString(){
        return list.toString(); 
    }

}