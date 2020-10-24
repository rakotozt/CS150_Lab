
/**
 * Stack Interface 
 *
 * @author Tafita Rakotozandry 
 * @version 1
 */
public interface StackInterface<E>
{
    /**
     *  Tests if stack is empty
     *
     */
    boolean empty(); 

    /**
     *   Looks at the object at the top of the stack without
    removing it.
     *
     */
    E peek(); 

    /**
     *  – Removes the object at the top of the stack and returns
    the object as the value of this function.
     *
     */
    E pop(); 

    /**
     *    Pushes an item onto the top of the stack
     *
     */
    E push(E item); 

    /**
     *    Returns the distance from the top of the
    stack of the occurrence that is nearest the top of the stack. The
    topmost item is considered to be at distance 1; the next item is
    at distance 2; etc.
     *
     */
    int search(Object o); 
}
