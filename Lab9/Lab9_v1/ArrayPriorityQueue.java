import java.util.*;
/**
 * Priority Queue Implementation 
 *
 * @author Tafita Rakotozandry 
 * @version 1
 */
public class ArrayPriorityQueue  <T extends Comparable <? super T>> 
{
    private int size; // Number of elements in queue
    private ArrayList<T> items; // The queue binary heap array
    public static void main(){
        ArrayPriorityQueue<WeightedElement<Integer,Integer> > queue1 =new ArrayPriorityQueue<WeightedElement<Integer,Integer>>();
        PriorityQueue<WeightedElement<Integer,Integer>> queue2 = new PriorityQueue<WeightedElement<Integer,Integer>>(); 

        WeightedElement<Integer,Integer> first= new WeightedElement<Integer,Integer> (41,36);
        WeightedElement<Integer,Integer> second= new WeightedElement<Integer,Integer> (51,95);
        WeightedElement<Integer,Integer> third= new WeightedElement<Integer,Integer> (52,685);
        WeightedElement<Integer,Integer> fourth= new WeightedElement<Integer,Integer> (952,441);
        WeightedElement<Integer,Integer> fifth= new WeightedElement<Integer,Integer> (2,6);
        WeightedElement<Integer,Integer> sixth= new WeightedElement<Integer,Integer> (86,500);
        queue1.add(first);
        queue2.add(first);
        queue1.add(second);
        queue2.add(second);
        queue1.add(third);
        queue2.add(third);
        queue1.add(fourth);
        queue2.add(fourth);
        queue1.add(fifth);
        queue2.add(fifth);
        queue1.add(sixth);
        queue2.add(sixth);

        System.out.println(queue1.toString());
        System.out.println(queue2.toString());
        System.out.println("");
        System.out.println(queue1.poll());
        System.out.println(queue2.poll());
        System.out.println("");

        System.out.println(queue1.toString());
        System.out.println(queue2.toString());
        System.out.println("");
        System.out.println(queue1.poll());
        System.out.println(queue2.poll());
        System.out.println("");
        System.out.println("");

        System.out.println("");
        System.out.println(queue1.peek());
        System.out.println(queue2.peek());
        System.out.println("");
        System.out.println("");

        System.out.println(queue1.toString());
        System.out.println(queue2.toString());
        System.out.println("");
        System.out.println(queue1.poll());
        System.out.println(queue2.poll());
        System.out.println("");
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());

        System.out.println("");
        System.out.println(queue1.poll());
        System.out.println(queue2.poll());
        System.out.println("");
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());

        System.out.println("");
        System.out.println(queue1.poll());
        System.out.println(queue2.poll());
        System.out.println("");
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());

        System.out.println("");
        System.out.println(queue1.poll());
        System.out.println(queue2.poll());
        System.out.println("");
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());

        System.out.println("");
        System.out.println(queue1.poll());
        System.out.println(queue2.poll());
        System.out.println("");
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());
    }

    /**
     * Constructor for objects of class ArrayPriorityQueue
     */
    public ArrayPriorityQueue()
    {

        size = 0;
        items = new ArrayList<T>();
        // create space for sentinel
        items.add(null);

    }

    /**
     * Insert t at the end of the ArrayList, returning true if successful

     *
     * @param  t element 
     * @return    boolean 
     */
    public boolean add(T t)
    {
        // increase the size of the items heap to create a hole for the new item
        items.add(null);

        // Insert item at end of heap and then re-establish ordering
        size += 1;
        int hole = size;
        // set the item as a sentinel at the base of the heap
        items.set(0, t);

        // move the item up from the hole position to its correct place
        for (; t.compareTo(items.get(hole / 2)) < 0; hole /= 2) {
            items.set(hole, items.get(hole / 2));
        }
        // insert the new item in the correct place
        items.set(hole, t);
        return true;
    }
    // Swap two locations i and j in ArrayList a.
    private static <E> void swap(ArrayList<E> a, int i, int j) {
        E t = a.get(i);
        a.set(i, a.get(j));}

    private static int parent(int i) {
        return (i-1)/2;
    }

    /**
     *  Find the minimal element, remove it from the ArrayList, and return it. Use a simple linear scan.
     *
     * @return    minimum element 
     */
    public T poll()
    {
        if (isEmpty())
            return null;
        T minItem = items.get(1);
        items.set(1, items.get(size));

        size -= 1;
        reorder(1);
       // items.remove(size);
        return minItem;
    }

    private void reorder(int hole) 
    {
        int child;
        T tmp = items.get(hole);

        for (; hole * 2 <= size; hole = child) {
            child = hole * 2;
            if (child != size
            && ((Comparable) items.get(child + 1)).compareTo(items.get(child)) < 0)
                child++;
            if (((Comparable) items.get(child)).compareTo(tmp) < 0)
                items.set(hole, items.get(child));
            else
                break;
        }
        items.set(hole, tmp);
    }

    /**
     *  Find and return the minimal element, without removing it
     *
     * @return  return the minimal element
     */
    public T peek()
    {
        if (isEmpty())
            return null;
        T minItem = items.get(1);
        return minItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        // ArrayList<T> temp=new ArrayList<T>();
        // if(!isEmpty()){ 
            // for(int i=1;i<size-1;i++){
                // temp.add(items.get(i));
            // }

        // }
        //return temp.toString();
        return items.toString();
    }
}

