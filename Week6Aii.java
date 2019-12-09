import java.util.Scanner;
public class Week6Aii
{
   public static void main (String [] sleepy)
   {
      int score, category;
      Scanner obj = new Scanner (System.in);
      System.out.print("Enter a score: ");
      score = obj.nextInt();
      category = score / 10;
            
      switch (category)
      {
      case 10: System.out.println("Perfect!");
      break;
      case 9: System.out.println("good");
      break;
      case 8: System.out.println("nice");
      break;
      default: System.out.println("DOOD");
      break;
      }
      
      }
   }