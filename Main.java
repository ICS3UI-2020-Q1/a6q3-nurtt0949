import java.util.Scanner;
/**
 *Finds users greatest number
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //ask user for integers
    System.out.println("Please enter in 10 integers to put into the array");

    //declare a constant
    final int USER_INTEGER = 10;

    //create array with 10 spots
    int[] number = new int[USER_INTEGER];
    
    //put integers into array into for loop
    for(int i = 0; i < number.length; i++){
      number[i] = input.nextInt();
      }
    //declare a variable for the largest number
    int largeNum = 0;
    
    //use for loop to go through array
     for(int i = 0; i < number.length; i++){
       if(number[i] > largeNum){
         largeNum = number[i];  
         }
     }
      //tell user their largest number
          System.out.println("The largest number is " + largeNum); 
     

     
    

  }
}
