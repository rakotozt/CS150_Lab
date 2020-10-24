/**
 * Binary Search Tree
 *
 * @author Tafita Rakoto
 * @version 1
 */
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E>
{

    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree()
    {
        root=null; 
    }

    public BinaryNode<E> insert(E e,BinaryNode<E> node){

        if(node==null){
            return new BinaryNode<E>(e);
        }
        if(e.compareTo(node.getKey())<0){
            node.setLeft(insert(e,node.getLeft()));
            //return true;
        }else if(e.compareTo(node.getKey())>0){
            node.setRight(insert(e,node.getRight()));
            //return true;
        }else{
            ;
        }
        return node;
    }

    public boolean insert(E e){
        if(contains(e)){return false;}
        else{ 
            setRoot(insert(e,root));
            return true;
        }

    }

    /**
     * Inserts an array of elements
     *
     * @param elements the array of elements to insert
     */
    public void insertAll(E[] elements) {

        for (E e : elements) {
            this.insert(e);
        }
    }

    /**
     * Find the maximum and return maximum in element in a tree 
     *
     * @param node node in concern
     * @return return the maximu node 
     */
    public E findMax(BinaryNode<E> node){
        if(node.getKey()==null){
            return null; 
        }else if(node.getRight()==null){
            return node.getKey();
        }else{
            return findMax(node.getRight());
        }
    }

    /**
     * Find the maximum element in node 
     *
     * @return return the maximum node 
     */
    public E findMax(){ 
        if(isEmpty()){
            System.out.println("Empty");
        }
        return findMax(getRoot()); }

    /**
     * Finds and returns the lowest item in a tree.
     * @param node : starting node. Usually the root 
     */
    public E findMin(BinaryNode<E> node){
        //the min will  be in the most left part 
        if(node.getKey()==null){
            return null; 
        }else if(node.getLeft()==null){
            return node.getKey();
        }else{
            return findMin(node.getLeft());
        }
    }

    /**
     * Finds and returns the lowest item in the tree.
     */
    public E findMin(){       
        return findMin(getRoot());}

    /**
     * Finds if the Node containing the key exists 
     * 
     * @param key 
     */
    public boolean ifNodeExists( BinaryNode<E> node, E key)  
    {  
        if (node == null)  
            return false;  

        if (node.getKey() == key)  
            return true;  

        // then recur on left sutree / 
        boolean res1 = ifNodeExists(node.left, key);  

        // now recur on right subtree / 
        boolean res2 = ifNodeExists(node.right, key);  

        return res1 || res2;  
    }  

    /**
     *  Returns true if the tree contains the specified key.
     * @ e : key to search for 
     */
    public boolean contains (E e){
        return ifNodeExists(root, e);
    }

}
