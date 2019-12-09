//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

public class Song 
 {    
   private String title, artist, album;    
   private int track, year;    
   
   public Song (String title, String artist, String album, int track, int year)    
   {       
      this.title = title;       
      this.artist = artist; 
      this.album = album; 
      this.track = track;     
      this.year = year;       
   } 
    
   public String toString()    
   {       
      String description; 
      description = String.format("%-20s",title);       
      description += String.format("%-20s",artist);
      description += String.format("%-20s",album);
      description += String.format("%-20s",Integer.toString(track));
      description += String.format("%-20s",Integer.toString(year));
  
      return description;    
   } 
} 
	