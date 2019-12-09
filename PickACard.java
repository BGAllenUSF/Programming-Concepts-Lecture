//I pledge my Honor that I have not cheated, and will not cheat, on this assignment Benjamin Allen U30786148

import java.util.*;

public class PickACard
{

enum Suit
{
   Spades,Hearts,Diamonds,Clubs;
}
   
enum Rank
{
   Ace,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King;
}

   public static void main(String[] args)
   {
   
   Random r = new Random ();
   
   int RandGen,CardRank,CardSuit;
   
   Rank ourRank = Rank.Ace;
   Suit ourSuit = Suit.Spades;
   
   RandGen = r.nextInt(53);
   
   CardSuit = RandGen / 13;
   
   CardRank = RandGen % 13;
   
   /*
   System.out.println(RandGen);
   System.out.println(CardSuit);
   System.out.println(CardRank);
   */
   
   if (CardRank == 0){
   ourRank = Rank.Ace;}
   else if (CardRank == 1){
   ourRank = Rank.Two;}
   else if (CardRank == 2){
   ourRank = Rank.Three;}
   else if (CardRank == 3){
   ourRank = Rank.Four;}
   else if (CardRank == 4){
   ourRank = Rank.Five;}
   else if (CardRank == 5){
   ourRank = Rank.Six;}
   else if (CardRank == 6){
   ourRank = Rank.Seven;}
   else if (CardRank == 7){
   ourRank = Rank.Eight;}
   else if (CardRank == 8){
   ourRank = Rank.Nine;}
   else if (CardRank == 9){
   ourRank = Rank.Ten;}
   else if (CardRank == 10){
   ourRank = Rank.Jack;}
   else if (CardRank == 11){
   ourRank = Rank.Queen;}
   else if (CardRank == 12){
   ourRank = Rank.King;}
   
   if (CardSuit == 0){
   ourSuit = Suit.Spades;}
   else if (CardSuit == 1){
   ourSuit = Suit.Hearts;}
   else if (CardSuit == 2){
   ourSuit = Suit.Diamonds;}
   else if (CardSuit == 3){
   ourSuit = Suit.Clubs;}
   
   System.out.println("Your card is a(n) " + ourRank + " of " + ourSuit);
   }
}
   
   
   
   
   
   

   