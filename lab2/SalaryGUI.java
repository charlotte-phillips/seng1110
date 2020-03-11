import javax.swing.*;


public class SalaryGUI
{
    public static void main (String[] args)
    {
		// double normalWeek1,extraWeek1,normalWeek2,extraWeek2,total;
		double total;
		
        String n1 = JOptionPane.showInputDialog("Please Enter number of normal hours in week 1:");
		double normalWeek1 = Double.parseDouble(n1);
        String n2 = JOptionPane.showInputDialog("Please Enter number of extra hours in week 1: ");
		double extraWeek1 = Double.parseDouble(n2);
		String n3 = JOptionPane.showInputDialog("Please Enter number of normal hours in week 2: ");
		double normalWeek2 = Double.parseDouble(n3);
        String n4 = JOptionPane.showInputDialog("Please Enter number of extra hours in week 2: ");
		double extraWeek2 = Double.parseDouble(n4);
        total = (10*normalWeek1)+(15*extraWeek1)+(10*normalWeek2)+(15*extraWeek2);
		if (total < 500) 
			total = total * 1.10;
		else if (total < 1000)
			total = total * 1.05;
        JOptionPane.showMessageDialog(null, total, "Total salary is: "+total+"\n",JOptionPane.INFORMATION_MESSAGE);
    }
}
