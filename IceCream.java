public class IceCream
{
   enum Flavor {vanilla, chocolate, strawberry, cookiedough, rockyroad}
   
   public static void main (String [] args)
   {
   Flavor cone;
   
   cone = Flavor.vanilla;
   
   System.out.println("Cone ordinal is " + cone.ordinal());
   
   }
}