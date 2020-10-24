import java.util.*; 
/**
 * Tests the Stable and Unstable Sorting 
 *
 * @author Tafita Rakotozandry
 * @version1
 */
public class ExperimentController
{

    private int x;
    public static void main(String[] args) {
        ArrayList<Pair<Integer, Integer>> test = new ArrayList<Pair<Integer, Integer>>();
        MyArrayList y = new MyArrayList();
        test.add(new Pair(3,4));
        test.add(new Pair(54,22));
        test.add(new Pair(432,22));
        test.add(new Pair(42,72));
        test.add(new Pair(564,2));
        test.add(new Pair(13,72));
        test.add(new Pair(745,1));
        System.out.println("Original Array   " +test);
        y.quicksort(test);
        System.out.println("Quicksort:       " +test);
        y.stableQuickSort(test);
        System.out.println("Stable Quicksort: " +test);
    }


}
