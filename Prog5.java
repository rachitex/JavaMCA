/* Program to show the usage of nested if */

import java.util.*;

class Prog5{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Marks of Subject1: ");
    int subject1 = scan.nextInt();
    System.out.print("Enter Marks of Subject2: ");
    int subject2 = scan.nextInt();
    System.out.print("Enter Marks of Subject3: ");
    int subject3 = scan.nextInt();

    int total=subject1+subject2+subject3;
    double per=total/3;

    if(subject1>=40 && subject2>=40 && subject3>=40){
      System.out.print("Passed with "+per+" % and Grade: ");
      if(per>=75 && per<=100){
        System.out.println("Distinction");
      }else if(per>=60 && per<=74){
        System.out.println("First Class");
      }else if(per>=50 && per<=59){
        System.out.println("Second Class");
      }else if(per>=40 && per<=49){
        System.out.println("Just Passed");
      }
    }else{
      System.out.println("Fail");
    }
  }
}

