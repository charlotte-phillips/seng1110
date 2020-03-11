import java.util.*;

public class Salary
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        double normalWeek1,extraWeek1,normalWeek1,extraWeek1,total;
        System.out.println("Please Enter number of normal hours in week 1: ");
        normalWeek1 = console.nextDouble();
        System.out.println("Please Enter number of extra hours in week 1: ");
        extraWeek1 = console.nextDouble();
		System.out.println("Please Enter number of normal hours in week 2: ");
        normalWeek2 = console.nextDouble();
        System.out.println("Please Enter number of extra hours in week 2: ");
        extraWeek2 = console.nextDouble();
        total = (10*normalWeek1)+(15*extraWeek1)+(10*normalWeek2)+(15*extraWeek2);
		if (total < 500) 
			total = total * 1.10;
		else if (total < 1000)
			total = total * 1.05;
        System.out.println("Total salary is: "+total+"\n");
    }
}
