//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.*;
import java.text.DecimalFormat;

public class PentArea
{

   public static void main(String[] args)
   {
   
   double r, s, a;
  
   //Caculate Sin Pi/5 and assign variable
   final double Sin_PiByFive = Math.sin((Math.PI/5));
   final double Tan_PiByFive = Math.tan((Math.PI/5));
   //Create decimal format
   DecimalFormat fmt = new DecimalFormat ("0.####");

   
   //Import and initialize scanner
   Scanner scan = new Scanner (System.in);
   
   //Prompt user for input
   System.out.println ("Enter the length from center to vertex (i.e. r): ");
   r = scan.nextDouble ();
   
   //Caculate s and print
   s = (2 * r) * Sin_PiByFive;
   
   System.out.println("The length of a side of the Pentagon is: " + fmt.format(s) + " units.");
   
   a = (5 * Math.pow(s, 2)) / (4 * Tan_PiByFive);
   
   System.out.println("The area of the Pentagon is: " + fmt.format(a) + " units squared.");
   }
}   
   
   
   