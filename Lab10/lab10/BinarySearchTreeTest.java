
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BinarySearchTreeTest.
 *
 * @author  Tafita Rakoto
 * @version 1
 */
public class BinarySearchTreeTest
{ 
    /**
     * Tests the insert function by testing insertAll.
     * We test insertAll since it pretty much the same function with an iteration.
     *
     */
    @Test
    public void insertAll() {
        Integer[] arr = {6, 1, 4, 2, 5, 7, 8};

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        BinaryNode<Integer> node5 = new BinaryNode<>(6);
        node5.left = new BinaryNode<>(1);
        node5.left.right = new BinaryNode<>(4);
        node5.left.right.left = new BinaryNode<>(2);
        node5.left.right.right = new BinaryNode<>(5);
        node5.right = new BinaryNode<>(7);
        node5.right.right = new BinaryNode<>(8);
        binarySearchTree.root = node5;
        BinarySearchTree<Integer> binarySearchTree1 = new BinarySearchTree<>();
        binarySearchTree1.insertAll(arr);
        assertEquals(binarySearchTree.inOrderString(), binarySearchTree1.inOrderString());

    }

    /**
     * Test the contains function
     */
    @Test
    public void contains() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{2,6,7,8,9,4,3});
        int [] arr=new int[]{2,6,7,8,9,4,3};
        for(int i=0;i<arr.length;i++){
            assertTrue(binarySearchTree.contains(arr[i]));
        }

        assertFalse(binarySearchTree.contains(23));
        assertFalse(binarySearchTree.contains(41));
        assertFalse(binarySearchTree.contains(52));
    }

    /**
     * Test the number of elements depth function
     */
    @Test
    public void numOfElementsDepth() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{6, 1, 4, 2, 5, 7, 8, 9});
        assertEquals(1, binarySearchTree.numOfElementsDepth(0));
        assertEquals(2, binarySearchTree.numOfElementsDepth(1));
        assertEquals(2, binarySearchTree.numOfElementsDepth(2));
        assertEquals(3, binarySearchTree.numOfElementsDepth(3));
    }

    /**
     * Test finding max value
     */
    @Test
    public void TestFindMax() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{23,6,7,5,9});
        assertEquals(23, binarySearchTree.findMax().intValue());
    }

    /**
     * Test finding max value
     */
    @Test
    public void TestFindMin() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{23,6,7,5,9});
        assertEquals(5, binarySearchTree.findMin().intValue());
    }

    /**
     * Test the empty function
     */
    @Test
    public void testEmpty() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{23,6,7,5,9});
        binarySearchTree.empty();
        assertNull(binarySearchTree.root);
    }

    /**
     * Test the is empty function
     */
    @Test
    public void TestIsEmpty() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        assertTrue(binarySearchTree.isEmpty());
        binarySearchTree.insertAll(new Integer[]{23,6,7,5,9});
        assertFalse(binarySearchTree.isEmpty());
        binarySearchTree.empty();
        assertTrue(binarySearchTree.isEmpty());
    }

     @Test
    public void testInOrderTraversals() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{6, 1, 4, 2, 5, 7, 8, 9});
        assertEquals("1 2 4 5 6 7 8 9", binarySearchTree.inOrderString());
    }

     @Test
    public void testpreOrderTraversals() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{6, 1, 4, 2, 5, 7, 8, 9});
        assertEquals("6 1 4 2 5 7 8 9", binarySearchTree.preOrderString());
    }

     @Test
    public void testpostOrderTraversals() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{6, 1, 4, 2, 5, 7, 8, 9});
        assertEquals("2 5 4 1 9 8 7 6", binarySearchTree.postOrderString());
    }
    
         @Test
    public void testGetHeight() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insertAll(new Integer[]{6, 1, 4, 2, 5, 7, 8, 9});
        assertEquals(4, binarySearchTree.getHeight(binarySearchTree.getRoot()));
    }
}
