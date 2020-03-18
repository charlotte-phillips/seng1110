import javax.swing.*;

public class NameGenerator
{
	public static void main (String[] args)
	{
		String first1 = JOptionPane.showInputDialog("Please enter the first name 1.");
		String first2 = JOptionPane.showInputDialog("Please enter the last name 1.");
		String last = JOptionPane.showInputDialog("Please enter the last name.");
		JOptionPane.showMessageDialog(null, "Your names are" +first1+last+ "and" +first2+last+".",last,JOptionPane.INFORMATION_MESSAGE);   
	}
}	