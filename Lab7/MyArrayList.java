import java.util.*; 
/**
 * Contains stable and unstable quickSort
 *
 * @author Tafita Rakotozandry 
 * @version (a version number or a date)
 */
public class MyArrayList extends ArrayList <Pair<Integer,Integer>>
{
    // instance variables - replace the example below with your own



    /**
     * Constructor for objects of class MyArrayList
     * 
     */
    public MyArrayList()
    {

    }

    /**
     * Returns String 
     *
     */
    public String toString()
    {
        String output = "";

        for (int i = 0; i < this.size(); i++) {
            output += this.get(i).key + ":" + this.get(i).value + "\n";
        }

        return output;
    }

    /**
     * Compare two pairs 
     * 
     */
    public int compareTo(ArrayList<Pair<Integer, Integer>> p1, ArrayList<Pair<Integer, Integer>> p2) {
        for (int i = 0; i < p1.size(); i++) {
            if( p1.get(i).compareTo(p2.get(i)) != 0) {
                return 1;
            }
        }
        return 0;
    }

    /**
     * QuickSort the element
     *
     * @param  a ArrayList pair 
     */
    public static void quicksort( ArrayList<Pair<Integer, Integer>> a ) 
    { 
        quicksort( a, 0, a.size()-1 ); //call quickSort  
    } 

    /**
     * Swap References
     *
     * @param  a ArrayList pair 
     * @param index1 1st index
     * param index2 2nd index
     */
    private static <T extends Comparable<? super T>> void swapReferences( ArrayList<Pair<Integer, Integer>> a, int index1, int index2 ){

        Pair tmp = a.get(index1); //save element in index1 to temp 
        a.set(index1,a.get(index2));//set element in index2 to index1 
        a.set(index2, tmp);//set index2 to temp
    }

    /**
     * Internal insertion sort routine for subarrays that is used by quicksort.
     *
     *@param a an array of Comparable items.
     * @param low the left-most index of the subarray.
     * @param high the right-most index of the subarray.
     */
    private static void insertionSort( ArrayList<Pair<Integer, Integer>> a, int low, int high ) {
        for( int p = low + 1; p <= high; p++ ) {
            Pair tmp = a.get( p ); //set element of p to tmp 
            int j;
            //swap
            for( j = p; j > low && tmp.compareTo( a.get( j - 1 ) ) < 0; j-- ) a.set( j,a.get( j - 1 ));
            a.set (j,tmp);
        }
    }

    /**
     * QuickSort drawn from the book 
     *
     *@param a an array of Comparable items.
     * @param low the left-most index of the subarray.
     * @param high the right-most index of the subarray.
     */
    private static <T extends Comparable<? super T>> void quicksort( ArrayList<Pair<Integer, Integer>> a, int low, int high ) 
    { 
        int CUTOFF=3;
        if( low + CUTOFF > high )
            insertionSort( a, low, high );
        else {

            int middle = ( low + high )/2;
            if( a.get( middle ).compareTo( a.get( low) ) < 0 )
                swapReferences( a, low, middle );
            if( a.get( high ).compareTo( a.get(low ) ) < 0 ) 
                swapReferences( a, low, high ); 
            if( a.get( high ).compareTo( a.get( middle ) ) < 0 )
                swapReferences( a, middle, high );
            swapReferences( a, middle, high-1 ); 
            Pair pivot = a.get(high-1); 
            // Begin partitioning 
            int i, j; 
            for( i = low, j = high-1; ; )
            { 
                while( a.get( ++i ).compareTo( pivot ) < 0 );

                while( pivot.compareTo( a.get(--j ) ) < 0 );
                if( i >= j )
                    break;
                swapReferences( a, i, j );
            }
            // Restore pivot 
            swapReferences( a, i, high-1 ); 
            quicksort( a, low, i-1 ); // Sort small elements 
            quicksort( a, i + 1, high ); // Sort large elements 
        }
    } 

    /**
     * Recursively calls quicksort and sorts the ArrayList using partitioning but breaks all the ties using key values
     *  @param a an array of Pairs
     * @param low int
     * @param high int
     */
    public static ArrayList stableQuickSort(ArrayList<Pair<Integer, Integer>> a) {
        ArrayList <Pair<Integer, Integer>> atemporary = new ArrayList <Pair<Integer, Integer>> (); //temp 
        for (int i = 0; i < a.size(); i++) {
            atemporary.add(i, a.get(i)); //add temporary 
        }
        quicksort(atemporary); //quicksort temporary 
        sortByKey(atemporary); //sort by key to break the tie 
        for (int j = 0; j < atemporary.size(); j++) {
            a.set(j, atemporary.get(j)); //re add the element to a 
        }
        return a; //return the arrayList 
    }

    /**
     * Sorts pairs by key if they are the same 
     * 
     * @param a  array of Pairs 
     */
    public static void sortByKey(ArrayList <Pair<Integer, Integer>> a) {
        int pass = 1; 
        boolean swap; 

        do {
            swap = false; //swap 

            for (int i = 0; i < a.size() - pass; i++) {

                if (a.get(i).getValue().compareTo(a.get(i+1).getValue()) == 0) { //if the value are similar 

                    if (a.get(i).getKey().compareTo(a.get(i+1).getKey()) >0) { //compares the keys
                        //swapping elements 
                        Pair tmp = a.get(i);  
                        a.set(i, a.get(i+1)); 
                        a.set(i+1, tmp);
                        swap = true;
                    }
                }
            }

            pass++;

        } while (swap); 
    }

    /**
     * Searches for the given value using the binary search method and returns the pair where it is found
     *
     *@param a ArrayList<Pair>
     * @param searchValue int
     */
    public Pair binarySearch(ArrayList <Pair<Integer,Integer>> a, int searchValue) {
        stableQuickSort(a);
        int lower = 0;
        int upper = a.size();
        boolean found = false;

        while (!found) {
            //find the mid point 
            //compare if the value is less or bigger than the midpoint 
            //if less, go to the left 
            //else go to the right 
            //repeate the sme process over and over

            if (lower >= upper) {
                return null;
            }
            int midpoint = lower + (upper - lower)/2;
            if (a.get(midpoint).getValue().compareTo(searchValue) < 0) {
                lower = midpoint - 1;
            }

            if (a.get(midpoint).getValue().compareTo(searchValue) > 0) {
                upper = midpoint + 1;
            }

            if (a.get(midpoint).getValue().compareTo(searchValue) == 0) {
                return a.get(midpoint);
            }
        }
        return null;
    }
}
