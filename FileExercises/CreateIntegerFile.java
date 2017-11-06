/**
	* Program to take various integers from users as input and stores them in file called "Integers.txt"
	* (a) The process should continue until user enters -9999 as input
	* (b) Calculate summation of all the numbers available in Integers.txt
	* (c) Find Maximum & Minimum Numbers from File
	* (d) Sort the numbers available in the Integers.txt into "SortedIntegers.txt"
	* (e) Sort the Integers.txt file  
**/

import java.util.*;
import java.io.*;
//import java.util.ArrayList;

class Exercise8{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		// Code snippet to create a file named Integers.txt
		try{
			File integerFile = new File("Integers.txt");
			integerFile.createNewFile();	
		}catch(Exception e){
		}
		

		int choice = 0;
		do{
			System.out.println("\nSelect an Operation: ");
			System.out.println("(1) Input Integers in Integers.txt");
			System.out.println("(2) Calculate sum of all the numbers available in Integers.txt");
			System.out.println("(3) Find Maximum & Minimum of Numbers from File");
			System.out.println("(4) Sort the Integers.txt");
			System.out.println("(5) Sort the Numbers into SortedIntegers.txt");		
			try{
			System.out.print("\nEnter Choice: ");
			choice = scan.nextInt();
			switch(choice){
					case 1:	
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
		
					case 2:						
						try{
							File integerFile = new File("Integers.txt");						
							Scanner inFile = new Scanner(integerFile);
							//int size = inFile.nextInt();
							List<Integer> listIntegers = new ArrayList<>();
							/*for(int i = 0; i < upperBound; i++) {
							    sum.add(i);
							}
							// necessary to convert back to Integer[]
							Integer[] sumArray = sum.toArray(new Integer[0]);*/
							//int[] arrIntegers = new int[(int)integerFile.length()];
							int i = 0;
							while(inFile.hasNextInt()){
								//arrIntegers[i++] = inFile.nextInt();
								i = inFile.nextInt();
								listIntegers.add(i);
								i++;
								/*inFile.next();
								if(inFile.hasNextInt()){
									
								}*/
							}
							Integer[] arrIntegers = listIntegers.toArray(new Integer[0]);
							int sum = 0;
							for(int j = 0; j < arrIntegers.length; j++){
								System.out.println(arrIntegers[j]);
								sum += arrIntegers[j];
							}
							System.out.println("\nSum of the integers present in Integers.txt is " + sum);
							inFile.close();

						}catch(Exception e){
						}						
						break;

						case 3:						
						try{
							File integerFile = new File("Integers.txt");						
							Scanner inFile = new Scanner(integerFile);
							List<Integer> listIntegers = new ArrayList<>();
							//int[] arrIntegers = new int[(int)integerFile.length()];
							int i = 0;
							while(inFile.hasNextInt()){
								//arrIntegers[i++] = inFile.nextInt();
								i = inFile.nextInt();
								listIntegers.add(i);
								i++;
								/*if(!inFile.hasNextInt()){
									inFile.next();
								}*/
							}
							Integer[] arrIntegers = listIntegers.toArray(new Integer[0]);
							int max = arrIntegers[0];				
							for(int j = 0; j < arrIntegers.length; j++){
								if(max < arrIntegers[j]){
									max = arrIntegers[j];
								}
							}
							System.out.println("\nMaximum number out of numbers present in Integers.txt is " + max);
							
							int min = arrIntegers[0];				
							for(int j = 0; j < arrIntegers.length; j++){
								if(min > arrIntegers[j]){
									min = arrIntegers[j];
								}
							}
							System.out.println("\nMinimum number out of numbers present in Integers.txt is " + min);
							inFile.close();

						}catch(Exception e){
						}						
						break;

						case 4:						
						try{
							File integerFile = new File("Integers.txt");						
							Scanner inFile = new Scanner(integerFile);
							List<Integer> listIntegers = new ArrayList<>();
							//int[] arrIntegers = new int[(int)integerFile.length()];
							int i = 0;
							while(inFile.hasNextInt()){
								//arrIntegers[i++] = inFile.nextInt();
								i = inFile.nextInt();
								listIntegers.add(i);
								i++;
								/*if(!inFile.hasNextInt()){
									inFile.next();
								}*/
							}
							Integer[] arrIntegers = listIntegers.toArray(new Integer[0]);
							Arrays.sort(arrIntegers);
							FileWriter fstream = new FileWriter("Integers.txt");
							BufferedWriter out = new BufferedWriter(fstream);
							Integer[] arrSorted = new Integer[arrIntegers.length];
							for(int j = 0; j < arrIntegers.length; j++){
								//System.out.println(arrIntegers[j]);
								arrSorted[j] = arrIntegers[j];
								out.write(arrSorted[j]+"\n");
							}
							System.out.println("Sorted Numbers are added to Integers.txt!!!");
							out.close();
							inFile.close();				

						}catch(Exception e){
						}						
						break;

						case 5:						
						try{
							File integerFile = new File("Integers.txt");						
							Scanner inFile = new Scanner(integerFile);
							List<Integer> listIntegers = new ArrayList<>();
							//int[] arrIntegers = new int[(int)integerFile.length()];
							int i = 0;
							while(inFile.hasNextInt()){
								//arrIntegers[i++] = inFile.nextInt();
								i = inFile.nextInt();
								listIntegers.add(i);
								i++;
								/*if(!inFile.hasNextInt()){
									inFile.next();
								}*/
							}
							Integer[] arrIntegers = listIntegers.toArray(new Integer[0]);
							Arrays.sort(arrIntegers);
							FileWriter fstream = new FileWriter("SortedIntegers.txt");
							BufferedWriter out = new BufferedWriter(fstream);
							Integer[] arrSorted = new Integer[arrIntegers.length];
							for(int j = 0; j < arrIntegers.length; j++){
								//System.out.println(arrIntegers[j]);
								arrSorted[j] = arrIntegers[j];
								out.write(arrSorted[j]+"\n");
							}
							System.out.println("Sorted Numbers are added to SortedIntegers.txt!!!");
							out.close();
							inFile.close();				

						}catch(Exception e){
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
