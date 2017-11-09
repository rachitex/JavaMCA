/*This Program displays NumberFormatException, ArrayOutOfBoundsException, NullPointerException*/

import java.util.*;

class StringExceptionExample{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		try{
			int num=Integer.parseInt("XYZ");
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Program will Continue after NumberFormatException");
		}
		
		try{
			String str="Rachit";
			int i=str.length();
			char c=str.charAt(7);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Program will Continue after ArrayIndexOutOfBoundsException");
		}

		try{
			String str=null;
			int i=str.length();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Program will Continue after NullPointerException");
		}
	}
}