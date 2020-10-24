import java.util.*;
/**
 * Stack Implementation Using LinkedList
 *
 * @author Tafita 
 * @version 1
 */
public class MyStack <E> implements StackInterface <E> {
    MyLinkedList<E> stack;

    public MyStack(){
        stack = new MyLinkedList();
    }

    /**
     * Tests if this stack is empty.
     */
    public boolean empty() {
        return stack.length() == 0; //returns the size of the linkedList 
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */

    public E peek() {
        return (E) stack.getHead().getVal(); //return the head of the linkedList 
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     */
    public E pop() {
        stack.removeHead(); //remove the head of the linked list
        return (E) stack.removedObject; //returns the object as the value of this function.
    }

    /**
     * Pushes an item onto the top of this stack.
     * @param item E
     */
    public E push(E item) {
        stack.addFirst(item); //add the head of the node 
        return item; //return the new item 
    }

    /**
     * Returns the 1-based position where an object is on this stack.
     * @param o Object
     */
    public int search(Object o) { 
        Node toBeSearched = new Node(o); // Casts the passed object to Node 
        if (stack.head.val == toBeSearched.val) {
            return 1; // Returns 1 if the head's value is the same as the object value
        }
        for (int i = 0; i < stack.length(); i++) {
            if (stack.getNode(i).val == toBeSearched.val) {
                return i + 1; // Returns (i) + 1 from the head wherever the value is found in the stack
            }
        }
        return -1; // Returns -1 if the value is not found anywhere in the stack
    }
}