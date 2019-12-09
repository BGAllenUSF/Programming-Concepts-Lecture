//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.Scanner;

public class songDriver 
{     
    public static void main(String[] args)    
    { 
      Scanner scan = new Scanner (System.in);      
      
      String title, artist, album,extra;    
      int track, year, count;
      
        
      songPlaylist songs = new songPlaylist();
      
      System.out.print ("How many songs would you like to enter? ");
      count = scan.nextInt();
      
      for (int i = 0; i < count; i++)
      {
         System.out.println ("Enter Data for song " + (i + 1) + ":");
         
         System.out.print ("Title: ");
         extra = scan.nextLine();
         title = scan.nextLine();
         
         System.out.print ("Artist: ");
         artist = scan.nextLine();
         
         System.out.print ("Album: ");
         album = scan.nextLine();
         
         System.out.print ("Track: ");
         track = scan.nextInt();
         
         System.out.print ("Year: ");
         year = scan.nextInt();
         
         songs.addSong(title, artist, album, track, year);
      }

         
      System.out.println(songs);
         
    
    } 
      
} 