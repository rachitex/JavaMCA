/* Create another file City.txt and input 5 city names in it */

import java.io.*;
import java.util.*;
	
class CreateCityFile{
	public static void main(String args[]) throws Exception{
		try{
			File fil = new File("City.txt");

			boolean success = fil.createNewFile();
			
			if(success){
				System.out.println("File "+ fil.getPath() + " has been created.");
			}else{
				System.out.println("Failed");
			}

			FileWriter fstream = new FileWriter("City.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			Scanner scan = new Scanner(System.in);
			String city[] = new String[5];

			for(int i = 0; i < 5; i++){
				city[i] = scan.nextLine();
				out.write(city[i]+"\n");
			}
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
