
/**
 * Queue Implementation from linkeList 
 *
 * @author Tafita Rakoto
 * @version 1
 */

public class MyQueue <E> implements QueueInterface <E> {
    MyLinkedList queue = new MyLinkedList();

    /**
     *  Inserts the specified element into the queue.
     * @param item E
     */
    public E add(E item) { 
        queue.addEnd(item); // Adds the item to the end of the queue
        return item; // Returns the item added
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     */
    public E peek() {
        return (E) queue.getHead().getVal(); // Returns the head of the linkedlist 
    }

    /**
     *  Retrieves and removes the head of the queue
     */
    public E remove() {
        queue.removeHead(); // Removes the head node of the queue
        return (E) queue.removedObject; // Returns the node just removed
    }
}

