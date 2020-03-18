/* 
Date: 19/03/2002
Written by: Charlotte Phillips
Student ID: 3356044
*/
import java.util.*;

public class Salary
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
		int hoursWorked = 1, weeklySalary = 0, count = 1, bonus = 0, weeks = 0;
		double week5Salary = 0;
		// User inputs employee's name and desired weeks to calculate salary for.
		System.out.println("Please enter the employee's name.");
		String employeeName = console.nextLine();
		System.out.println("How many weeks would you like to calculate?");
		weeks = console.nextInt();
		// This loop calculates the salary of each week and adds it all as a total.
		while (count <= weeks) {
			System.out.println("Please enter the amount of hours they have worked for week "+count);
			hoursWorked = console.nextInt();
			// Calculate weekly salary + add total to week5Salary.
			if (hoursWorked < 0) {
				System.out.println("Invalid input. Please try again with a positive number or zero.");
				count--;
			}
			else if (hoursWorked > 40){
				weeklySalary = 40 * 10 + ((hoursWorked - 40) * 15);
				week5Salary = week5Salary + weeklySalary;
			}
			else {
				weeklySalary = hoursWorked * 10;
				week5Salary = week5Salary + weeklySalary;
			}
			count++;
		}
		// This loop calculates the bonus needed for the employee.
		if (week5Salary <= 1000) {
			week5Salary = week5Salary * 1.10;
			bonus = 10;
		}
		else if (week5Salary > 1000 && week5Salary <= 2000) {
			week5Salary = week5Salary * 1.05;
			bonus = 5;
		}
		else {
			week5Salary = week5Salary * 1.01;
			bonus = 1;
		}
		
		System.out.println("The salary of "+employeeName+" for "+weeks+" weeks is "+week5Salary+" which includes a bonus of "+bonus+"%.\n");
	
	}
}
			