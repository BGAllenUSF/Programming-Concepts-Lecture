//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;

public class DrivingCost
{
   public static void main(String[] args)
   {
  //Initialize scanner
  Scanner scan = new Scanner (System.in);
  
  //Initialize Variables
  double distance, mpg, ppg, cod;
  
  //Prompt user for input
   System.out.println ("Enter ditance of drive: ");
   distance = scan.nextDouble ();
   
   System.out.println ("Enter miles per gallon: ");
   mpg = scan.nextDouble ();
   
   System.out.println ("Enter price per gallon: ");
   ppg = scan.nextDouble ();
   
   cod = (distance / mpg) * ppg;
   System.out.println ("Cost of driving: " + cod);
   }
}
   

  
  
