//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;

public class GreaterthantehLimit
{
   public static void main (String [] args)
   {
   
   Scanner spring = new Scanner (System.in);
   
   int [] tot = new int [10];
   
   for (int i = 0; i < tot.length; i++)
   {
      System.out.println ("Enter Integer: ");
      tot[i] = spring.nextInt();
   }

   System.out.println ("Enter Limit: ");
   int lim = spring.nextInt();

   limtest(tot, lim);
   
   System.out.println ("are greater than the limit: " + lim);   
   }
   
   public static void limtest (int [] intArray, int limit)
   {
      for (int i = 0; i < intArray.length; i++)
      {
         if (intArray[i] > limit)
         System.out.print (intArray[i] + ", ");
      }
   }
}