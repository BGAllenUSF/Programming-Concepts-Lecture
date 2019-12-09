//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.*;
import java.text.NumberFormat;

public class Eggs
{

   public static void main(String[] args)
   {
   int AmtEggs, dozen = 12, AmtDzn, IndEggs; 
   final double CstDzn = 3.25, CstInd = 0.45; 
   double FinalDzn, FinalInd, TtlCst;
  
   //Import and initialize scanner
   Scanner scan = new Scanner (System.in);
   //Import and creat format
   NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
   
   //Prompt user for input
   System.out.println ("How many eggs would you like to purchase? ");
   AmtEggs = scan.nextInt();
   
   //Math
   IndEggs = AmtEggs % dozen;
   
   AmtDzn = AmtEggs / dozen;
   
   FinalDzn = AmtDzn * CstDzn;
   
   FinalInd = IndEggs * CstInd;
   
   TtlCst = FinalDzn + FinalInd;
   
   //Output
   System.out.println("Cost of " + AmtDzn + " eggs (@ 3.25 per dozen): " + fmt1.format(FinalDzn));
   System.out.println("Cost of " + IndEggs + " eggs (@ 0.45 per egg): " + fmt1.format(FinalInd));
   System.out.println("Total Cost: " + fmt1.format(TtlCst));
   
   }
}   
   
   
   