
import java.util.*; 
/**
 * Wrapper node class for the Integer value
 *
 * @author Tafita
 * @version 1
 */
public class Cell
{
    //varriable declaration 
    private Integer  val; 
    private Cell next; 

    /**
     * Constructor for objects of class Cell
     */
    public Cell(Integer x)
    {
        this.val=x; 
    }

    /**
     * nserts x at the end of the list  
     * 
     *@param x integer value 
     */
    public void append(Integer x)
    {
        // checks to see if next is null. If it is, create a new Cell and assign it to next
        // and set the value of val to x.

        if(this.next==null){next=new Cell(x);}
        // Otherwise call append(x) on next. 
        else{this.next.append(x);}
    }

    /**
     * returns true if the list is empty   
     *  
     */
    public String toString()
    {
        //returns a String constructed by pre-pending val to the String returned by applying toString() to next (if next is not null) 
        String txt="";
        if(this.val!=null){txt=this.val.toString();}
        if(this.next!=null){
            txt=txt+(this.next).toString();}  
        return txt; 

    }

    /**
     * getter of the current val 
     *  
     */
    public Integer getVal() {
        return this.val;
    }

    /**
     * getter of the next cell  
     *  
     */
    public Cell getNext() {
        return this.next;
    }
}
