import java.util.*;

public class palindrome_test {

	private static Scanner userInput = new Scanner(System.in);
	private static String empty = "";
	
	/** A method which determines if a given number is a palindrome
	* @param num - the number which is being tested to determine if it is a palindrome
	* @return prints via StdOut the result of the test (method returns void). 
	*/
	public static void palindrome(int num) {
		String pal_string = Integer.toString(num);
		for(int i = (pal_string.length()-1); i>=0; i--) {
			empty += pal_string.charAt(i);
			 /* sets i to 1 less than the length of num (Java has zero-based indexing).
			 * loop will run as long as i is greater than or equal to 0
			 * i decrements by 1 for every iteration.
			 * empty String empty is composed of elements of num in reverse order (i starts from last element in num).
			 */
		}
		
		if(pal_string.equals(empty)) {
			// the reversed num is equal to the original num.
			System.out.println("Your number, " + num + ", is a palindrome");
		} else {
			// the reversed num is not equal to the original num.
			System.out.println("Your number, " + num + ", is not a palindrome");
		}
		empty = "";
		// resets String empty.
	}
	
	public static void main(String[] args) {
		try {
			while(true) {
				System.out.println("Please enter a positive integer.");
				palindrome(userInput.nextInt());
				System.out.println('\n');
			}
	}catch(java.util.InputMismatchException ex) {
		System.out.println("You must input an integer.");
		// integer holds max value of 2^32. Ensures InputMismatchException is not thrown.
	}
	}

}
