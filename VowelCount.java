//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.*;

public class VowelCount{

   public static void main(String[] args) {
   
   Scanner scan = new Scanner (System.in);
   
   int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, conCount = 0;
   
   String Input = new String ();
   String Answer = new String ();
   String vowels = new String ("aeiouAEIOU");
      
   do {  
      System.out.println ("Enter a string of characters:");
      Input = scan.nextLine();
      int StringLength = Input.length();
   
      for (int i = 0; i < StringLength; i++){
          String ci = Input.substring(i,i+1); 
          if (vowels.contains(ci)){
            switch (ci) {
            case "a":
            case "A": 
            aCount++;
            break;
            case "e":
            case "E": 
            eCount++;
            break;
            case "i":
            case "I": 
            iCount++;
            break;
            case "o":
            case "O": 
            oCount++;
            break;
            case "u":
            case "U": 
            uCount++;
            break;
            }
         }
      
         else {
         conCount++;}     
   }
   
   System.out.println ("Number of each vowel in the string: ");
   System.out.println ("a: " + aCount);
   System.out.println ("e: " + eCount);
   System.out.println ("i: " + iCount);
   System.out.println ("o: " + oCount);
   System.out.println ("u: " + uCount);
   System.out.println ("Number of non-vowel characters: " + conCount);
   
   aCount = 0;
   eCount = 0;
   iCount = 0;
   oCount = 0;
   uCount = 0; 
   conCount = 0;
   
   System.out.println ("Would you like to try another?");
   Answer = scan.nextLine();

   } while (Answer.equalsIgnoreCase ("yes") || Answer.equalsIgnoreCase ("yeah boi") );
   
      
   }
}
