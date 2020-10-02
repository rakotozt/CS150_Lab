
/**
 *Implements the iterator 
 *
 * @author Tafita Rakotozandry 
 * @version1
 */
import java.util.*; 
public class MyLinkedListIterator<E> implements Iterator<E> {
    private Node<E> visitorNode; //it is a node that visit element in the container one by one 

    /**
     * Constructor for the class
     * 
     */
    public MyLinkedListIterator(MyLinkedList<E> linkedList) {
        visitorNode = linkedList.getHead(); // the iterator starts at the head 
    }

    /**
     * Returns the next element in the iteration.
     * 
     */
    public E next() {
        //it gets the visitor node current value and returns it 
        //after that the visitor node moves to the next node  
        E value = this.visitorNode.getVal();
        visitorNode = this.visitorNode.getNext();
        return value;
    }

    /**
     *Returns true if the iteration has more elements.
     *
     */
    public boolean hasNext() {
        //if the visitor node actual value is null
        //it returns false 
        return visitorNode != null;
    }
}