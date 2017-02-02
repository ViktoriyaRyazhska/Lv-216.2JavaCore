import java.util.Scanner;

/**
 * 
 * @author Masha
 * Enter a sentence that contains the words between more than one space. 
 * Convert all spaces, consecutive, one. For example, if we introduce the sentence 
 * "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
 */

public class Task2_Sentence_HW8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input sentence with more than one space between words: ");
		String str = sc.nextLine().replaceAll("[\\s]{2,}", " ");
		System.out.println("String after replacement: "+str);
		sc.close();
	}

}
