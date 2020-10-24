
/**
 * Read Text File 
 * This program reads a text.txt file and counts the number of words and letters in the file
 * @author Tafita Rakotozandry
 * @version1
 */
import java.util.Scanner;
import java.io.FileReader;

public class TextReading
{

    //main program 
    public static void main(String[] args){
        TextReading​ demo=  new TextReading();
        demo.run();
    }

    /**
     * Constructor for objects of class TextReading
     */
    public TextReading()
    {

    }

    /**
     * Run Method 
     * Runs the entire program  
     */
    public void run()
    {
        Scanner sc=null;
        try{
            //create a new scanner object 
            sc=new Scanner(new FileReader("text.txt")); 

            //continue looping as long as there is next 
            while​(sc.hasNext())
            {
                //read the line 
                String line= sc.nextLine ();
                //array split using space
                String[] arr=line.split(" "); 
                // the number of the word is the same of the length of the array
                int num_word=arr.length;
                //number of the letter is obtained using the sum of the length of each individual words
                int num_letter=0; 

                //loop the number of word 
                for(int i=0; i<num_word;i++){
                    int letter_size=arr[i].length(); 
                    num_letter=num_letter+letter_size; 
                }
                String last_word=arr[num_word-1];
                //Print out each respective output
                System.out.print("Words: "); 
                System.out.print(num_word); 
                System.out.print(" Letters: "); 
                System.out.print(num_letter); 
                System.out.print(" Last: "); 
                System.out.print(last_word); 
                System.out.println("");

            }

        }
        //Print error in case of error 
        catch​ (Exception​ e)
        { System.out.println(e);}
    }

}