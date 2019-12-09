   /*
   Problem: finding the running sum of values within the ranges:
   
   1 to 10, 10 to 20, 30 to 45
   */
   
import java.util.Scanner;
public class Week7A{
   public static void main (String[] args) {
   
      Scanner scan = new Scanner (System.in);
      int start, end;
      
      System.out.println("Enter starting and ending values: ");
      start = scan.nextInt ();
      end = scan.nextInt (); 
      
      System.out.println("The sum of values from start to end is " + runningSum(start, end));    
   }
   
   public static int runningSum (int n1, int n2) {
      
      int total = 0; //accumulator
      for (int i = n1; i <= n2; i++)
         total += i;
         
      return total; 
   }
}

//median * nFinal - nMedian + median * nMedian - nInitial