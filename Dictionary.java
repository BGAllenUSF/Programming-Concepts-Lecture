//child class
public class Dictionary extends Book
{
   protected int definitions = 52500;
   
   public void setDef (int numDef)
   {
      definitions = numDef;
   }
   
   public int getDef()
   {
      return definitions;
   }
   
   public double computerRatio()
   {
      return (double) definitions/pages;
   }
}