public class Expressions
{
   public static void main (String [] args)
   {
      int x = 5, answer;
      double y = 5 / 2;
      
      //update statements
      
      x = x * 3; // or x += 2;
      y -= x + 5 * 2; // y = y - (x + 5 * 2);
      
      x = x + 1; //increment (addition performed first) ++x or x++ (addition performed last)
      x = x - 1; //decrement --x or x--
      
      /*
      Symbols
      + add
      - subtract
      * multiply
      / divison
      % remainder (modulus)
      
      Precedence 
      
      () ++(pre)
      * / %
      + -
      =
      (post)-- 
      */
      
      //System.out.println (" 5 / 7 is: " + (5 / 7)); This lad is truncated becuase int / int will always = int
      //System.out.println ("Y is: " + y); 5 / 5 will be expressed as 2.0 even if stored in 
      System.out.println ("7 / 3 is " + (7 / 3));
      System.out.println ("7 % 3 is " + (7 % 3));
      System.out.println ("X is:" + x);
      System.out.println ("Y is:" + y);
    }
}