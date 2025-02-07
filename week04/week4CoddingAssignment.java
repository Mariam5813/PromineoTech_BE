package week04;

public class week4CoddingAssignment {

	public static void main(String[] args) {
		/*
		ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		(i.e. do not use ages[7] in your code). Print the result to the console.  

		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

		i. Make sure that there are 9 elements of type int in this new array.  

		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	*/
		
		System.out.println("\nCoding Step 1:");
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		
		// step 1a- define the first and last element of array
		int substr = ages[ages.length-1]-ages[0];
		System.out.println("The result of substracting first element of array 'ages' from the last is: "+ substr);
		
		// make sure that the array has 9 elements , comment out some elements to show that the index value is dynamic
		//int [] ages2 = {1,3,5,8,13,21,34,55,89};
		int [] ages2 = {1,3,5,8,13,21,34,/*55,89*/};
		if (ages2.length !=9) {
			System.err.println("Array should have 9 elements");
		}
		else {
			System.out.println(ages2.length + " is a right length of array");
			}
	
		// repeat the step 1a.
		int len=ages2.length;
		int substr1 = ages2[len-1]-ages2[0];
		System.out.println("The result of substracting first element of array 'ages2' from the last is: "+ substr1);
	
	//Show that using the index values for the elements is dynamic 
	   int sum=0;
	
	    for(int age:ages2)
	    {
	    	sum+=age;
	    }
	  
	    System.out.println("The average age for 'ages2' array is: "+ sum/len +" year old");
	
	/*
	2. Create an array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".

	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

	b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

	3. How do you access the last element of any array?
         
	4. How do you access the first element of any array?
  */
    //calculate the average number of letters per name
    System.out.println("\nCoding Step 2:");
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int sum1=0;
	for (String nm:names) {
		sum1+=nm.length();
	}
	
	double avr= sum1/names.length;
	System.out.println("The average number of letters per name is: "+avr);
	
	//concatenate all the names together, separated by spaces
	String allNames="";
	for (String nm:names) {
		allNames+=nm+" ";
		}
	System.out.println(allNames);
	
	// how to access last and first element of any array
	System.out.println("To access  the last element of any array use expression ArrayName[ArrayName.length-1]");
	System.out.println("The last element of  array names is "+ names[names.length-1]);
	System.out.println("To access  the first element of any array use expression ArrayName[0]");
	System.out.println("The last element of  array names is "+ names[0]);
	
	
//	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//
//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
  
    System.out.println("\nCoding Step 3:");
    
  //array of the length of each name
    int[] nameLengths = new int[names.length];
	for (int i=0; i<names.length; i++) {
		nameLengths[i]=names[i].length();
		System.out.print(nameLengths[i]+" ");
	}
	
  	
	
  	// sum of all elements in nameLength array
	int sum2=0;
	for (int nl:nameLengths) {
		sum2+=nl;
	}
		System.out.println("\nSum of all elements in nameLength array :" + sum2);
	
		/*
		 * takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
		 */
		
		System.out.println("\nCoding Step 4 - call the method #7-");
		String myResult=concatWords("Hello",5);
		System.out.println(myResult);
		
		/*Write a method that takes two Strings, firstName and lastName, and returns 
		   a full name (the full name should be the first and the last name as a String separated by a space).
		*/
		System.out.println("\nCoding Step 5: - call the method #8");
		System.out.println(fullName("Mariam","Trubitsyn"));
		
		
		/*
		 * method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 */
		System.out.println("\nCoding Step 6: - call the method #9");
		int[] array1= {10,20,30,40,50,60,70};
		int[] array2= {1,2,3,4,5,6,7};
		System.out.println(isSum(array1));
		System.out.println(isSum(array2));
		
		/*
		 *  method that takes an array of double and returns the average of all the elements in the array.
	    */
		System.out.println("\nCoding Step 7: - call the method #10");
		double[] array3= {11.25,20.35,30.45,40.45,50.55,60.65,70.75};
		double[] array4= {1.1,2.2};
		System.out.println(averageval(array3));
		System.out.println(averageval(array4));
		
		/* this method takes two arrays of double and returns true
		 * if the average of the elements in the first array is greater than the average of the elements in the second array.
		 */		
		System.out.println("\nCoding Step 8: - call the method #11");
		System.out.println(firstorsecond(array3,array4));
		System.out.println(firstorsecond(array4,array3));
		
		
		/*
		 * method willBuyDrink takes a boolean isHotOutside, and a double moneyInPocket, 
		 * and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */
		System.out.println("\nCoding Step 9: - call the method #12");
		System.out.println(willBuyDrink(true,10.00));
		System.out.println(willBuyDrink(true,11.10));
		System.out.println(willBuyDrink(false,12.00));
		System.out.println(willBuyDrink(false,5.00));
		
		
		/*
		 * My own method -this method takes a non-empty array, and returns true if there is a place to split 
		 * the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
		 * good example of array usage.
		 */
		System.out.println("\nCoding Step 10: - call the method #13");
		int[] myarr1= {2, 3, 4, 1, 2};
		int[] myarr2= {1,5,3,3};
		System.out.println(canBalance(myarr1));
		System.out.println(canBalance(myarr2));
		
	}
	
	
	
	/*
	7. Write a method that takes a String, word, and an int, n, as arguments and returns 
	   the word concatenated to itself n number of times.
	  	*/
	private static String concatWords(String myWord, int num) {
		String result="";
		for(int i=1; i<=num; i++) {
			result+=myWord;
		}
		return result;
	}


	/*
	8. Write a method that takes two Strings, firstName and lastName, and returns 
	   a full name (the full name should be the first and the last name as a String separated by a space).
	 */
		
	private static String fullName(String firstname, String lastname) {
		
		String fullname ="The full name of the student: "+firstname+" "+lastname;
		return fullname;
	}
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	private static boolean isSum(int[] myarr) {
		int sum=0;
		for(int arr:myarr) {
			sum+=arr;
		}
		if(sum>100)
			return true;
		return false;
	}
    
	/*
	 * 10. Write a method that takes an array of double and returns the average of all the elements in the array.
	 */

	private static double averageval(double[] myarray) {
		double sum=0;
		for (double num:myarray) {
			sum+=num;
		}
		return sum/myarray.length;
	}
	
	/*11. Write a method that takes two arrays of double and returns true
	 * if the average of the elements in the first array is greater than the average of the elements in the second array.
	 */
	
	private static boolean firstorsecond(double[] first, double[] second) {
		double sum_first=0, sum_second=0;
		for (double fst:first) {
			sum_first+=fst;
		}
		
		for (double scnd:second) {
			sum_second+=scnd;
		}
		
		if (sum_first/first.length>sum_second/second.length)
			return true;
		return false;

	}
	
	/*
	 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	 * and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 */
	
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket>10.50 )
			return true;
		return false;
	}
	
	/*
	 * 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	 * Write a method that takes a non-empty array, and return true if there is a place to split 
	 * the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
	 */
	
	private static boolean canBalance(int[] nums) {
		int sum=0;
		int leftside=0;
		
		for (int n:nums) {
			sum+=n;
		}
		if (sum%2==0)
		{
			for(int i=0; i<nums.length;i++) {
			     leftside+=nums[i];
				if (leftside==sum/2)
				{
					return true;
						} 
				}
		}
		
		return false;
		   
	}
	
}
