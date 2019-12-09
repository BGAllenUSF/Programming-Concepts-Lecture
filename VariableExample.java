public class VariableExample
{
   public static void main (String [] args)
   {
         //declare a variable
      int students = 70;   //CHAIRS = 100;
         //int CHAIRS = 100;
      final int CHAIRS = 100;    //final modifier defines value and cannot be changed
         //store a value (asignment statement)
         //students = 70;
      
         //check the value in variable
      System.out.println("The number of students and CHAIRS " + students + " and " + CHAIRS);
      System.out.println(students + CHAIRS);  //no strings + becomes adition
      System.out.println("The number of students and CHAIRS " + students + CHAIRS);
      System.out.println(students + CHAIRS + " is the number of students and CHAIRS.");
      System.out.println("The total number of students and CHAIRS is " + (students + CHAIRS));

   }
}  
/*
8 Data types in java 

4 Represent integers: 
-byte(8 bits),short(16 bits),int(32 bits),long(64 bits)

2 represent floating point numbers
-float(32 bits), double(64 bits)

1 represents char:
-char

1 represents boolean values:
-boolean
*/


