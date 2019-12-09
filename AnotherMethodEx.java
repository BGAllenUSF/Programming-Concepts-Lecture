public class AnotherMethodEx
{
   final static int y = 7; //global constant 
   public static void main (String [] args)
   {
      int x = 5;
      int y = 43;
      System.out.println("x is: " + x);
      System.out.println("y is: " + y);
      method1(x);
      System.out.println("x is: " + x);
   }//end main
   
   public static void method1 (int x)
   {
      x = 12;
      System.out.println("x is: " + x);
      System.out.println("y is: " + y);
   }//endmethod1
}//endclass