
/**
 * Integer linked list ADT
 *
 * @author Tafita Rakotozandry
 * @version 1
 */
public class IntegerList extends IntegerListADT
{
    // instance variables - replace the example below with your own
    private Cell root; 

    /**
     * Constructor for objects of class IntegerList
     */
    public IntegerList()
    {

    }

    /**
     * inserts x at the end of the list  
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public void append(Integer x)
    {
        // put your code here
        if(root==null){root=new Cell(x);}
        else{root.append(x);

        }
    }

    /**
     * returns a String that is stored in this list   
     * 
     *@param numberOfItems number of items to insert 
     *@param seed seed number of the random generator 
     */
    public String toString()
    {
        String txt="";
        if (root ==null){txt="";}
        else{txt=root.toString();}
        return txt; 

    }

    /**
     * returns true if the list is empty   
     *  
     */
    public boolean isEmpty()
    {
        return root==null;

    }

    /**
     * returns the root value  
     *  
     */
    public Cell getRoot() {
        return this.root;
    }

}
