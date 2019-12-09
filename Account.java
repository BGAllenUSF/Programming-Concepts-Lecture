import java.text.NumberFormat;
import java.util.Scanner;

public class Account
{
   //state - data
   private final double RATE = 0.035;
   
   private String name;
   private long accountNumber;
   private double balance;

   //behavior - methods
   
   //constructor
   public Account (String owner, long account, double initial)
   {
   name = owner;
   accountNumber = account;
   balance = initial;
   }
   
   //overloaded constructor
   public Account ()
   {
   name = " ";
   accountNumber = 1000;
   balance = 0;
   }
   
   public double deposit(double amt)
   {
      balance += amt;
      return balance;
   }
   
   public double withdraw ( double amt, double fee)
   {
   balance -= amt + fee;
   return balance;
   }
   
   public double addIntrest ()
   {
      balance += (balance * RATE);
      return balance;
   }
   
   //accesor method aka "getter"
   public double getBalance()
   {
      return balance ;
   }
   //mutator mthod
   public long getAccount ()
   {
      return accountNumber;
   }
   
   //mutator methiod aka setter
   public void setName (String n)
   {
   name = n;
   }
   
   public void setAccNum (long ac)
   {
   accountNumber = ac;
   }
   
   public void setbalance (double d)
   {
      balance = d;
   }
   
   //toString
   public String toString()
   {
      NumberFormat f = NumberFormat.getCurrencyInstance();
      return name + "\t\t" + accountNumber + "\t\t" + f.format(balance);
   }
}