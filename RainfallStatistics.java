//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;
import java.text.DecimalFormat;

public class RainfallStatistics
{
   public static void main (String [] args)
   {
   
      Scanner spring = new Scanner (System.in);
      DecimalFormat fmt = new DecimalFormat ("0.###");

      String [] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      double [] rainfall = new double [12];
      rainfall [0] = -1;
      double sum = 0, average = 0,
             greatest = 0, least = 100;
      String greatestmonth = "", leastmonth = "";
      
      for (int i = 0; i < rainfall.length; i++)
         {  
            do 
            {
               System.out.println ("Enter rainfall for " + months[i] + ": ");
               rainfall[i] = spring.nextDouble();
            }  while (rainfall[i] < 0);
         }
    
      for (int j = 0; j < rainfall.length; j++)
      {
         sum += rainfall[j];
         average = sum / 12;
      }
      
      for (int k = 0; k < rainfall.length; k++)
      {
         if (rainfall[k] > greatest)
         {
            greatest = rainfall[k];
            greatestmonth = months[k];
         }
      }
      
      for (int i = 0; i < rainfall.length; i++)
      {
         if (rainfall[i] < least)
         {
            least = rainfall[i];
            leastmonth = months[i];
         }     
      }
       
      System.out.println ("The total rainfall for the year is: " + sum + " inches");
      System.out.println ("The average rainfall for the year is: " + fmt.format(average) + " inches");
      System.out.println ("The most rainfall for the year is: " + greatest + " in " + greatestmonth);
      System.out.println ("The least rainfall for the year is: " + least + " in " + leastmonth);

;

      
    }
}
