
/**
 * Interface Tree 
 *
 * @author Tafita Rakotozandry
 * @version 1
 */
public interface Tree<E> {

    /**
     * Inserts the given key to the tree, if it is
     * not already present (duplicate keys are not allowed in the tree).
     * @param e The key to insert
     * @return true if insertion was successful.
     */
    boolean insert(E e);

    /**
     * @param e The key to check for
     * @return true if the tree contains the
     * specified key.
     */
    boolean contains(E e);

    /**
     *
     * @param i depth to check for
     * @return the number of elements at a certain depth i
     */
    int numOfElementsDepth(int i);

    /**
     * @return finds and returns the max element of tree
     */
    E findMax();

    /**
     * @return finds and returns the min element of the tree
     */
    E findMin();

    /**
     * @return string representation of this using pre-order traversal
     */
    String preOrderString();

    /**
     * @return string representation of this using post-order traversal
     */
    String postOrderString();

    /**
     * @return string representation of this using in-order traversal
     */
    String inOrderString();

    /**
     * removes all elements from the tree
     */
    void empty();

    /**
     * @return true if tree is empty, false otherwise
     */
    boolean isEmpty();
}
