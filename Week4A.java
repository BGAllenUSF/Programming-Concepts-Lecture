import java.util.Scanner;
import java.text.NumberFormat;

public class Week4A
{
   public static void main (String [] args)
   {
   final double TAX = 0.07;
   
   Scanner salt = new Scanner(System.in);
   NumberFormat cat = NumberFormat.getCurrencyInstance();
   NumberFormat noname = NumberFormat.getPercentInstance();
   
   System.out.print ("Enter quantity: ");
   int quantity = salt.nextInt();
   
   System.out.print ("Enter unit price: ");
   double unitPrice = salt.nextDouble();
   
   double subtotal, tax, total;
   
   subtotal = quantity * unitPrice;
   tax = subtotal * TAX;
   total = subtotal + tax;
   
   System.out.println ("Subtotal: " + cat.format(subtotal));
   System.out.println ("Tax: " + cat.format(tax));
   System.out.println ("Total: " + cat.format(total));
   
   /*
   Logical 
   && and
   || or
   ^ xor
   ! not
   
   Relational
   >=
   <=
   == equal
   != not equal
   */
   
   }
}   