
/**
 * Compare the height of two values
 * @author Tafita Rakotozandry 
 * @date 8/17/20
 */
import​ java.util.Scanner;
public class HeightComparison {
    //main code 
    public static void main(String[] args) {
        HeightComparison comparison= new HeightComparison(); 
        comparison.run(); 
    }
    /**
     * Height Comparison Constructor 
     */
    public HeightComparison(){}

    /**
     * Run Method 
     * Run the overall comparison program 
     */
    public void run(){
        int num_calc,feet1,feet2;
        float inche1,inche2;
        boolean result;
        String operation;

        System.out.print("number of calculations: ");
        Scanner reader = new Scanner(System.in);
        num_calc = reader.nextInt();

        //looping through calculation 
        for (int i = 0; i < num_calc; i++) {
            System.out.print("First number: ");
            feet1 = reader.nextInt();
            System.out.print("Second number: ");
            inche1 = reader.nextFloat();

            System.out.print("Enter operation: ");
            operation = reader.next();

            System.out.print("Third number: ");
            feet2 = reader.nextInt();
            System.out.print ("Fourth number: ");
            inche2 = reader.nextFloat();

            // Comparison Explanation 
            // Example: operator is equal to "gt"
            //compare the feet number no1 and no2
            //if the feet no 1 greater than feet no 2, the result is true 
            //otherwise compare the inche no 1 and inche no 2
            // if inche no 1 is greater than inche no 2, the result is true 
            // otherwise, the result is false
            // the same principle applies to the rest of the operator 

            if (operation.equals("gt")) {

                if(feet1>feet2){result= true;}
                else if(feet1<feet2){result=false;}
                else{
                    if(inche1>inche2){result=true;}
                    else{result= false;}
                }

            } 

            else if (operation.equals("gte")) {

                if(feet1>feet2){result= true;}
                else if(feet1<feet2){result= false;}
                else{
                    if(inche1>=inche2){result= true;}
                    else{result= false;}
                }

            }

            else if (operation.equals("lt")) {

                if(feet1<feet2){result= true;}
                else if(feet1>feet2){result=false;}
                else{
                    if(inche1<inche2){result= true;}
                    else{result= false;}

                }
            }

            else if (operation.equals("lte")) {

                if(feet1<feet2){result= true;}
                else if(feet1>feet2){result= false;}
                else{
                    if(inche1<=inche2){result=true;}
                    else{result= false;}
                }

            } 

            else {
                // Print the error 
                System.out.println("undefined operator");
                continue;
            }
            // Print the result
            System.out.println(result);
        }
    }

}

