/**
	Stack that defines an integer stack that can hold 10 values. Perform push and pop actions in a stack.

**/

import java.util.*;

class StackExample{
	public static void main(String args[]){
		Stack stack = new Stack(); 
		Scanner scan = new Scanner(System.in);
		int num = 10;
		int element = 0;
		try{
			// Stack push
			for(int i = 0; i < num; i++){
				System.out.print("Push: "+i+ " element: ");
				element = scan.nextInt();
				stack.push(element);
				System.out.print("Pushing :"+ element);
				//System.out.println("The Stack is : ");
				System.out.println("\nPushed: "+element);
			}
			System.out.println("\nStack is: ");
			System.out.println(stack);

			// Stack pop
			for(int i = 0; i < num; i++){
				System.out.print("Pop: "+i+ " element: ");
				int y = (int) stack.pop();
				System.out.println("Popping: "+element);
		    		System.out.println("\nPopped: "+y);
			}
			System.out.println("\nUpdated Stack is: ");
			System.out.println(stack);
		}catch(EmptyStackException e){
		}catch(Exception e){
		}finally{
			scan.close();
		}
	}
}
