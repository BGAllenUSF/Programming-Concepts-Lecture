//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;

public class TicketValidation
{

   public static void main (String [] args)
   {
   //Declare seconds, hours and minutes and a conversion rate between them
   int tiknum,NewTik,LastNum,Remainder;
   
   //Import and initialize scanner
   Scanner scan = new Scanner (System.in);
      
   //Prompt user for input
   System.out.println ("Enter ticket number: ");
   tiknum = scan.nextInt ();
   
   NewTik = tiknum / 10;
   LastNum = tiknum - NewTik;
   Remainder = NewTik / 7;
   
   if (Remainder == LastNum) {
      System.out.println("Ticket number" + tiknum + "is a valid ticket");
      System.out.println(LastNum);
      System.out.println(Remainder);
   }
   else {
      System.out.println("Ticket number" + tiknum + "is not a valid ticket");
      System.out.println(LastNum);
      System.out.println(Remainder);
   }
      }
}