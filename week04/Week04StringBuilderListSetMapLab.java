package week04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder

				System.out.println("\nQuestion 1:");
				StringBuilder sb= new StringBuilder();
				for (int i=0; i<10; i++) {
					sb.append(i);
					if (i<9) {
					sb.append('-');
					}
				}
				System.out.println(sb);
				
				
				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
				System.out.println("\nQuestion 2:");	
				List<String> diffLength = new ArrayList <String>();
				diffLength.add("It is a first string");
				diffLength.add("It's  a second string");
				diffLength.add("This is a 3rd string");
				diffLength.add("This is a string #4");
				diffLength.add("This is a fifth and final string");
				for (String str:diffLength) {
					System.out.println(str);
				}
				
				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
				System.out.println("\nQuestion 3:");
				System.out.println("The shortest string is: " +shortestString(diffLength));
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched

				System.out.println("\nQuestion 4:");
					
				List<String> swapped = SwitchElements(diffLength);
				for (String string : swapped) {
					System.out.println(string);
				}
				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
				
				System.out.println("\nQuestion 5:");
				String test=concatString(swapped);
				System.out.println(test);
				
				 // 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
				System.out.println("\nQuestion 6:");

		          List<String> newlist=searchString(diffLength,"#4");
		          System.out.println(newlist);
	 
		          
		       // 7. Write and test a method that takes a list of integers 
					//			and returns a List<List<Integer>> with the following conditions specified
					//			for the return value:
					//		a. The first List in the returned value contains any number from the input list 
					//			that is divisible by 2
					//		b. The second List contains values from the input list that are divisible by 3
					//		c. The third containing values divisible by 5, and 
					//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		          
		        System.out.println("\nQuestion 7:");
		  		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);

		  		List<List<Integer>> sortedNumbers = intList(numbers);
		  		int count = 1;
		  		for (List<Integer> list : sortedNumbers) {
		  			for (Integer number : list) {
		  				System.out.println(number);
		  			}
		  			if (count < sortedNumbers.size()) {
		  				System.out.println("Next list ----------");
		  			}
		  			count++;
		  		}
		   
		  		
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string

		  		System.out.println("\nQuestion 8:");
				List<Integer> stringsLengths = lenOfStrings(diffLength);
				for (Integer i : stringsLengths) {
					System.out.println(i);
				}
                System.out.println(stringsLengths);
                
                
            //  9. Create a set of strings and add 5 values
            	System.out.println("\nQuestion 9:"); 
            	Set<String> setofStrings = new HashSet<String>();
            	setofStrings.add("How");
            	setofStrings.add("What");
            	setofStrings.add("Where");
            	setofStrings.add("Why");
            	setofStrings.add("today");
        		for (String word : setofStrings) {
        			System.out.println(word);
        		}
                System.out.println(setofStrings);
                
                
            //10.
                System.out.println("\nQuestion 10:");  
                System.out.println(charInString(setofStrings,'y'));
		
                
             // 11. Write and test a method that takes a set of strings 
        	//			and returns a list of the same strings
                
                System.out.println("\nQuestion 11:");
                
                System.out.println(listOfStrings(setofStrings));
                
                
                
             // 12. Write and test a method that takes a set of integers 
        		//			and returns a new set of integers containing only even numbers 
        		//			from the original set
        		System.out.println("\nQuestion 12:");
        		Set<Integer> integerSet = new HashSet<Integer>();
        		integerSet.add(3);
        		integerSet.add(4);
        		integerSet.add(8);
        		integerSet.add(33);

        		Set<Integer> extractedEvens = evenNum(integerSet);
        		for (Integer number : extractedEvens) {
        			System.out.println(number);
        		}     
                System.out.println(extractedEvens);
                
                
                
             // 13. Create a map of string and string and add 3 items to it where the key of each
        		// 			is a word and the value is the definition of the word
        		System.out.println("\nQuestion 13:");
        		Map<String, String> dictionary = new HashMap<String, String>();
        		dictionary.put("The Set Interface", "A Set is a Collection that cannot contain duplicate elements");
        		dictionary.put("The List Interface", "A List is an ordered Collection , that may contain duplicate elements");
        		dictionary.put("The Map Interface", "A Map is an object that maps keys to values, it cannot contain duplicate keys");
        		System.out.println(dictionary);
        		
        		
        		
        		// 14. Write and test a method that takes a Map<String, String> and a string 
        		// 			and returns the value for a key in the map that matches the
        		// 			string parameter (i.e. like a language dictionary lookup)
        		System.out.println("\nQuestion 14:");
//        		String value = findWord(dictionary, "Kiwi");
//        		System.out.println("Dictionary Result for 'Kiwi': " + value);
        		System.out.println(findWord(dictionary,"The List Interface" ));
        	
                
        		System.out.println("\nQuestion 15:");
        		Map<Character, Integer> counts = countStartingLetters(listOfStrings(setofStrings));
        		for (Character character : counts.keySet()) {
        			System.out.println(character + " - " + counts.get(character));
        		}

                
                
		/*
		 * additional  stuff for lesson 4 
		 */
		System.out.println("\nAdditionl q.1:");
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Alice");
		listOfNames.add("Bob");
		listOfNames.add("Charlie");
		listOfNames.add("Diana"); 
		listOfNames.add("Max"); 
		listOfNames.add("Alex"); 
		//System.out.println(listOfNames);
		List<String> result1 = halftheList(listOfNames);
		System.out.println(result1);
		
		System.out.println("\nAdditionl q.2:");
		Map<String,String> mapOfNames = Map.of( "Alice", "Apple", "Bob", "Banana", "Anna", "Apricot", "Charlie", "Cherry","andrew","blah" );
	    List<String> result = returnValuesForKeysStartingWithA(mapOfNames);
	    System.out.println(result);
	}	
	
		
	
	public static List<String> returnValuesForKeysStartingWithA(Map<String, String> dictionary){
                 List<String> resultList = new ArrayList<>();

                 Set<String> keySet = dictionary.keySet();
                 //System.out.println(dictionary.keySet());
                 for(String key : keySet) {
                	if(key.toLowerCase().charAt(0)=='a') { 
                		
                		resultList.add(dictionary.get(key));                	}
                 }
		
		return resultList;
		
	}
	
	
	// 15. Write and test a method that takes a List<String> 
			//			and returns a Map<Character, Integer> containing a count of 
			//			all the strings that start with a given character
			
	public static Map<Character, Integer> countStartingLetters(List<String> list) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();

		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}

		return results;
	}
	// 14. Write and test a method that takes a Map<String, String> and a string 
			// 			and returns the value for a key in the map that matches the
			// 			string parameter (i.e. like a language dictionary lookup)

     public static String findWord(Map<String,String> dict, String word) {
    	    	          
    	 for (String key: dict.keySet()) {
    		 if(key.equals(word)) {
    			return dict.get(key);
    		 }
    	
    	 }

    	 return "";
     }
	
	
	// 12. Write and test a method that takes a set of integers 
			//			and returns a new set of integers containing only even numbers 
			//			from the original set
	
	public static Set<Integer> evenNum(Set<Integer> myEven){
		Set<Integer> results= new HashSet<Integer>();
		for (Integer num :myEven) {
			if (num%2==0) {
				results.add(num);
			}
		}
		return results;
	}
	
	
	// 11. Write and test a method that takes a set of strings 
			//			and returns a list of the same strings
	
	public static List<String> listOfStrings(Set<String> mystr){
		List<String> mylist = new ArrayList<>();
		for (String lst: mystr) {
			mylist.add(lst);
		}
		return mylist;
	}
	
	// 10. Write and test a method that takes a set of strings and a character 
			//			and returns a set of strings consisting of all the strings in the
			// 			input set that start with the character parameter.

	
	public static Set<String> charInString(Set<String> mystr, char mychar){
	     Set<String> result = new HashSet<String>();
	     for (String str : mystr) {
	         if (str.charAt(0)==mychar) {
	        	 result.add(str);
	         }
	     }
	 	return result;
	}
	
	// Method 8:
	public static List<Integer> lenOfStrings(List<String> listStr){
		List<Integer> result= new ArrayList<>();
		for (String str:listStr) {
			result.add(str.length());
		}
		return result;
	}
	
	
	       
	 // Method 7:
		public static List<List<Integer>> intList(List<Integer> intlist ){
			
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			result.add(new ArrayList<>());
			result.add(new ArrayList<>());
			result.add(new ArrayList<>());
			result.add(new ArrayList<>());
			
			for (Integer num : intlist) {
				if (num%2==0) {
					result.get(0).add(num);
				} else if (num%3==0) {
					result.get(1).add(num);
				} else if (num%5==0) {
					result.get(2).add(num);
				} else if (num%2!=0 && num%3!=0 && num%5!=0) {
					result.get(3).add(num);
				}
			}
			return result;
		}
			

		

			
			
 // Method 6:
	public static List<String> searchString(List<String> list, String str){
		
		List<String> result = new ArrayList<>();
		for (String l:list) {
			if (l.contains(str)) {
				result.add(l);
			}
		}
		return result;
	}
	
	// Method 5:
				public static String concatString(List<String> mystring) {
					StringBuilder sb = new StringBuilder();
					int counter=1;
					for (String str:mystring) {
						 sb.append(str);
						 if (counter<mystring.size()) {
							 sb.append(',');
							 
						 }
						counter++;
					}
					return sb.toString();
				
				}
		
	
	
	
	// Method 4:
			public static List<String> SwitchElements(List<String> myList) {
			
				
				String temp=myList.get(0);
				myList.set(0, myList.get(myList.size() - 1));
				myList.set(myList.size() - 1, temp);
			
			   return myList;
		}
		
	
	
	 // Method 3:
		public static String shortestString(List<String> myList) {
		String shortest=myList.get(0);
		for(String str:myList) {
			if (str.length()<shortest.length()) {
				shortest=str;
			}
		}
		return shortest;
	}
	
	
	
	
	
	public static List<String> halftheList(List<String> listOfNames1) {
		List<String> resultList = new ArrayList<>();
		for (int i=0; i<listOfNames1.size(); i++) {
			
			if (!(i%2==0)) {
				resultList.add(listOfNames1.get(i));
				//System.out.println(listOfNames1.get(i));
			}
		}
		return resultList;
	}
}


