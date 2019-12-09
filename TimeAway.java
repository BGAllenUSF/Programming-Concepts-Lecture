import java.util.*; 

public class TimeAway {
   public static void main (String [] args) {
   
   int StartDay, StartMonth, StartYear, EndDay, EndMonth, EndYear;
   int LeapCount = 0, RegCount = 0, DaysIntoEnd = 0, DaysIntoStart = 0, DaysLeft = 0;
   
   //Creates Scanner
   Scanner scan = new Scanner (System.in);
   
   //Get Start and End Date   
   System.out.println("Input start month (mm)");
   StartMonth = scan.nextInt();
   
   System.out.println("Input start day (dd)");
   StartDay = scan.nextInt();
   
   System.out.println("Input start year (yyyy)");
   StartYear = scan.nextInt();
   
   System.out.println("Input end month (mm)");
   EndMonth = scan.nextInt();
   
   System.out.println("Input end day (dd)");
   EndDay = scan.nextInt();
   
   System.out.println("Input end year (yyyy)");
   EndYear = scan.nextInt();
      
   //Diffrence in Years and Leap Years
   for (int i = (StartYear + 1); i < EndYear; i++){
       if ((((i/100) * 100) - i) == 0 && i % 400 == 0){
       LeapCount++;}
       else if (i % 4 == 0 && (((i/100) * 100) - i) != 0){
       LeapCount++;}
       else {
       RegCount++;}
   }
      //Days into EndYear
      if (EndMonth == 1) {
      DaysIntoEnd = EndDay;}
      else if (EndMonth == 2) {
      DaysIntoEnd = 31 + EndDay;}
      else if (EndMonth == 3) {
      DaysIntoEnd = 59 + EndDay;}
      else if (EndMonth == 4) {
      DaysIntoEnd = 90 + EndDay;} 
      else if (EndMonth == 5) {
      DaysIntoEnd = 120 + EndDay;}
      else if (EndMonth == 6) {
      DaysIntoEnd = 151 + EndDay;}
      else if (EndMonth == 7) {
      DaysIntoEnd = 181 + EndDay;}
      else if (EndMonth == 8) {
      DaysIntoEnd = 212 + EndDay;}
      else if (EndMonth == 9) {
      DaysIntoEnd = 243 + EndDay;}
      else if (EndMonth == 10) {
      DaysIntoEnd = 273 + EndDay;}
      else if (EndMonth == 11) {
      DaysIntoEnd = 304 + EndDay;}
      else if (EndMonth == 12) {
      DaysIntoEnd = 334 + EndDay;}
      
      //Days into start
      if (StartMonth == 1) {
      DaysIntoStart = StartDay;}
      else if (StartMonth == 2) {
      DaysIntoStart = 31 + StartDay;}
      else if (StartMonth == 3) {
      DaysIntoStart = 59 + StartDay;}
      else if (StartMonth == 4) {
      DaysIntoStart = 90 + StartDay;} 
      else if (StartMonth == 5) {
      DaysIntoStart = 120 + StartDay;}
      else if (StartMonth == 6) {
      DaysIntoStart = 151 + StartDay;}
      else if (StartMonth == 7) {
      DaysIntoStart = 181 + StartDay;}
      else if (StartMonth == 8) {
      DaysIntoStart = 212 + StartDay;}
      else if (StartMonth == 9) {
      DaysIntoStart = 243 + StartDay;}
      else if (StartMonth == 10) {
      DaysIntoStart = 273 + StartDay;}
      else if (StartMonth == 11) {
      DaysIntoStart = 304 + StartDay;}
      else if (StartMonth == 12) {
      DaysIntoStart = 334 + StartDay;}
      
      //Days left in start + years between + days into end 
      if (StartYear == EndYear){
      DaysLeft = (DaysIntoEnd - DaysIntoStart);
      System.out.println("The diffrence between these dates is: " + DaysLeft + " Days.");}      
      else if (((( StartYear/100) * 100) -  StartYear) == 0 &&  StartYear % 400 == 0){
      DaysLeft = 366 - DaysIntoStart;}
      else if (StartYear % 4 == 0 && (((StartYear/100) * 100) - StartYear) != 0){
      DaysLeft = 366 - DaysIntoStart;}
      else {
      DaysLeft = 365 - DaysIntoStart;
      System.out.println("The diffrence between these dates is: " + (DaysIntoEnd + DaysLeft + (365 * RegCount) + (366 * LeapCount)) + " Days.");
      System.out.println("Or " + RegCount + " Regular Years, " + LeapCount + " Leap Years and " + (DaysLeft + DaysIntoEnd) + " Days.");}
       
   }
}   
