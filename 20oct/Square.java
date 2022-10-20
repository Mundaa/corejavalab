// Java Program to Find Square of a Number

import java.util.Scanner;

//declaring class
 class Square 
 {
	//main started
	public static void main(String[] args) 
	{
		int num, square;
		
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.print("Enter any Number : ");
		num = sc.nextInt();		
		
		//condition check
		square = num * num;
		
		System.out.println("\n The Square of a Number  " + num + "  =  " + square);
	}
	//end of main
}
//end of execution