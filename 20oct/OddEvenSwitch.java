//program to check odd even using switch

import java.util.*;
 //declaring class
 class OddEvenSwitch
 {
	 //main started
    public static void main(String args[])
	{
        int choice;

		 //declaring the object of scanner
        Scanner in = new Scanner(System.in);
		
		 //taking input
        System.out.println("Enter an Integer");
        choice = in.nextInt();
		
		//switch case started
        switch(choice%2) 
		{
            case 0:
                    System.out.println(choice+ " is a EVEN Number");
                    break;
            case 1:
                    System.out.println(choice+ " is ODD Number")
        }
		//end of switch
    }
	//end of main
}
//end of execution