import java.util.Scanner;
public class SyntaxError
{
	public static void main(String[] args)
	{
	
	int n1, n2;
	
	System.out.println("Enter two numbers to subtract.");
	Scanner keyboard = new Scanner(System.in);
	n1 = keyboard.nextInt();
	n2 = keyboard.nextInt();
	int result = n1 - n2;
	System.out.println("The result is :" + result);
	}
}