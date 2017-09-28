/* Write a program to input an array and print the prime numbers */

import java.util.*;

class Prog7{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");

		int n = scan.nextInt();
		int[] a = new int[n];
		int[] primeArray = new int[n];
		boolean flag = true;
		
		for(int i = 0; i < n; i++){
			if(i == 1){
				System.out.print("\nEnter the "+i+"st element of Array: ");
			}else if(i == 2){
				System.out.print("\nEnter the "+i+"nd element of Array: ");
			}
			else if(i == 3){
				System.out.print("\nEnter the "+i+"rd element of Array: ");
			}
			else if(i != 1 && i != 2 && i != 3){
				System.out.print("\nEnter the "+i+"th element of Array: ");
			}
			a[i] = scan.nextInt();
		}

		System.out.println("\n\nDisplaying Array: ");
		for(int i = 0; i < n; i++){
			if(i == 1){
				System.out.println("\n"+i+"st element of Array is: "+a[i]);
			}else if(i == 2){
				System.out.println("\n"+i+"nd element of Array is: "+a[i]);
			}
			else if(i == 3){
				System.out.println("\n"+i+"rd element of Array is: "+a[i]);
			}
			else if(i != 1 && i != 2 && i != 3){
				System.out.println("\n"+i+"th element of Array is: "+a[i]);
			}
		}

		try{
			for(int i = 0; i < n; i++){
				for(int j = 2; j < a[i]; j++){
          			// condition for nonprime number
            				if(a[i] % j == 0){
                				flag = false;
						break;
            				}else if(a[i] == 0 && a[i] == 1 && a[i] == 2){
						flag = false;
						break;
					}else{
						flag = true;
						primeArray[i] = a[i];
					}
        			}
			}
		
			System.out.println("\n\nPrime Numbers are: ");
			for(int i = 0; i < primeArray.length; i++){
				if(primeArray[i] == 0){
					continue;
				}
				System.out.println("\n\n"+primeArray[i]);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}