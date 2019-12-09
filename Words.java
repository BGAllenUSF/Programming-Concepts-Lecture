class Words
{
   public static void main (String [] args)
   {
      Dictionary webster = new Dictionary ();
      
      System.out.println("Number of pages: " + webster.getPages());
      
      System.out.println("Definitions per  page: " + webster.computerRatio());
      
   }
   
}

