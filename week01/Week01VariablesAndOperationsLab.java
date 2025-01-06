//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week01 LAB");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
          int seatAv=4; 
		
		// 2. Create a variable to hold the cost of groceries at checkout

        double cost=45.23;		
		// 3. Create a variable to hold a person's middle initial

        char midlle='a';	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
        boolean isHot=true;
        boolean isCold=false;
		
		// 5. Create a variable to hold a customer's first name
        String firstName="Mariam";
		
		// 6. Create a variable to hold a street address
		String address= "11 Oneida Rd.";

		// 7. Print all variables to the console
	   System.out.println(seatAv);	
	   System.out.println(cost);
	   System.out.println(midlle);
	   System.out.println(isHot);
	   System.out.println(isCold);
	   System.out.println(firstName);
	   System.out.println(address);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	           seatAv-=2;
	           System.out.println(seatAv);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
	           cost+=2.15;
	    	   System.out.println(cost);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
	    	   midlle='A';
	    	   System.out.println(midlle);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
                    isHot=!isHot;
                    System.out.println(isHot);
                    

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
                   String fullName=firstName+" " +	midlle+ " "+"Ustian";
                   System.out.println(fullName);
                   
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
              System.out.println("Ladies and Gents, please meet Mrs. "+fullName);
              System.out.println("she lives at "+address);
              
		
		
	}
	
	
}