//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148
import java.util.Scanner;

public class sphereDriver
{  
   public static void main (String [] args)
   {  
      Scanner scan = new Scanner (System.in);
      
      Sphere sphere1 = new Sphere ();       
      Sphere sphere2 = new Sphere (4.56, 397.1761, 261.3001);
      
      System.out.println("Here is the initial information about the two Spheres: ");
      System.out.println(sphere1);
      System.out.println(sphere2);
      
      System.out.print("Enter radius as a double: ");
      double r = scan.nextDouble();
      sphere1.radUpd(r);
      sphere1.sphereV(r);
      sphere1.sphereA(r);
      System.out.println("Here is the final information about the two Spheres: ");
      System.out.println(sphere1);
      System.out.println(sphere2);

      
   }
   
}
      