/* Store 10 Country names in a file Country.txt */

import java.util.*;
import java.io.*;

class Exercise2{
	public static void main(String args[]) throws Exception{
		try{
			FileWriter fstream = new FileWriter("Country.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			Scanner scan = new Scanner(System.in);
			String country[] = new String[10];

			for(int i = 0; i < 10; i++){
				country[i] = scan.nextLine();
				out.write(country[i]+"\n");
			}
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
