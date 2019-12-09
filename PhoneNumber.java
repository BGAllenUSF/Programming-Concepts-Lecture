//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Random;

public class PhoneNumber
{

   public static void main(String[] args)
   {
   int num1, num2, num3, num4, num5;
   //Create RNG
   Random generator = new Random();
   
   num1 = generator.nextInt(8);
   num2 = generator.nextInt(8);
   num3 = generator.nextInt(8);
   num4 = generator.nextInt(556) + 100;
   num5 = generator.nextInt(8999) + 1000;
    
   System.out.println ("Phone Nummber: " + num1 + num2 + num3 + "-" + num4 + "-" + num5);
   }
}   