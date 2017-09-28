/* Write a program to show usage of switch case */

import java.util.*;

class Prog10{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a choice to display a day of week (Number 1 to 7): ");
		int choice = scan.nextInt();

		switch(choice){
			case 1: 
				System.out.println("Sunday");
				break;
			case 2: 
				System.out.println("Monday");
				break;
			case 3: 
				System.out.println("Tuesday");
				break;
			case 4: 
				System.out.println("Wednesday");
				break;
			case 5: 
				System.out.println("Thursday");
				break;
			case 6: 
				System.out.println("Friday");
				break;
			case 7: 
				System.out.println("Saturday");
				break;
			default: 
				System.out.println("Invalid Choice");
		}
	}
}