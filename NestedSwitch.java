/* Write a program to show the usage of Nested switch */

import java.util.*;

class NestedSwitch{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int a = scan.nextInt();
		System.out.print("Enter second Number: ");
		int b = scan.nextInt();
		System.out.println("Operations : \n1. Arithmetic \n2. Relational \n3. Assignment");
		System.out.print("Enter a choice: ");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1: 
				System.out.println("\n\n Arithmetic Operations : \n1. +  \n2. - \n3. * \n4. /");
				System.out.print("Enter an Operation to be performed: ");
				int operation = scan.nextInt();			
				switch(operation){
					case 1: 
						int sum = a + b; 
						System.out.println("Addition is: "+sum);
						break;
					case 2: 
						int sub = a - b; 
						System.out.println("Subtraction is: "+sub);
						break;
					case 3: 
						int mul = a * b; 
						System.out.println("Product is: "+mul);
						break;
					case 4: 
						int div = a / b; 
						System.out.println("Division is: "+div);
						break;
					default: 
						System.out.println("Invalid Choice!!!");
				}
				break;
			case 2: 
				System.out.println("\n\n Relational Operations : \n1. Greater Number \n2. Smaller Number \n3. Equal");
				System.out.print("Enter an Operation to be performed: ");
				int operation1 = scan.nextInt();	
				switch(operation1){
					case 1: 
						int c = (a > b)?a:b;
						System.out.println(c+ "is the Greater Number");
						break;
					case 2: 
						int d = (a < b)?a:b;
						System.out.println(d+ "is the Smaller Number");
						break;
					case 3: 
						if(a == b){
							System.out.println(a +" is equal to "+b);
						}else{
							System.out.println(a +" is not equal to "+b);
						} 
						break;
					default: 
						System.out.println("Invalid Choice!!!");
				}
				break;

			case 3: 
				System.out.println("\n\n Assignment Operations : \n1. += \n2. -= \n3. *=");
				System.out.print("Enter an Operation to be performed: ");
				int operation2 = scan.nextInt();	
				switch(operation2){
					case 1: 
						a += b;
						System.out.println(a+ " is the new value of a");
						break;
					case 2: 
						a -= b; 
						System.out.println(a+ " is the new value of a");
						break;
					case 3: 
						a *= b; 
						System.out.println(a+ " is the new value of a");
						break;
					default: 
						System.out.println("Invalid Choice!!!");
				}
				break;
			default: 
				 System.out.println("Invalid Choice!!!");
		}
	}
}
