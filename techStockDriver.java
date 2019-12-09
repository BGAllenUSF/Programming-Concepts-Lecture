import java.util.Scanner; 

public class techStockDriver 
{    
   public static void main (String [] args)    
   {    
      String input,nameCompany;       
      int numCompany, numShares;              
      
      Scanner scan = new Scanner(System.in);              
     
      do       
      {          
         System.out.println ("How many stocks are you interested in?\n(Amount must be >= 1): ");
         numCompany = scan.nextInt();      
         input = scan.nextLine();       
      }
      while (numCompany < 1);   
          
      techStocks [] companyArray = new techStocks[numCompany];  
         
      for (int i = 0; i < numCompany; i++)       
      {  
         System.out.println ("Enter name of company " + (i + 1) + ": "); 
         nameCompany = scan.nextLine();
         System.out.println("Enter amount of shares for company " + (i + 1) + ": ");
         numShares = scan.nextInt(); 
         input = scan.nextLine();
                                                               
         while (numShares < 1)          
         {  
            System.out.println("Amount of shares must be greater than 0. Re-enter amount of ounces for metal " + (i + 1) + ": ");
            numShares = scan.nextInt();        
         }                             
         
         // Object creation           
         companyArray[i] = new techStocks (nameCompany, numShares);                    
         
         System.out.println();    
         
      }         
                   

      
      System.out.print("Your listed companies are: \n");              
      
      for (int j = 0; j < numCompany; j++)          
      System.out.println(companyArray[j]);           

      
     System.out.println(techStocks.getTotalCost());
    }  
    
}

CONTINUE

BREAK

INTEGER DIVISION

SWITCH STATEMENT 

EXTENDS TO

PRIVATE VERSUS PROTECTED 

CONSTRUCTORS 

public vs private

static vs void 

variable perameter list

overiding methods 13b 24-28

