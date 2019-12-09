import java.util.Scanner; 
import javax.swing.JOptionPane;

public class MetalDriver 
{    
   public static void main (String [] args)    
   {       
      double amtInOz;       
      String name, input;       
      int numMetals;              
      
      Scanner scan = new Scanner(System.in);              
      
      //ask user for amount of metals to check       
      do       
      {          
         input = JOptionPane.showInputDialog("How many metals are you interested in?\n Amount must be >= 1: ");
         numMetals = Integer.parseInt(input);             
      }while (numMetals < 1);           
      
      //create array of precious metal objects!       
      
      PreciousMetals [] metalArray = new PreciousMetals[numMetals];               
      
      // for loop to fill array of objects        
      for (int i = 0; i < numMetals; i++)       
      {   
         name = JOptionPane.showInputDialog("Enter name of metal " + (i + 1) + ": ");
         input = JOptionPane.showInputDialog("Enter amount of ounces (> 0) for metal " + (i + 1) + ": ");
         amtInOz = Double.parseDouble(input);                                                                
         
         while (amtInOz <= 0)          
         {  
            input = JOptionPane.showInputDialog("Amount of ounces must be greater than 0. Re-enter amount of ounces for metal " + (i + 1) + ": ");
            amtInOz = Double.parseDouble(input);       
         }                             
         
         // Object creation           
         metalArray[i] = new PreciousMetals(name, amtInOz);                    
         
         System.out.println();         
         
      }         
      
      System.out.print("Your listed metals are: \n");              
      
      for (int j = 0; j < numMetals; j++)          
      
      System.out.println(metalArray[j]); 
      
                 
        
      }    

}