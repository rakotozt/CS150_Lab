import java.util.*;
/**
 * LinkedList Node 
 *
 * @author Tafita Rakotozandry 
 * @version version1
 */
public class Node<E>
{
    public Node<E> next; // Node next to the current node
    public E val; // value on the node

    /**
     *Creates an empty node 
     * 
     */
    public Node()
    {
        this.val=null; 
        this.next=null; 
    }

    /**
     * Creates a node and insets a new element in the node 
     * 
     */
    public Node(E val)
    {
        this.val=val; 
        this.next=null;  
    }

    /**
     * Returns the value in the node 
     * 
     */
    public E getVal()
    {
        return this.val; 
    }

    /**
     * Returns the next Node
     * 
     */
    public Node<E> getNext() {
        return this.next;
    }
}
