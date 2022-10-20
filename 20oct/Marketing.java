/*
program:10% discount to the user whose bill is greater than 2000
@author:Arjun Kumar
@date:20.10.2022
*/

import java.util.*;
//declaring class
class Marketing
{
	//main started
	public static void main(String args[])
	{
	   float total,dis,quantity,price;
	   
	   //declaring the object of scanner
	   Scanner sc = new Scanner(System.in);
	   
	   //taking input
	   System.out.println("Enter the Quantity:");
	   quantity = sc.nextFloat();
	   
	   price=540*quantity;
	   
	   System.out.println("Total price is:"+price);
	   
	   if(price>=2000)
	   {
	      dis=(price*10)/100;
		  total=price-dis;
		  System.out.println("The paid amount:"+total);
	   }
	   //end of if part
	   
	   else
	   System.out.println("The paid amount :"+price);
       //end of else part
	}
	// end of main
}
//end of execution