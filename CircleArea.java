import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleArea
{
   public static void main (String [] args)
   {
   Scanner scan = new Scanner (System.in);
   DecimalFormat f = new DecimalFormat ("0.###");
   
   double r, a;
   
   System.out.print ("Enter radius: ");
   r = scan.nextDouble();
   
   a = Math.pow(r, 2) * Math.PI;
   
   System.out.println ("Area is: " + f.format(a));
   }
}   