import java.text.NumberFormat;

public class techStocks
{
   private String comName, comLabel;    
   private double pricePerStock; 
   private int sharesToPurchase;
   
   static private double totalCost = 0;
   
   public techStocks (String cName, int StP)    
   {       
      comName = cName;       
      sharesToPurchase = StP;       
      setLabel();       
      setPrice();    
   }        

   private void setLabel()    
   {       
      switch (comName.toLowerCase())       
      {          
         case "amazon": comLabel = "AMZN";  break;          
         case "apple": comLabel = "AAPL";  break;          
         case "facebook": comLabel = "FB";  break;          
         case "gopro": comLabel = "GPRO";  break;          
         case "google": comLabel = "GOOGL";  break;          
         case "irobot": comLabel = "IRBT";  break;          
         case "microsoft": comLabel = "MSFT";  break;          
         case "netflix": comLabel = "NFLX";  break;          
         case "tesla": comLabel = "TSLA";  break;
         case "twitter": comLabel = "TWTR";  break;                 
       }    
    }
    
   private void setPrice()    
   {       
      switch (comName.toLowerCase())       
      {          
         case "amazon": pricePerStock = 1863.04;  break;          
         case "apple": pricePerStock = 199.25;  break;          
         case "facebook": pricePerStock = 178.87;  break;          
         case "gopro": pricePerStock = 6.71;  break;          
         case "google": pricePerStock = 1231.91;  break;          
         case "irobot": pricePerStock = 129.68;  break;          
         case "microsoft": pricePerStock = 120.77;  break;          
         case "netflix": pricePerStock = 359.46;  break;          
         case "tesla": pricePerStock = 273.36;  break;
         case "twitter": pricePerStock = 34.46;  break;                 
       }    
   }         
   
   private double calcCost()    
   { 
       double c = pricePerStock * sharesToPurchase;   
       totalCost += c;
       return c;
   }  
   
   public static String getTotalCost()
   {  
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
       double r =  totalCost;
       String rTotalCost =  ("Your toal cost is: " + fmt.format(r));
       return rTotalCost;
   }
   
   public String toString()    
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();  
      String description; 
      description = String.format("%-20s",comName); 
      description += String.format("%-20s",comLabel);
      description += String.format("%-20s",fmt.format(pricePerStock));
      description += String.format("%-20s",fmt.format(calcCost()));
      return description;
   }
} 