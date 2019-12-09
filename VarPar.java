import java.util.Scanner;

class VarPar
{
   public static void main (String [] args)
   {
   Scanner scan = new Scanner (System.in);
   int num;
   
   System.out.print ("How many numbers? ");
   num = scan.nextInt();
   
   double [] array = new double [num];
   
   for (int i = 0; i < num; i++)
   {
      System.out.print("Enter #" + (i + 1) + ":");
      array[i] = scan.nextDouble();
   }

      //System.out.println (average (1, 2, 3, 4));
      //System.out.println(average (156, 342, 453, 6664.77, 69.69, 89.122222));
   }
   
   public static double average ( double ... list)
   {
      double result = 0.0;
      if (list.length != 0)
      {
         double sum = 0;
         for (double num: list)
         sum += num;
         result = sum / list.length;
      }
      return result;
   }
   
}