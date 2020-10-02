
/**
 * Integer container 
 *
 * @author Tafita Rakotozandry 
 * @version1
 */
public class MyListIntegerContainer
{
    public MyLinkedList<Integer> linkedList;
    /**
     * Creates a new linkedList with an integer attribute 
     * 
     */
    public MyListIntegerContainer()
    {
        this.linkedList = new MyLinkedList<Integer>();
    }

    /**
     *Add integer to front of the list
     *@param num the desired number
     *
     */
    public void addToFront(Integer num) {
        this.linkedList.addFirst(num);
    }

    /**
     *Add integer to the back of the list
     *@param num the desired number  
     *
     */
    public void addToBack(Integer num) {
        this.linkedList.addEnd(num);
    }

    /**
     *Search the container using the classic for loop
     *@param searchVal the value to search for 
     *
     */  
    public int searchWithoutIterator(Integer searchVal){
        Node<Integer> currentNode=linkedList.head; 
        for (int i=0; i<linkedList.length(); i++){
            if(currentNode.getVal()==searchVal){ return i;};
            currentNode=currentNode.next;
        }
        return -1;
    }

    /**
     *Search the container using iterator
     *@param searchVal the value to search for 
     *
     */  
    public int searchWithIterator(Integer searchVal){
        MyLinkedListIterator<Integer> list_Iterator = linkedList.iterator();
        int i=0;
        while(list_Iterator.hasNext()){ 
            if(list_Iterator.next()==searchVal){ return i;}
            i++;
        } 
        return -1;
    }
}
