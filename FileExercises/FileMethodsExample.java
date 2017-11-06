/* Experiment various methods of the class File for the Country.txt file */

import java.io.*;
import java.util.*;

class FileMethodsExample{
	public static void main(String args[]) throws Exception{
		File file = new File("Country.txt");
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Select a File class operation to be performed: ");
			System.out.println("1. Create Country.txt file");
			System.out.println("2. Get the path of Country.txt file");	
			System.out.println("3. Get the length of Country.txt file");
			System.out.println("4. Get the Name of Country.txt file");
			System.out.println("5. Get the Parent Directory of Country.txt file");
			System.out.println("6. To know if the Country.txt file is readable");
			System.out.println("7. To know if the Country.txt file is writable");
			System.out.println("8. To know when was Country.txt file last modified");
			System.out.println("9. Rename the Country.txt file");
			System.out.println("10. Delete the Country.txt file");
			System.out.print("Enter a Choice: ");		
			int choice = scan.nextInt();
			switch(choice){
				case 1: 
					boolean success = file.createNewFile();
					if(!success){
						System.out.println("File Already Exists!! and exists() method returns "+file.exists());
					} 
					break;

				case 2:
					System.out.println("Path of Country.txt is "+file.getPath());
					break;

				case 3:
					System.out.println("Length of Country.txt is "+file.length());
					break;

				case 4:
					System.out.println("Name of Country.txt is "+file.getName());
					break;

				case 5:
					System.out.println("Parent of Country.txt is "+file.getParent());
					break;

				case 6:
					System.out.println("Readability of Country.txt is "+file.canRead());
					break;

				case 7:
					System.out.println("Writability of Country.txt is "+file.canWrite());
					break;

				case 8:
					System.out.println("Last Modification on Country.txt was done at "+file.lastModified());
					break;

				case 9:
					System.out.println("Are You Sure? Y/N");
					Scanner reader = new Scanner(System.in);
					char c = reader.next(".").charAt(0);
					if(c == 'y' || c == 'Y'){
						String str = reader.next();
						File file1 = new File(str);
						file.renameTo(file1);
						System.out.println("Successfully Renamed!!! New Name: "+file1.getName());
						break;
					}else{
						break;
					}


				case 10:
					System.out.println("Are You Sure? Y/N");
					Scanner scanner = new Scanner(System.in);
					char d = scanner.next(".").charAt(0);
					if(d == 'y' || d == 'Y'){
						file.delete();
						System.out.println("Successfully Deleted");
						break;
					}else{
						break;
					}
					
				default:
					System.out.println("Invalid Choice!!!");
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
