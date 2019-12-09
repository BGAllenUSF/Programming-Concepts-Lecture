import java.util.ArrayList;

public class ALTest
{
   public static void main (String [] args)
   {
      
      /* ArrayList <String> band = new ArrayList <String> ();
      System.out.println("Number of people: " + band.size());
      
      band.add("Paul");
      band.add("John");
      band.add("Ringo");
      band.add(1, "George");  
      band.add("Marty");
      
      System.out.println(band);    
      
      System.out.println("Number of people: " + band.size());
      
      band.remove(band.indexOf("Marty"));
      System.out.println(band);
      */
      ArrayList <Song> music = new ArrayList <> ();
      System.out.println("Number of songs: " + music.size());
      System.out.println(music);
      
      Song song1 = new Song ("blah","blah","blah",1,2);
      Song song2 = new Song ("ble","bleh","blea",13,23);
      
      music.add(song1);
      music.add(song2);
      music.add(new Song ("blah","blah","blah",1,2));
      
      System.out.println("Number of songs: " + music.size());
      System.out.println(music);
      
      for (int i = 0; i < music.size(); i++)
      System.out.println(music.get(i));



   }

}