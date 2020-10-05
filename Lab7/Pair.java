import java.util.*; 
/**
 * Contains to pair of data 
 *
 * @author Tafita Rakotozandry 
 * @version1
 */
public class Pair <K extends Comparable <? super K>,T extends Comparable <? super T>>
{
    K key; 
    T value; 
    /**
     * New Pair  
     */
    public Pair()
    {
        this.key=null; 
        this.value=null; 
    }

    /**
     * Adds element of pair 
     */
    public Pair(K k, T v)
    {
        this.key=k; 
        this.value=v; 
    }

    /**
     * Key getter
     *
     */
    public K getKey()
    {
        return this.key; //get key 
    }

    /**
     *Value getter
     *
     */
    public T getValue()
    {
        return this.value; //get value 
    }

    /**
     * Key setter
     * 
     */
    public void setKey(K k)
    {
        this.key=k; //set key 
    }

    /**
     * Value setter
     * 
     */
    public void setValue(T s)
    {
        this.value=s; //set value 
    }

    /**
     * Return String expression 
     * 
     */
    public String toString()
    {
        return "(" +key.toString()+" , "+value.toString() +")"; 
    }

    /**
     * Pair Comparator
     * 
     */
    public int compareTo(Pair pair) {
        //compare by value 
        //but if value is the same, compare the key 
        if (pair.getValue() == this.value) {
            return pair.getKey().compareTo(this.key);

        } else if (pair.getValue().compareTo(this.value) < 0) {
            return 1; //return 1 if the actual value is bigger than the compared value 

        } else if (pair.getValue().compareTo(this.value) > 0) {
            return -1;//return -1 if the actual value is less than the compared value 
        }

        return 0;
    }
}
