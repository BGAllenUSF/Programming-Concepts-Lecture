//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;

public class TicketValidation
{

   public static void main (String [] args)
   {
   //Declare seconds, hours and minutes and a conversion rate between them
   int TikNum,NewTik,LastNum,Remainder;
   
   //Import and initialize scanner
   Scanner scan = new Scanner (System.in);
      
   //Prompt user for input
   System.out.println ("Enter ticket number: ");
   TikNum = scan.nextInt ();
   
   NewTik = TikNum / 10;
   LastNum = TikNum - (NewTik * 10);
   Remainder = NewTik % 7;
   
   /*
   System.out.println(Remainder);
   System.out.println(LastNum);
   System.out.println(NewTik);
   System.out.println(TikNum);
   */
  
   if (Remainder == LastNum) {
      System.out.println("Ticket number " + TikNum + " is a valid ticket");
      System.out.println("Last Digit: " + LastNum);
      System.out.println("Remainder: " + Remainder);
   
   }
   else {
      System.out.println("Ticket number " + TikNum + " is not a valid ticket");
      System.out.println("Last Digit: " + LastNum);
      System.out.println("Remainder: " + Remainder);
   }



      }
}