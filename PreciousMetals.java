import java.text.NumberFormat;


public class PreciousMetals 
{    
   private String metalName, symbol;    
   private double pricePerOunce, troyOunces;        
   
   //constructor    
   public PreciousMetals(String mname, double amt)    
   {       
      metalName = mname;       
      troyOunces = amt;       
      setSymbol();       
      setPrice();    
   }        
   
   private void setSymbol()    
   {       
      switch (metalName.toLowerCase())       
      {          
         case "platinum": symbol = "Pt";  break;          
         case "palladium": symbol = "Pd";  break;          
         case "rhodium": symbol = "Rh";  break;          
         case "iridium": symbol = "Ir";  break;          
         case "ruthenium": symbol = "Ru";  break;          
         case "osmium": symbol = "Os";  break;          
         case "rhenium": symbol = "Pt";  break;          
         case "gold": symbol = "Au";  break;          
         case "silver": symbol = "Ag";  break;          
         default: symbol = "Not precious metal";        
       }    
    } 
 
   private void setPrice()    
   {       
      switch (metalName.toLowerCase())       
      {          
         case "platinum": pricePerOunce = 844;  break;          
         case "palladium": pricePerOunce = 1150;  break;          
         case "rhodium": pricePerOunce = 2590;  break;          
         case "iridium": pricePerOunce = 1485;  break;          
         case "ruthenium": pricePerOunce = 270;  break;          
         case "osmium": pricePerOunce = 400;  break;          
         case "rhenium": pricePerOunce = 107.5;  break;          
         case "gold": pricePerOunce = 1227.73;  break;          
         case "silver": pricePerOunce = 14.33;  break;          
         default: pricePerOunce = 0;        
      }        
   } 
 
   private double calcCost()    
   { 
      return troyOunces * pricePerOunce;    
   } 
 
 
   public String toString()    
   {       
      NumberFormat fmt = NumberFormat.getCurrencyInstance();               
      String summary = metalName + " (" + symbol + ") @ " +                        
      fmt.format(pricePerOunce);         
      summary += " per ounce:\tCost of " + troyOunces + " ounces = " + fmt.format(calcCost());              
      return summary;    
   } 
} 
 
 
 
 
 