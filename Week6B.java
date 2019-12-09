import java.util.Scanner;
public class Week6B
{
   public static void main (String [] sleepy)
   {
   int x = 1;
   
   //pretest loop
   while (x <= 10)
   {
   System.out.println(x);
   x++;   
   }
   
   //for loop
   for (x = 1; x <= 10; x++){
      System.out.println(x);
      }
   
   //do while loop -post test loop
   do
   {
   System.out.println(x);
   x++;   
   }while (x <= 10);
   
   int y = 0;
   //Nested Loop
   for (int j = 1; j < 10; j++)
      for (int k = 20; k > 10; k--)
         y++;
   System.out.println(y);
   

   
   
   }
}