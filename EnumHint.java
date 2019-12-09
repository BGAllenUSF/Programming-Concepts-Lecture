import java.util.Scanner;

public class EnumHint
{
   enum Seasons {Spring, Summer, Fall, Winter}
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in);
      
      int number;
      Seasons semester;
      System.out.print ("Enter a number: ");
      number = scan.nextInt();
      semester = returnSeason(number);
      
      //enum in a switch
      switch(semester)
      {
         case Spring: System.out.println("It's supposed to be Spring");
               break;
         case Summer: System.out.println("It's supposed to be Summer");
               break;
         case Fall: System.out.println("It's supposed to be Fall");
               break;
         case Winter: System.out.println("It's supposed to be Winter");
               break;
      }
      
      System.out.println(semester);
   
   }
   
   public static Seasons returnSeason (int n)
   {
      Seasons s = Seasons.Winter;
      switch (n)
      {
      case 1: s = Seasons.Spring;
            break;
      case 2: s = Seasons.Summer;
            break;
      case 3: s = Seasons.Fall;
            break;
      case 4: s = Seasons.Winter;
            break;
      }
      return s;
   }
   
}