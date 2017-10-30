/* Check if the given number is Palindrome or not */

import java.util.*;

class CheckPalindrome{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		int sum = 0, temp, r;
		temp = num;

		while(num > 0){
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		
		if(temp == sum){
			System.out.println(temp +" is Palindrome!");
		}else{
			System.out.println(temp +" is not Palindrome!");
		}
	}
}
