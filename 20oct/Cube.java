// Java Program to Find Cube of a Number
import java.util.Scanner;
//declaring class
 class Cube
 {

	//main started
	public static void main(String args[]) 
	{
		int number, cube;
		
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.print("Enter any Number : ");
		number = sc.nextInt();		
		
		//condition check
		cube = number * number * number;
		
		System.out.println("\n The Cube of a Number  " + number + "  =  " + cube);
	}
	//end of main
}
//end of execution