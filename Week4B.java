import java.util.Scanner;
import java.text.NumberFormat;

public class Week4B
{
   public static void main (String [] args)
   {
   
   int age;
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Enter an age: ");
   age = scan.nextInt();
   /*
   if (age <= 30)
      System.out.println("enjoy your youth");
   else 
      System.out.println("enjoy your death"); 
   */  
  // conditional opperator _?_:_ 
   System.out.print(age <= 30 ? "Have a drink" : "NO drink");
   }
}   