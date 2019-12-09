import java.util.Scanner;

public class ExceptionTest
{
   public static void main (String [] args) throws OutofRangeException
   {
      OutofRangeException invalid = new OutofRangeException
                                        ("Hey!, that's invalid.");
      Scanner scan = new Scanner (System.in);
      int num;
      System.out.println("Enter a positive integer: ");
      num = scan.nextInt();
      
      if (num < 0)
      {
         throw invalid;
      }  
      System.out.println("Number Wrong" + num);
      
   }
   
}                                                                         