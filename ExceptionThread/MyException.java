/* This program makes a User Defined Exception Class */

public class MyException extends Exception{
	public int myExceptionFunction(int i){
		if(i<18){
			System.out.println("You can not enter age less than 18");
		}
		return 1;
	}
}