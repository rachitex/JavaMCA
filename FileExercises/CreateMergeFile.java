/* Create a file Merge.txt which should contain the contents of files, Country.txt and City.txt respectively */

import java.io.*;

class CreateMergeFile{
	public static void main(String args[]) throws Exception{
		try{
			FileWriter fmerge = new FileWriter("Merge.txt");
			BufferedWriter brout = new BufferedWriter(fmerge);

			FileReader fcountry = new FileReader("Country.txt");			
			BufferedReader brcountry = new BufferedReader(fcountry);
			FileReader fcity = new FileReader("City.txt");			
			BufferedReader brcity = new BufferedReader(fcity);

			String lineCountry = brcountry.readLine();
			String lineCity = brcity.readLine();
			
			//System.out.println("Country.txt");			
			while(lineCountry != null){
				brout.write(lineCountry+"\n");
				lineCountry = brcountry.readLine();
			}
			//System.out.println("City.txt");
			while(lineCity != null){
				brout.write(lineCity+"\n");
				lineCity = brcity.readLine();
			}
			brout.close();
			brcountry.close();
			brcity.close();

			System.out.println("The content of Country.txt and City.txt has been added to Merge.txt");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
