import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Masha
 * Enter in the console sentence of five words. 
 * a) display the longest word in the sentence
 * b) determine the number of its letters
 * c) bring the second word in reverse order
 * 
 */

public class Task_1_HW8 {

	public static List<String> longerstWordsInSentence(String[] arr) {
		//Find the longest words in the sentence
		int max_length = 0;
		//String longest_word = "";
		List<String> longest_words = new ArrayList<String>();
		for(int i = 0; i < arr.length; i++){
			if(max_length < arr[i].length()){
				max_length = arr[i].length();
			}
		}
		for(int i = 0; i < arr.length; i++){
			if(max_length == arr[i].length()) {
				longest_words.add(arr[i]);
			}
		}
		return longest_words;
	}
	
	public static String reverseLettersOrder(String word){
		String reverse_str = "";
		int length = word.length();
		for(int i = length -1; i >= 0; i--){
			reverse_str = reverse_str + word.charAt(i);
		}
		return reverse_str;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input sentence of 5 words: ");
		String str = sc.nextLine().replaceAll("[\\.\\,\\?\\!]{1,}", "")
				.replaceAll("[\\s]{2,}", " ");
		//System.out.println("String after replacement: "+str);
		
		String[] arr = str.split(" ");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		if(arr.length >= 5){
			List<String> long_words = longerstWordsInSentence(arr);
			System.out.println("The longest words in the sentence: ");
			System.out.println(long_words);
			//Determine the number of letters of max word
			System.out.println("The number of letters of the longest word is " + long_words.get(0).length());
			
			//Bring the second word in reverse order
			String reverse = reverseLettersOrder(arr[1]);
			System.out.println("The reverse order of second word \"" + arr[1] + "\" is: " + reverse);
		}else{
			System.out.println("The count words in a sentence is less 5!!!");
		}
		sc.close();
	}

}
