//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148


import java.util.Scanner;

public class PalindromeTester
{
   public static void main (String[] args)   
   {      
      String str, another = "y";
      int left, right;
      
      Scanner scan = new Scanner (System.in);
      while (another.equalsIgnoreCase("y")) // allows y or Y      
      {         
         System.out.println ("Enter a potential palindrome:");         
         str = scan.nextLine(); 
         str = str.toLowerCase();  
         str = charCheck(str);  
         palindromeCheck(str);    
         left = 0;         
         right = str.length() - 1;
         
         while (str.charAt(left) == str.charAt(right) && left < right)         
         {            
            left++;            
            right--;        
         }         
         
         System.out.println();
         
         if (left < right)           
            System.out.println ("That string is NOT a palindrome.");
         else            
            System.out.println ("That string IS a palindrome.");   
                  
            System.out.println();         
            System.out.print ("Test another palindrome (y/n)? ");         
            another = scan.nextLine();
            
      }
   }


public static String charCheck (String AnteString) {
      int StringLength = (AnteString.length());
      String EditString = "";
      for (int i = 0; i < StringLength; i++){     
          if (Character.isLetterOrDigit(AnteString.charAt(i)))
             EditString = EditString + AnteString.charAt(i);
      }              
      return EditString;
}

public static void palindromeCheck (String CheckString) { 
   int left, right;
   int x1 = 0;
   left = 0;         
   right = CheckString.length() - 1;
   
   while (CheckString.charAt(left) == CheckString.charAt(right) && left < right)         
         {            
            left++;            
            right--;        
         }         
         
         System.out.println();
         
         if (left < right)           
         x1 = 1;
}

}