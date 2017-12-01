/**
	This application displays the day of a given date.
	Enter the date in DD-MM-YYYY format
	 https://github.com/rachitex
*/

import java.util.*;

class DisplayDay{
	public static int dayofweek(int day, int month, int year){
	    int[] arrExtra = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
	    year -= (month < 3) ? 1 : 0;
	    return ( year + year/4 - year/100 + year/400 + arrExtra[month - 1] + day) % 7;
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int day, month, year;
		System.out.print("Enter the Day: ");
		try{
			day = scan.nextInt();
			if(day > 31 || day < 1){
				System.out.print("Invalid day! Enter again: ");
				day = scan.nextInt();
			}
		}catch(Exception e){
			scan.next();
			day = scan.nextInt();
		}
		System.out.print("Enter the Month: ");
		try{
			month = scan.nextInt();
			if(month > 12 || month < 1){
				System.out.print("Invalid month! Enter again: ");
				month = scan.nextInt();
			}
		}catch(Exception e){
			scan.next();
			month = scan.nextInt();
		}
		System.out.print("Enter the Year: ");
		try{
			year = scan.nextInt();
		}catch(Exception e){
			scan.next();
			year = scan.nextInt();
		}		
		int weekDay = dayofweek(day, month, year);
		String dayName = "";
	    switch(weekDay){
	        case 1:
	            dayName = "Monday";
	            break;
	        case 2:
	            dayName = "Tuesday";
	            break;
	        case 3:
	            dayName = "Wednesday";
	            break;
	        case 4:
	            dayName = "Thursday";
	            break;
	        case 5:
	            dayName = "Friday";
	            break;
	        case 6:
	            dayName = "Saturday";
	            break;
	        case 0:
	            dayName = "Sunday";
	            break;
	        default:
	            System.out.println("You have entered invalid date!");
	    }
	    System.out.println ("The day is: " + dayName);
	    scan.close();
	}
}
