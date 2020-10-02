import java.util .*; 
/**
 * Write a description of class RandomIntegerContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomIntegerContainer extends RandomStuffContainer<Integer>
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class RandomIntegerContainer
     */
    public RandomIntegerContainer()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sum()
    {
        int numberSize=list.size(); 
        int sum=0; 

        for (int i=0; i<numberSize; i++){
            
                sum=sum+(list.get(i)).intValue(); 
        }
        return sum; 
    }
    

    
}
