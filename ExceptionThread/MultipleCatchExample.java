/* This program shows the usage of Multiple catch blocks */

import java.util.*;

class MultipleCatchExample{
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		int n;
		int num1,num2;
		
		try{
			System.out.print("Enter Size of Array: ");
			n=scan.nextInt();
			int a[]= new int[n];			

			for(int i=0;i<n;i++){
				a[i]=scan.nextInt();
			}
			
			System.out.println("\n\nElements of Array are: ");
			
			for(int i=0;i<n;i++){
				System.out.println(a[i]);
			}

			// Code that creates Exception
			System.out.println(a[n+1]);
				
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(InputMismatchException e){
			e.printStackTrace();
			/* When InputMismatchException arises the 'letter' will remain in the Scanner class
			and nextInt(); will keep on iterating. So we have to empty the Scanner class using
			next() method*/
			scan.next();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("FINALLY ArrayOutOfBounds: Program Continues Working");
		}

		try{
			System.out.print("\n\nEnter Value of Num1: ");			
			num1=scan.nextInt();
			System.out.print("Enter Value of Num2: ");
			num2=scan.nextInt();
			System.out.println("Division is: "+num1/num2);	
				
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(InputMismatchException e){
			e.printStackTrace();
			scan.next();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("FINALLY Arithmetic: Program Continues Working");
		}
	}
}