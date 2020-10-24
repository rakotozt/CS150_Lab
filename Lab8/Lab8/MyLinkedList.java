import java.util.*; 
/**
 * A singly linked, non-circular list where each node only has one link next and the list has a head and a tail link
 *
 * @author Tafita Rakotozandry 
 * @version1
 */
public class MyLinkedList<E> implements Iterable
{
    public Node<E> head; //node head 
    private Node<E> tail;// node tail 
    private int length=0; //length of the file 
    public E removedObject; //holds the last object removed

    /**
     * Creates a new MyLinkedList and sets the head,tail and length to null 
     * 
     */
    public MyLinkedList()
    {
        //set everyhing to null when creating an empty linkedList 
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    /**
     * Creates a new MyLinkedList and set the had to a new node and tail to the head
     *@param val the insert value 
     *
     */
    public MyLinkedList(E val)
    {
        this.head=new Node(val);  //create a new node and assing it to node 
        this.tail=this.head; //with one element inserted, the element is both head and tail
        this.length=1;// the length of the linkedList is 1
    }

    /**
     * Returns true if MyLinkedList is empty 
     *
     */
    public boolean isEmpty()
    {
        return length==0; // true if length is equal to 0
    }

    /**
     *  Adds a value to the front of the list
     * @param  value the inserted value 
     * 
     */
    public void addFirst(E value)
    {
        if(isEmpty()){
            //if MyLinkedList is empty, the value is head and tail a the same time 
            this.head=new Node(value); 
            this.tail=this.head; 
        }
        else{
            //if not 
            //create a new node with the element 
            //assign the current head of the linked list as the next of the newnode
            //assign the new Node to the linked list head 
            Node<E> newNode=new Node(value);
            newNode.next=this.head;
            this.head=newNode;
        }
        length++; // increase the length of the linked List after insertion 
    }

    /**
     * Adds the value to the back of the list
     * @param value the new value to add 
     * 
     */
    public void addEnd(E value) {
        Node<E> newNode = new Node<E>(value);

        if (this.tail != null) {
            //If it is not null,we set the next of the tail to the node
            this.tail.next=newNode;
        } else {
            // If it is null, we set the head node to the new node as well
            this.head = newNode;
        }
        this.tail = newNode; //we set the tail to the new node 
        this.length++;// increase the length of the linked List after insertion 
    }

    /**
     * Returns the string expression of the LinkedList 
     * 
     * */
    public String toString(){
        String s=""; 
        Node<E> currentNode=head; //create a node head 
        if (isEmpty()){ 
            s=""; //return empty string if empty 
        }
        else{
            int i=0;
            //if not empty, go throught the list
            //concatinate the values 
            while( i<length){
                s=s+" "+currentNode.getVal();
                currentNode=currentNode.next;
                i++;
            }
        }
        return s ; 
    }

    /**
     * Returns an iterator over elements of type E
     * 
     * */
    public MyLinkedListIterator iterator(){
        MyLinkedListIterator it = new MyLinkedListIterator(this);
        return it;
    }

    /**
     * Get the head node
     * 
     */
    public Node<E> getHead() {
        return this.head;
    }

    /**
     * Get the tail node
     * 
     */
    public Node<E> getTail() {
        return this.tail;
    }

    /**
     * Returns the length of the list
     * 
     */
    public int length() {
        return this.length;
    }

    /**
     * Removes the head 
     */
    public Node removeHead() {
        if (head == null) 
            return null; 

        // Move the head pointer to the next node 
        Node temp = head; 
        head = head.next; 
        return head; 
    }

    /**
     * Search node with the specific index 
     * @param index int
     */
    public Node getNode(Integer index) {
        Node thisNode = head;

        for (int i = 0; i < this.length; i++) {
            if (index == i) {
                return thisNode; 
            }

            thisNode = thisNode.next; 
        }

        return null; 
    }
}

