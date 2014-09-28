package QuizPackage;

import java.util.Scanner;

public class FourYearCollege {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float totalTuitionCost = 0;
		
		
		//Asking for user input and assigning variables to the given tuition cost and percentage increases.
		
		System.out.print("Enter in the initial tuition cost : ");
		float initialTuition = input.nextFloat();
		System.out.print("Enter in percentage of tuition increase per year: ");
		float percentageIncrease = input.nextFloat();
		
		
		//Loop goes through 4 iterations. Adds the new tuition to the previous years tuition
		//and adds the resulting amount to totalTuitionCost.
		for(int year=1;year<=4;year++)
		{
		    initialTuition += (initialTuition * percentageIncrease);
		    totalTuitionCost += initialTuition;
		}
		   System.out.printf("The cost to complete your four year degree is $%.2f",totalTuitionCost);
		}
}

