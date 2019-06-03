package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Creating a variable to define our career
		
		// Declaring Variable
		String career;
		System.out.println("Program is starting...");
		
		// Defining a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 52;
		double rate = 42.50;
		career = "Web Developer";
		
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		//Compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
	}
}
