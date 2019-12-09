//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.*;

public class TravellingSongs
{

   public static void main(String[] args)
   {
   int NoV = 0;
   Scanner scan = new Scanner (System.in);
   
   while (NoV > 100 || NoV < 1){
   System.out.println ("How many verses (1 to 100)? ");
   NoV = scan.nextInt();
   }
  
   for (int i = NoV; 1 <= i;i--){
      System.out.println ( i + " bottles of beer on the wall\n" +
                           i + " bottles of beer\n" +
                           "If one of those bottles should happen to fall\n" +
                           (i-1) + " bottles of beer on the wall\n" );
   }
   

   }
}
