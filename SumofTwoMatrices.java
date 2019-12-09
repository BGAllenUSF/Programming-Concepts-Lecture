//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;

public class SumofTwoMatrices
{
   public static void main (String [] args)
   {
   Scanner spring = new Scanner (System.in);
   
    final int MATRIX_ROWS = 3;
    final int MATRIX_COLUMNS = 3;
    
    double[][] m1 = new double[MATRIX_ROWS] [MATRIX_COLUMNS];
    double[][] m2 = new double[MATRIX_ROWS] [MATRIX_COLUMNS];
    double[][] m3 = new double[MATRIX_ROWS] [MATRIX_COLUMNS];
    
    for (int i = 0; i < MATRIX_ROWS; i++)
    {
      for (int j = 0; j < MATRIX_COLUMNS; j++)
      {
         System.out.println ("Enter Double for (" + (i + 1) + ", " + (j + 1) + ")" );
         m1[i][j] = spring.nextDouble();
      }
    }
    
    for (int i = 0; i < MATRIX_ROWS; i++)
    {
      for (int j = 0; j < MATRIX_COLUMNS; j++)
      {
      System.out.println ("Enter Integer for (" + (i + 1) + ", " + (j + 1) + ")" );
      m2[i][j] = spring.nextDouble();
      }
    }
    
    for (int i = 0; i < MATRIX_ROWS; i++)
    {
      for (int j = 0; j < MATRIX_COLUMNS; j++)
      {
      System.out.print (m1[i][j] + " ");
      if (j == 2)
      System.out.println();
      }
    }
    
    System.out.println ("\t  + ");
    
    for (int i = 0; i < MATRIX_ROWS; i++)
    {
      for (int j = 0; j < MATRIX_COLUMNS; j++)
      {
      System.out.print (m2[i][j] + " ");
      if (j == 2)
      System.out.println();
      }
    }
    
     
    System.out.println ("\t  = ");


    for (int i = 0; i < MATRIX_ROWS; i++)
    {
      for (int j = 0; j < MATRIX_COLUMNS; j++)
      {
      m3[i][j] = m1[i][j] + m2[i][j];
      }
    }
    
    for (int i = 0; i < MATRIX_ROWS; i++)
    {
      for (int j = 0; j < MATRIX_COLUMNS; j++)
      {
      System.out.print (m3[i][j] + " ");
      if (j == 2)
      System.out.println();
      }
    }
      
    }
}
    
         