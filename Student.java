public class Student
{
   private int studentNumber;
   private double gpa;
   
   public Student (int studentNumber, double gpa)
   {
      this.studentNumber = studentNumber;
      this.gpa = gpa;
   }
   
   public Student (double avg)
   {
      studentNumber = 999;
      gpa = avg;
   }

   public Student (int sn)
   {
      studentNumber = sn;
      gpa = 0.0;
   }
   
   public Student ()
   {
      studentNumber = 999;
      gpa = 0.0;
   }
   
   public double getGPA()
   {
      return this.gpa;
   }
}   