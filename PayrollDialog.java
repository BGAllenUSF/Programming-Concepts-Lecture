import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class PayrollDialog
{
   public static void main (String [] args)
   {
   
      String input;
      String name;
      int hour;
      double payRate;
      double pay;
      
      NumberFormat obj = NumberFormat.getCurrencyInstance ();
      
      name = JOptionPane.showInputDialog("Enter your name: ");
      
      input = JOptionPane.showInputDialog("Enter your hours: ");
      hour = Integer.parseInt(input);
            
      input = JOptionPane.showInputDialog("Enter your payrate: ");
      payRate = Double.parseDouble(input);
      
      pay = hour * payRate;
      
      JOptionPane.showMessageDialog(null, "Hello " + name + ". Your pay is " + obj.format(pay));
      
      int value;
      //value = JOptionPane.showConfirmDialog (null, "Are you done?");
      value = JOptionPane.showConfirmDialog (null, "Are you done?", "Make your choice!", JOptionPane.YES_NO_OPTION);
      
      System.exit(0);

   }
}