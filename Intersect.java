//Pledge

import java.util.Scanner;
import java.text.DecimalFormat;
public class  Intersect
{
      public static void main (String [] args)
      {
      double x1, x2, x3, x4, //x cord
             y1, y2, y3, y4, //y cord
             a, b, c, d, e, f, //Variables for Crmers
             x, y, //intersection point
             denom;
             
      Scanner scan = new Scanner (System.in);
      DecimalFormat fmt = new DecimalFormat ("0.##");
      
      //Get Coordinates
      System.out.print("First, enter points for line 1 \n" +
                       "(x1, y1, x2, y2): ");
                       
                       
      x1 = scan.nextDouble();
      y1= scan.nextDouble();
      x2 = scan.nextDouble();
      y2 = scan.nextDouble();
      
       System.out.print("Now, enter points for line 1 \n" +
                       "(x3, y3, x4, y4): ");
                       
                       
      x3 = scan.nextDouble();
      y3 = scan.nextDouble();
      x4 = scan.nextDouble();
      y4 = scan.nextDouble();
      
      //calc cramer values
      a = y1 - y2;
      b = -(x1 - x2);
      c = y3 - y4;
      d = -(x3 - x4);
      e = (y1 - y2) * x1 - (x1 - x2) * y1;
      f = (y3 - y4) * x3 - (x3 - x4) * y3;

      //Output point in cord form
      System.out.println("Line 1 points: (" + x1 + ", " + y1 + ") and (" + x2 +", " + y2 + ")");
      System.out.println("Line 1 points: (" + x3 + ", " + y3 + ") and (" + x4 +", " + y4 + ")");
      
      //Output equation of line 
      System.out.println("Line 1 equation is " + fmt.format(a) + "x + " + fmt.format(b) + "y= " + fmt.format(e)); 
      System.out.println("Line 2 equation is " + fmt.format(c) + "x + " + fmt.format(d) + "y= " + fmt.format(f));  
      
      denom = a * b - b * c;
      if (denom == 0)
         System.out.println("The lines are parallel.");
      else
      {
      x = (e * d - b * f)/denom;
      y = (a * f - e * c)/denom;
      System.out.println("The intersecting point is at (" + fmt.format(x) + ", " + fmt.format(y) + ")");}
      
      }
}      