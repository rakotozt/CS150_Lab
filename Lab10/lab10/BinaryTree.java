import java.util.*;
/**
 * Binary Tree abstract Class 
 *
 * @author Tafita Rakotozandry 
 * @version 1
 */
public abstract class BinaryTree<E> implements Tree<E> {
    public E key;  
    public BinaryNode<E> root; // set the node in use as root 
    /**
     *Root getter 
     *
     *@return root
     */
    public BinaryNode<E> getRoot(){
        return root;
    }

    /**
     *Root Setter 
     *
     *@param node the binary node to insert
     */
    public void setRoot( BinaryNode<E> node ){
        this.root=node;
    }

    /**
     * Returns true if there are no items in the tree, false otherwise.
     * 
     */
    public boolean isEmpty(){
        return root==null;
    }

    /**
     * Removes all the items from the tree.
     * 
     */
    public void empty(){
        setRoot(null);
    }

    /**
     * Helper function for preOrderArray
     *
     * @param node the current node to traverse recursively
     * @param list the complete list of nodes traversed
     */
    private void preOrderArrayHelper(BinaryNode<E> node, ArrayList<BinaryNode<E>> list) {
        //1. Visit the root.
        //2. Traverse the left subtree, i.e., call Preorder(left-subtree)
        // 3. Traverse the right subtree, i.e., call Preorder(right-subtree)
        if (node == null) return;
        list.add(node);
        this.preOrderArrayHelper(node.left, list);
        this.preOrderArrayHelper(node.right, list);
    }

    /**
     * @return ArrayList representation of this using pre-order traversal
     */
    public ArrayList<BinaryNode<E>> preOrderArray() {

        ArrayList<BinaryNode<E>> arrayList = new ArrayList<>();
        this.preOrderArrayHelper(this.root, arrayList);
        return arrayList;
    }

    /**
     *  Returns a String representation using preorder traversal.
     */
    public String preOrderString(){
        return treeArrayToString(this.preOrderArray());
    }

    /**
     * Helper function for postOrderArray
     *
     * @param node the current node to traverse recursively
     * @param list the complete list of nodes traversed
     */
    private void postOrderArrayHelper(BinaryNode<E> node, ArrayList<BinaryNode<E>> list) {
        if (node == null) return;
        // Traverse the left subtree. call Postorder(left-subtree)\
        //Traverse the right subtree. call Postorder(right-subtree)
        //Visit the node entered 
        this.postOrderArrayHelper(node.left, list);
        this.postOrderArrayHelper(node.right, list);
        list.add(node);
    }

    /**
     * @return ArrayList representation of this using post-order traversal
     */
    public ArrayList<BinaryNode<E>> postOrderArray() {
        ArrayList<BinaryNode<E>> arrayList = new ArrayList<>();
        this.postOrderArrayHelper(this.root, arrayList);
        return arrayList;
    }

    /**
     * - Returns a String representation using postorder traversal.
     * 
     */
    public String postOrderString(){
        return treeArrayToString(this.postOrderArray());
    }

    /**
     *Helper function for inorder array
     *
     *@param node the node in concern
     */
    public void inOrderArrayHelper(BinaryNode<E> node, ArrayList<BinaryNode<E>> list){ 
        if (node == null) return;
        this.inOrderArrayHelper(node.left, list);
        list.add(node);
        this.inOrderArrayHelper(node.right, list);
    }

    /**
     * Calls inOrderArrayHelper at the root with an empty list
     *
     * @return ArrayList representation of this using in-order traversal
     */
    public ArrayList<BinaryNode<E>> inOrderArray() {
        //1. Traverse the left subtree, i.e., call Inorder(left-subtree)
        //2. Visit the root.
        // 3. Traverse the right subtree, i.e., call Inorder(right-subtree)

        ArrayList<BinaryNode<E>> arrayList = new ArrayList<>();
        this.inOrderArrayHelper(this.root, arrayList);
        return arrayList;
    }

    /**
     *Returns a String representation using inOrder traversal
     *
     */
    public String inOrderString(){
        return treeArrayToString(this.inOrderArray()); 
    }

    /**
     * Converts arrayList of nodes to String representation
     *
     * @param arrayList The arrayList to make into string
     * @return the string representation
     */
    private String treeArrayToString(ArrayList<BinaryNode<E>> arrayList) {
        String asString = arrayList.toString().replaceAll(",", "");
        return asString.substring(1, asString.length() - 1);
    }

    /**
     * Helper function for this.numOfElementsDepth()
     *
     * @param node          current node in the recursive iteration
     * @param currentDepth    current node's depth
     * @param requiredDepth  required depth at which we count the num of elements
     * @return  the number of elements at depth requiredDepth in the tree
     */
    private int numOfElementsDepthHelper(BinaryNode<E> node, int currentDepth, int requiredDepth) {
        if (node == null) return 0;
        else if (currentDepth == requiredDepth) return 1;
        return this.numOfElementsDepthHelper(node.left, currentDepth + 1, requiredDepth) +
        this.numOfElementsDepthHelper(node.right, currentDepth + 1, requiredDepth);
    }

    /**
     *  returns the number of elements at a certain depth i
     *
     *@param i: the depth number
     */
    public int numOfElementsDepth(int i){
        return this.numOfElementsDepthHelper(this.root, 0, i);
    } 
    
        /**
     * compute the height of a given node t
     *
     * @param t the given node 
     * @return the height of t
     */
    public int getHeight(BinaryNode<E> node) {

        if (node == null) 
        //if there is nothing in the tree
        //the height is 0
            return 0; 
        else 
        { 
            //go through all the left tree
            int leftHeight = getHeight(node.left);
            //got throught the right tree 
            int rightHeight = getHeight(node.right); 
            //the largest height between right and left is the height of the tree
            if (leftHeight > rightHeight) 
                return (leftHeight + 1); 
            else 
                return (rightHeight + 1); 
        } 
    }
    
    
    
}