//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;

public class SequenceMenu
{
   enum options {Triangular, Tetrahedral, Lazy, Fibonacci}
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in);
      int selection, selection2;
      options method;
      String response;    
   
      menu();
      do
      {
      do 
      {
         System.out.println("Select an option (1-4): ");
         selection = scan.nextInt();
      }  while (selection < 1 || selection > 4);
      
      method = returnoption(selection);
      
      System.out.println ("You have selected " + method);
      
      do 
      {
         System.out.println("How many values would you like to print (>1) : ");
         selection2 = scan.nextInt();
      }  while (selection2 < 1);

      
      switch(method)
      {
         case Triangular: tri(selection2);
              break;
         case Tetrahedral: tet(selection2);
              break;
         case Lazy: lazy(selection2);
              break;
         case Fibonacci: fib(selection2);
              break;
      }
      
      
      System.out.println();
      System.out.println("Run the program again?");
      System.out.println("Enter yes or no");
      response = scan.next();
      
      } while (response.equalsIgnoreCase ("yes"));
     
          
   }
   
      public static options returnoption (int n)
      {
      options s = options.Lazy;
      switch (n)
      {
         case 1: s = options.Triangular;
            break;
         case 2: s = options.Tetrahedral;
            break;
         case 3: s = options.Lazy;
            break;
         case 4: s = options.Fibonacci;
            break;
      }
      return s;
      }
      
   public static void menu()
   {      
      System.out.println("Hello! Here are your options: ");
      System.out.println("1. Triangular");
      System.out.println("2. Tetrahedral");
      System.out.println("3. Lazy ");
      System.out.println("4. Fibonacci");
   }
   
   public static void tri (int n)
   {
      int output;
      for (int i = 1; i <= n; i++)
      {
      output = (i * ( i + 1)) / 2;
      System.out.print (output + " ");
      }
   }
   
   public static void tet (int n)
   {
      int output;
      for (int i = 1; i <= n; i++)
      {
      output = (i * ( i + 1) * (i + 2) / 6);
      System.out.print (output + " ");
      }
   }
   
  public static void lazy (int n)
   {
      int output;
      for (int i = 0; i < n; i++)
      {
      output = ((i * i) + i + 2) / 2;
      System.out.print (output + " ");
      }
   }
   
   public static void fib (int n)
   {
      int output;
      int k = 0;
      int j = 1;
      System.out.print ("0 1 ");
      for (int i = 0; i < (n - 2); i++)
      {
      output = k + j;
      System.out.print (output + " ");
      k = j;
      j = output;
      }
   }  

}