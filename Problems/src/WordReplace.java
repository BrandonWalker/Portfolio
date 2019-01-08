import java.util.*;
public class WordReplace {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			System.out.print("Input your sentence: ");
			String input = in.nextLine();
			/*
        	* basic word replace sad to happy case insensitive 
        	input = input.replaceAll("(?i)sad", "happy");
        	System.out.println(input);
			 */
			//change any word user wants with another they want from input sentence case insensitive  
			System.out.println("Input the word from your sentence that you would like to change: ");
			String toChange = in.nextLine();
			System.out.println("Input the word you want it to be changed to: ");
			String changed = in.nextLine();
			String output = input.replaceAll("(?i)"+toChange, changed);
			System.out.println(output);
		}
    }
}

