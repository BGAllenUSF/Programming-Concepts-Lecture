//pledge

import java.util.Scanner;

public class Conversion
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in);
      String response;
      int selection;
      double meters = 0;
      
      do
      {
         //Display options
         options();
      
         //get selection
         do 
         {
            System.out.println("Enter option: ");
            selection = scan.nextInt();
         }  while (selection < 1 || selection > 3);
         
         //get distance in meters
         do
         {
            System.out.println("Enter distance in meters: ");
            meters = scan.nextDouble();
         }  while (meters <=0);
         
         //switch
         switch (selection)
         {
            case 1: System.out.println (meters + " meters is " + yardsconv(meters) + " yards.");
                  break;
            case 2: System.out.println (meters + " meters is " + inchconv(meters) + " inches.");
                  break;
            case 3: System.out.println (meters + " meters is " + feetconv(meters) + " feet.");
                  break;                
         }         
         
         //re-run?
         System.out.println("Run the program again?");
         System.out.println("Enter yes or no");
         response = scan.next();
      
      } while (response.equalsIgnoreCase ("yes"));
   
   }//end main
   
   public static void options()
   {
      
      System.out.println("Hello! Here are your options: ");
      System.out.println("1. Convert to yards");
      System.out.println("2. Convert to inches");
      System.out.println("3. Convert to feet");
   }
   
   public static double yardsconv (double m)
   {
      return m * 1.09361;
   }
   
   public static double inchconv (double i)
   {
      return i * 39.3701;
   }
   
   public static double feetconv (double f)
   {
      return f * 3.28084;
   }


}//end class