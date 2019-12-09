//Week 3

import java.util.Scanner; //include or import scanner class

public class Week3
{
   public static void main (String [] args)
   {
   //Creat scanner obj
   Scanner scan = new Scanner (System.in);
   int num1;
   int num2;
   double value;
   double val = 86.7;
   String name, extra;
      
   //Prompt & input
   
   System.out.print ("Enter an integer: ");
   num1 = scan.nextInt ();
   System.out.print ("Enter an another integer: ");
   num2 = scan.nextInt ();
   
   System.out.print ("Enter a double: ");
   value = scan.nextDouble ();
   
   System.out.print ("Enter a name: ");
   extra = scan.nextLine ();
   name = scan.nextLine ();
   int sum = num1 + num2;

   System.out.println ("The sum is " + sum);
   System.out.println ("The double entered is: " + value);  
   System.out.println ("Name entered: " + name);
   System.out.println ((int)val);
    }
}