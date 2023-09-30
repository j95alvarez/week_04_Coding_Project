package week04;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		// 1. Created an array of int called ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// 1a. Programmatically subtract the value of the first element in the array 
		// from the value in the last element of the array (i.e. do not use ages[7] in your code). 
		// Print the result to the console.  
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("1a. The result of subtracting the first element from the last is: " + result);
		
		// 1b. Create a new array with 9 elements (one more than the ages array)  
		// Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] new_ages = {3, 9, 23, 64, 2, 8, 28, 93, 82};
		result = new_ages[new_ages.length - 1] - new_ages[0];
		System.out.println("1b. The result of subtracting the first element from the last is: " + result);
		
		// 1c. Use a loop to iterate through the array and calculate the average age. Print the result 
		// to the console.
		int sum = 0;
		for (int age : ages) 
			sum += age;
		
		int averageAge = sum / ages.length;
		System.out.println("1c. The averge age is: " + averageAge);
		
		// 2. Create an array of String called names that contains the following 
		// values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		// 2a. Use a loop to iterate through the array and calculate the average 
		// number of letters per name. Print the result to the console.
		
		sum = 0; // Reset sum variable to 0
		int averageNumberOfLetters = 0;
		
		for (String name : names) 
			sum += name.length();
		averageNumberOfLetters = sum / names.length;
		System.out.println("2a. The averge number of letters per name is: " + averageNumberOfLetters);
		
		// 2b. Use a loop to iterate through the array again and concatenate all 
		// the names together, separated by spaces, and print the result to the console.
		String concatenatedNames = "";
		
		for (String name : names)
			concatenatedNames += (name + " ");
		System.out.println("2b. The concatenated names is: " + concatenatedNames);
		
		// 3. How do you access the last element of any array?
		// Answer: you use the length of the array - 1 (since arrays index starts at 0) to access the last element in the array
		System.out.println("3. How do you access the last element of any array? ages[ages.length - 1]");
		
		// 4. How do you access the first element of any array?
		// Answer: you use array_name[0]
		System.out.println("4. How do you access the first element of any array? ages[0]");
		
		// 5. Create a new array of int called nameLengths. Write a loop to iterate over 
		// the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		
		// Iterate through array and save the lengths of each name in names array into the nameLengths array
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.print("5. Lengths of names array saved in nameLengths array: ");
		for (int len : nameLengths)
			System.out.print(len + " ");
		System.out.println();
		
		// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the 
		// elements in the array. Print the result to the console.
		result = 0; // Reset sum variable back to 0;
		
		// Iterate through array to calculate the sum of all elements
		for (int len : nameLengths)
			result += len;
		
		System.out.println("6. Sum of all elements in nameLengths array: " + result);
		
		
		// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself
		// n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.print("Enter word to concatenate to itself: ");
		String word = in.nextLine();
		System.out.print("Enter the number of times: ");
		int times = in.nextInt();
		String question7Result = wordConcatenatedToItself(word, times);
		System.out.println("7. The concatenated result is: " + question7Result);
		
		in.nextLine(); // Clearing buffer		
		
		// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be 
		// the first and the last name as a String separated by a space).

		
		System.out.print("Enter your first name: ");
		String fName = in.nextLine();
		System.out.print("Enter your last name: ");
		String lName = in.nextLine();
		
		System.out.println("8. The concatenated result is: " + fullName(fName, lName));

		// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("9. Is the sum of the array greater than 100? " + isSumGreaterThan100(ages));
		
		// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] numbers = {3.0, 9.0, 23.0, 64.0, 2.0, 8.0, 28.0, 93.0};
		System.out.println("10. The average of all elements in the array is: " + calcAverageOfArray(numbers));
		
		// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the 
		// first array is greater than the average of the elements in the second array.
		double[] arr1 = {23.5, 43.7, 1.5, 3.9};
		double[] arr2 = {3.9, 43.90, 43.6, 10.0, 3.1};
		System.out.println("11. Is average of arr1 greater than arr2? " + compareTwoArrays(arr1, arr2));
		
		// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		// and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 15.49;
		System.out.println("12. Will buy drink? " + willBuyDrink(isHotOutside, moneyInPocket));
		
		// 13. Calculate the monthly car payment
		System.out.println("Enter total loan amount: ");
		double principle = in.nextDouble();
		
		System.out.println("Enter interest rate (in decimal): ");
		double rate = in.nextDouble();
		
		System.out.println("Enter number of years of the loan: ");
		int years = in.nextInt();
		System.out.println("13. The monthly car payments is: " + String.format("%.2f", calcMontlyCarPayment(principle, rate, years)));
		
	}
	

	/**
	 * 7. Concatenates the word passed in by the number of time the user specifies
	 * @param word		String user wants to concatenate with itself
	 * @param times		Number of times to perform concatenation
	 * @return			Word that is concatenated to itself by the number of times specified
	 */
	public static String wordConcatenatedToItself(String word, int times) {
		String result = "";
		
		// Concatenate word the number of times indicated
		for (int i = 0; i < times; i++)
			result += word;
		
		return result;
	}
	
	/**
	 * 8. Concatenates the full name of the user
	 * @param fName		First name of the user
	 * @param lName		Last name of the user
	 * @return			Full name that is concatenated together
	 */
	public static String fullName(String fName, String lName) {
		return fName + " " + lName;
	}
	
	/**
	 * 9. Iterates and sums up all ages in the ages array and checks to see if it is greater than 100
	 * @param ages		Array of ages
	 * @return			True if the sum of all ages is greater than 0
	 */
	public static boolean isSumGreaterThan100(int[] ages) {
		int result = 0;
		
		// Iterate through the array and sum up all ages
		for (int age : ages) 
			result += age;
		
		return result > 100; 
	}
	
	/**
	 * 10. Calculates the average of the elements in the array
	 * @param numbers		Array of doubles
	 * @return				Average of all elements in array
	 */
	public static double calcAverageOfArray(double[] numbers) {
		int sum = 0;
		
		// Iterate through array and sum up all elements
		for (int i = 0; i < numbers.length; i++)
			sum += numbers[i];
		
		// Calculate the average of the elements in the array
		return sum / numbers.length;
	}
	
	/**
	 * 11. Calculates the average of 2 double arrays and compares if average of the elements in arr1 is greater than the average of elements in arr2
	 * @param arr1		Array of doubles
	 * @param arr2		Array of doubles
	 * @return			True if average of elements in arr1 is greater than average of elements in arr2 
	 */
	public static boolean compareTwoArrays(double[] arr1, double[] arr2) {
		double sum1 = 0;
		double sum2 = 0;
		
		// Calculate sum of arr1
		for (double num : arr1)
			sum1 += num;
		
		// Calculate sum of arr2
		for (double num : arr2)
			sum2 += num;
		
		// Calculate average and compare to return the result
		return (sum1 / arr1.length) > (sum2 / arr2.length);
	}
	
	/**
	 * 12. Calculates to see if user will by a drink
	 * @param isHotOutside		True if it is hot outside
	 * @param moneyInPocket		Amount of money user has in their pocket
	 * @return					True if it is hot outside AND if the money in user's pocket is more than 10.50
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket > 10.50);
	}


	/**
	 * 13. Calculates the monthly car payment. I worte this method because I want to purchase a new vehicle and want to calculate the monthly payments
	 * that I would need to be making
	 * @param principle			Total amount of the loan
	 * @param rate				Total amount of interest (in decimal form)
	 * @param t					Number of years of the loan
	 * @return					Monthly car payment amount
	 */
	public static double calcMontlyCarPayment(double principle, double rate, double t) {
		int n = 12; // number of payments per year
		double num = principle * (rate / n);
		double denom = (1 - Math.pow((1 + (rate / n)), -1 * n * t));
		
		
		return num / denom;
	}
}
