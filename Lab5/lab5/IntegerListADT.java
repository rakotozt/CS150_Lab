
/**
 * Abstract class for the integerListADT class
 *
 * @author Tafita Rakotozandry 
 * @version 1
 */
public abstract class IntegerListADT
{

    /**
     * inserts x at the end of the list  
     * 
     *@param x integer elment 
     */
    public abstract void append(Integer x);

    /**
     * returns a String that is stored in this list   
     * 
     */
    public abstract String toString();

    /**
     * returns true if the list is empty   
     *  
     */
    public abstract boolean isEmpty();

}
