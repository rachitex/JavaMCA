/**
	Write a Program to 
	a) Store some integers in a binary file.
	b) Read the binary file and print on the screen.
	c) Store some integers in a text file.
	d) Read the text file and print on the the screen.
**/

import java.util.*;
import java.io.*;

class Exercise9{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do{
			System.out.println("\nSelect an Operation: ");
			System.out.println("(1) Store some integers in a binary file.");
			System.out.println("(2) Read the binary file and print on the screen.");
			System.out.println("(3) Store some integers in a text file.");
			System.out.println("(4) Read the text file and print on the screen.");		
			try{
			System.out.print("\nEnter Choice(-9999 to exit): ");
			choice = scan.nextInt();
			switch(choice){
				case 1:
					try{
						ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Integers.rac"));	
						System.out.print("How many numbers do you want to enter?: ");
						int num = scan.nextInt();
						Integer arrIntegers[] = new Integer[num];

						for(int i = 0; i < arrIntegers.length; i++){
							arrIntegers[i] = scan.nextInt();
							outputStream.writeInt(arrIntegers[i]);
							System.out.print("");
						}
						outputStream.close();
					}catch(Exception e){
					}
					break;

				case 2:
					try{
						ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Integers.rac"));
						try{
							while (true)
							{
							    int num = inputStream.readInt();
							    System.out.println(num);
							}
						}catch(EOFException e){
							System.out.println("End of reading from file.");
						}
						inputStream.close();
					}catch(Exception e){
					}
					break;
				
				case 3:
					try{
							FileWriter fstreamIntegers = new FileWriter("Integers.txt");
							BufferedWriter outIntegers = new BufferedWriter(fstreamIntegers);		
							//Scanner scan = new Scanner(System.in);
							System.out.print("How many numbers do you want to enter?: ");
							int num = scan.nextInt();
							String integers[] = new String[num+1];

							for(int i = 0; i < integers.length; i++){
								integers[i] = scan.nextLine();
								outIntegers.write(integers[i]+"\n");
							}
							outIntegers.close();
						}catch(IOException e){
							e.printStackTrace();
						}
						break;

				case 4:
					try{
							Scanner keyboard = new Scanner(new File("Integers.txt")); 
							int n = 0;
							while(keyboard.hasNextInt()){
								n = keyboard.nextInt();
								System.out.println(n);
							}		
							keyboard.close();
						}catch(Exception e){
							e.printStackTrace();
						}
						break;

				default: 
					if(choice == -9999){
					}else{
						System.out.println("\n*****Enter Valid Choice!*****");
					}
			}

			}catch(InputMismatchException e){
					System.out.print("\n*****Enter Valid Choice!*****");
					scan.next();				
			}				
		}while(choice != -9999);
		scan.close();
	}
}
