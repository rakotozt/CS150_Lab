
/**
 * MainClass testing 
 *
 * @author Tafita 
 * @version 1
 */
public class MainClass {
    public static void main(String[] args) {
        Integer[] list = new Integer[args.length];
        // Loops through main function arguments and parses them into an Integer list
        for (int i = 0; i < args.length; i++) {
            list[i] = Integer.parseInt(args[i]);
        }
        if(list.length!=0){
            BinarySearchTree<Integer> binarySearchTree1 = new BinarySearchTree<>();
            binarySearchTree1.insertAll(list);
            System.out.println("Tree in-order traversal: " + binarySearchTree1.inOrderString());
            System.out.println("Tree pre-order traversal: " + binarySearchTree1.preOrderString());
            System.out.println("Tree post-order traversal: " + binarySearchTree1.postOrderString());
        }
        else{ //example
            BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
            binarySearchTree.insertAll(new Integer[]{6,3,9,1,4,8});
            System.out.println();
            System.out.println("List of Example from lecture: 6,3,9,1,4,8");
            System.out.println();
            System.out.println("In-order traversal: " + binarySearchTree.inOrderString());
            System.out.println("Pre-order traversal: " + binarySearchTree.preOrderString());
            System.out.println("Post-order traversal: " + binarySearchTree.postOrderString());

            System.out.println("Insert Existing Element");
            System.out.println("Insert 4: " + binarySearchTree.insert(4));

            System.out.println("Search Existing Element");
            System.out.println("Contains 3: " + binarySearchTree.contains(3));

            System.out.println("Search non existing Element");
            System.out.println("Contains 20: " + binarySearchTree.contains(20));

            System.out.println("Number of elements at depth 2: " + binarySearchTree.numOfElementsDepth(2));

            System.out.println("The Largest Element: " + binarySearchTree.findMax());

            System.out.println("Smallest Element: " + binarySearchTree.findMin());

            binarySearchTree.empty();
            System.out.println("Is empty: " + binarySearchTree.isEmpty());
        }
    }
}
