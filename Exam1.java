//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;

public class Exam1
{
   public static void main (String [] args)
   {
   double r1, r2, x1, x2, y1, y2, w1, w2, h1, h2;
   
   Scanner scan = new Scanner (System.in);
   
   System.out.println ("Enter X Coordinate for the Center of Rectangle 1: ");
   x1 = scan.nextDouble ();
   System.out.println ("Enter Y Coordinate for the Center of Rectangle 1: ");
   y1 = scan.nextDouble ();
   
   System.out.println ("Now Enter X Coordinate for the Center of Rectangle 2: ");
   x2 = scan.nextDouble ();
   System.out.println ("And Enter Y Coordinate for the Center of Rectangle 2: ");
   y2 = scan.nextDouble ();
   
   System.out.println ("Now Enter The Width of Rectangle 1: ");
   w1 = scan.nextDouble ();
   System.out.println ("And Enter The Height of Rectangle 1: ");
   h1 = scan.nextDouble ();
   
   System.out.println ("Now Enter The Width of Rectangle 2: ");
   w2 = scan.nextDouble ();
   System.out.println ("And Enter The Height of Rectangle 2: ");
   h2 = scan.nextDouble ();
   
   System.out.println ("The Cordinates of the Center of Rectangle 1 is (" + x1 + ", " + y1 + ")");
   System.out.println ("The Width of Rectangle 1 is: " + w1 + " units");
   System.out.println ("The Height of Rectangle 1 is: " + h1 + " units");
   
   System.out.println ("The Cordinates of the Center of Rectangle 2 is (" + x2 + ", " + y2 + ")");
   System.out.println ("The Width of Rectangle 2 is: " + w2 + " units");
   System.out.println ("The Height of Rectangle 2 is: " + h2 + " units");
   
   if (Math.abs(x1 - x2) <= ((w1 - w2) / 2) && Math.abs(y1 - y2) <= ((h1 - h2) / 2) ){
   System.out.println ("Rectangle 2 is inside Rectangle 1");}

   else if (Math.abs(x1 - x2) <= ((w1 + w2) / 2) && Math.abs(y1 - y2) <= ((h1 + h2) / 2) ){
   System.out.println ("Rectangle 2 Overlaps Rectangle 1");}
   
   else {
   System.out.println ("Rectangle 2 does not Overlaps Rectangle 1");}
      


   }
}