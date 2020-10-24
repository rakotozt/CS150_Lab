import java.util.*; 
/**
 * Contains to pair of data 
 *
 * @author Tafita Rakotozandry 
 * @version1
 */
public class WeightedElement <E extends Comparable <? super E>,W extends Comparable <? super W>>  implements Comparable<WeightedElement<E,W>>
{
    E element; 
    W type; 
    /**
     * New Pair  
     */
    public WeightedElement()
    {
        this.element=null; 
        this.type=null; 
    }

    /**
     * Adds element of pair 
     */
    public WeightedElement(E e, W t)
    {
        this.element=e; 
        this.type=t; 
    }

    /**
     * element getter
     *
     */
    public E getElement()
    {
        return this.element; //get element 
    }

    /**
     *type getter
     *
     */
    public W getType()
    {
        return this.type; //get type 
    }

    /**
     * element setter
     * 
     */
    public void setElement(E e)
    {
        this.element=e; //set element 
    }

    /**
     * type setter
     * 
     */
    public void setType(W t)
    {
        this.type=t; //set type 
    }

    /**
     * Return String expression 
     * 
     */
    public String toString()
    {
        return "(" +element.toString()+" , "+type.toString() +")"; 
    }

    /**
     * Pair Comparator
     * 
     */
    public int compareTo(WeightedElement<E,W> we) {
        //compare by type 
        //but if type is the same, compare the element 
        if (this.type.compareTo(we.getType()) ==0) {
            return 0;

        } else if (this.type.compareTo(we.getType()) < 0) {
            return -1; //return 1 if the actual type is bigger than the compared type 

        } else if (this.type.compareTo(we.getType()) > 0) {
            return 1;//return -1 if the actual type is less than the compared type 
        }
        return 0;
    }
}
