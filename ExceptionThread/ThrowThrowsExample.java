/* This program shows the usage of throw and throws keyword */

import java.io.*;

class SomeClass{
	public void someFunction() throws ArithmeticException{
		
		try{
		int a=5;
		int b=0;
		System.out.println(a/b);
		}catch(Exception e){
			//e.printStackTrace();
			throw new ArithmeticException("Exception Message");
		}finally{
			System.out.println("Statement inside finally block");
		}
	}
}

class ThrowThrowsExample{
	public static void main(String args[]){
		SomeClass obj=new SomeClass();
		obj.someFunction();
	}
}