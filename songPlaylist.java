//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148
 
public class songPlaylist 
{ 
    private Song [] collection;    
    private int count;    
        
     public songPlaylist()    
     {       
        collection = new Song [3];       
        count = 0;         
     } 
     
     public void addSong(String title, String artist, String album, int track, int year)    
     {   
         if (count == collection.length) 
            increaseSize();
            
          collection[count] = new Song (title, artist, album, track, year);  
          count++;
     }
     
     public String toString() 
     {
         String report = ""; 
         report += "My Playlist\n"; 
         report += "Number of Songs: " + count + "\n\n";       
         //report += title + "\t\t" + artist + "\t\t" + album + "\t\t" + track + "\t\t" + year;       
         
         for (int song = 0; song < count; song++) 
             report += collection[song].toString() + "\n"; 
             
             return report; 
      }
      
      private void increaseSize()    
      {
          Song [] temp = new Song[collection.length * 2]; 
          for (int i = 0; i < collection.length; i++) 
          temp[i] = collection[i]; 
          
          collection = temp;
      }
      
}