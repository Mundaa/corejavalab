//program to check oldest and youngest

import java.util.*;
//declaring class
class OldestYoungest
{
	//main started
	public static void main(String args[])
	{
	  int age1,age2,age3;
	  
	  //declaring the object of scanner
	  Scanner sc = new Scanner(System.in);
	  
	  //taking input
	  System.out.println("Enter the age of three person:");
	  age1 = sc.nextInt();
	  age2 = sc.nextInt();
	  age3 = sc.nextInt();
	  
	  //checking oldest person
	  if((age1>age2) && (age1>age3))
	   System.out.println(age1+"is the oldest");
	  else if(age2>age3)
	    System.out.println(age2+"is the oldest");
		
		else
		 System.out.println(age3+"is the oldest");
		 
		 
		 //checking youngest person
		 if((age1<age2) && (age1<age3))
		   System.out.println(age1+"is the youngest");
		 else if(num2<num3)
		    System.out.println(age2+"is the youngest");
		 else 
		    System.out.println(age3+"is the youngest");
		//end of ifelse part
	}
	// end of main
}
//end of execution