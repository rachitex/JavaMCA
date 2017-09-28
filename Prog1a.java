/* Write a Program to swap two numbers without using the third variable*/

class Prog1a{
	public static void main(String[] args){
		int a=6;
		int b=5;
	
		System.out.println("Before Swapping: a="+a+" and b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: a="+a+" and b="+b);
	}
}
