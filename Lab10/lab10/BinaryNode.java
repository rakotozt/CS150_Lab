
/**
 * Binary Node 
 *
 * @author Tafita Rakoto
 * @version 1
 */
public class BinaryNode<E> {
    //Instatiation 
    public E key;
    public BinaryNode left;
    public BinaryNode right;
    /**
     * Constructor for BinaryNode. Sets left and right children to null,
     * and sets this.key to key 
     *
     * @param data the data the node contains/wraps
     */
    BinaryNode (E key) {
        // the default left and right of the created node is null 
        this.key = key;
        this.right = null;
        this.left = null;
    }

    /**
     *Getter left Node 
     */
    public BinaryNode<E> getLeft(){
        return this.left; 
    }    

    /**
     *Getter right Node 
     */
    public BinaryNode<E> getRight(){
        return this.right; 
    }

    /**
     *Getter key
     */
    public E getKey(){
        return this.key; 
    }

    /**
     *Setter key
     *
     *@param e element to set 
     */
    public E setKey(E e){
        return this.key=e; 
    }

    /**
     *Set the of the leftNode
     *
     *@param leftNode left node element 
     */
    public void setLeft(BinaryNode<E> leftNode){
        this.left=leftNode;
    }

    /**
     *Set the of the rightNode
     *
     *@param right node element
     */
    public void setRight(BinaryNode<E> rightNode){
        this.right=rightNode;
    }
    
        @Override
    public String toString() {
        return this.key.toString();
    }
}
