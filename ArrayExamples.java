import java.util.Scanner;

public class ArrayExamples
{
   public static void main (String [] args)
   {
      Scanner spring = new Scanner (System.in);
      final int SIZE = 5;
      double [] scores = new double [SIZE];
      
      scores[0] = 98;
      scores[4] = 96.5;
      
      for (int index = 0; index < SIZE; index++)
          scores [index] = 0;
          
      for (int i = 0; i < scores.length; i++)
      {
         System.out.println ("Enter scores: ");
         scores[i] = spring.nextDouble();
      }
      
      for (int index = 0; index < SIZE; index++)
          System.out.println(scores [index]);
      
      //for each loop    
      for (double var : scores)
          System.out.println(var);
          
      //initializer list
      char [] grades = {'A','B','C','D','F'};
      
      //2D array
      final int ROWS = 10, COLS = 7;
      
       double [][] table = new double [ROWS] [COLS];
       table [0] [0] = 90;
       
       for (int r = 0; r < ROWS; r++)
           for (int c = 0; c < COLS; c++)
               table [r][c] = 0;
       
       System.out.println ("The average of scores is " + average(scores));          
   }
   
   public static double average (double [] array)
   {
      double sum = 0;
      for (int i = 0; i < array.length; i++)
          sum += array[i];
          return sum / array.length;

   }

}