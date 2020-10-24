
/**
 * Queue Interface
 *
 * @author Tafita
 * @version 1
 */
public interface QueueInterface<E> 
{

    /**
     *  Inserts the specified element into the queue.
     *
     */
    E add(E item); 

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     */
    E peek();

    /**
     *  Retrieves and removes the head of the queue
     *
     */
    E remove();
}
