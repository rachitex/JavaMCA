/* Creating a file "Country.txt" */

import java.io.*;
	
class Exercise1{
	public static void main(String args[]) throws Exception{
		try{
			File fil = new File("Country.txt");

			boolean success = fil.createNewFile();
			
			if(success){
				System.out.println("File "+ fil.getPath() + " has been created.");
			}else{
				System.out.println("Failed");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}