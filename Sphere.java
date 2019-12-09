//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.text.DecimalFormat;

public class Sphere
{
   private double radius, sphereArea, sphereVolume;
   
   public Sphere (double r, double v, double a)
   {
   radius = r;
   sphereArea = a;
   sphereVolume = v;
   }
   
   public Sphere ()
   {
   radius = 0;
   sphereArea = 0;
   sphereVolume = 0;
   }
   
   public void setRad (double r)
   {
      radius = r;
   }
   
   public void radUpd (double r)
   {
      radius = r;
   }
   
   public void sphereA (double r)
   {
      sphereArea = 4 * Math.PI * Math.pow(r,2);
   }
   
   public void sphereV (double r)
   {
      sphereVolume = (4 * Math.PI * Math.pow(r,3)) / 3;
   }
   
    public String toString()
   {
      DecimalFormat f = new DecimalFormat ("0.####");
      return "Sphere radius: " + f.format(radius) + "\t\tVolume: " + f.format(sphereVolume) + "\t\tArea: " + f.format(sphereArea);
   }

}