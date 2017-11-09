/* This program catches the exception from MyException class */

class CustomExceptionExample{
	public static void main(String args[]) throws MyException{
		try{	
			throw new MyException();	
		}catch(MyException e){
			
			e.myExceptionFunction(age);
			e.printStackTrace();
		}
	}
}