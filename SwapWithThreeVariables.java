/* Write a Program to swap two numbers using the third variable*/

class SwapWithThreeVariables{
	public static void main(String[] args){
		int a=6;
		int b=5;
		int c;
		System.out.println("Before Swapping: a="+a+" and b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping: a="+a+" and b="+b);
	}
}
