public class Student2
{
   private int studentNumber;
   private double gpa;
   
   public Student2 (int studentNumber, double gpa)
   {
      this.studentNumber = studentNumber;
      this.gpa = gpa;
   }
   
   public Student2 (int sn)
   {
      studentNumber = sn;
      gpa = 0.0;
   }
   
   public Student2 ()
   {
      studentNumber = 999;
      gpa = 0.0;
   }
   
   public Student2 (double avg)
   {
      this (999, avg);
   }
   public double getGPA()
   {
      return this.gpa;
   }
}   