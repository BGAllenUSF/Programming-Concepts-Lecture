//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

public class Stocks
{

   public static void main(String[] args)
   {
   //Curent Price of Oracle Stock: 48.96 as of Jan 22 2:09pm

   //Declaring some vatriables to user
   System.out.println("Number of shares purchased: 750\n"
                    + "Current share price: $48.96\n"
                    + "Current Commission: 2.5%\n" );

   //Declare some doubles to make multplication easier
   final double amount_shares = 750.0, commission_pct = 0.025, STOCK_PRICE = 48.96;
   double stock_total, commission, total_cost;
   
   //Declare Value of Oracle Stock and print
   System.out.println ("The current value of Oracle stock is: $" + STOCK_PRICE);
   System.out.println();
   
   //Calculate amount paid for 750 shares at 48.96 and print
   stock_total = STOCK_PRICE * amount_shares;
   System.out.println ("The cost of 750 shares is: $" + stock_total);
   System.out.println();
  
   //Calculate Commssion and print
   commission = stock_total * commission_pct;
   System.out.println ("A 2.5% commission on 750 shares is: $" + commission);
   System.out.println();
   
   //Calculate Commmission + Cost of 750 shares 
   total_cost = commission + stock_total;
   System.out.println("The total cost including commission is: $" + total_cost);
   
   }
}