/* Search a country name in Country.txt file */

import java.io.*;
import java.util.*;

class SearchCountry{
	public static void main(String args[]) throws Exception{
		try{
			FileReader fr = new FileReader("Country.txt");			
			BufferedReader in = new BufferedReader(fr);
			String str=null;
			ArrayList<String> lines = new ArrayList<String>();
			while((str = in.readLine()) != null){
			    lines.add(str);
			}
			String[] stringArr = lines.toArray(new String[lines.size()]);
			Scanner scan = new Scanner(System.in);
			String userStr = scan.nextLine();
			for(int i = 0; i < stringArr.length; i++){
				if(stringArr[i].equals(userStr)){
					System.out.println("Found "+userStr+" at Line "+(i+1));
				}
			}	
			fr.close();		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
