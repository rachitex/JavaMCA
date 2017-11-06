/* Show all the country names on the screen */

import java.io.*;

class Exercise3{
	public static void main(String args[]) throws Exception{
		try{
			FileReader fr = new FileReader("Country.txt");
			BufferedReader br = new BufferedReader(fr);

			String s;
			while((s = br.readLine()) != null){
				System.out.println(s);
			}
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}
