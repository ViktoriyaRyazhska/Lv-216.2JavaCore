package Task3ClassWork10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Masha
 * Prepare mytext.txt file with a lot of text inside.
 * Read context from file into array of strings.
 * Each array item contains one line from file.
 * Complete next tasks:
   1) count and write the number of symbols in every line.
   2) find the longest and the shortest line. 
   3) find and write only that lines, which consist of word «var»
 *
 */
public class MainFileInputOutputTask3CW10 {
	
	public static void lengthOfEachLines(List<String> list_of_strings) {
		for(int i = 0; i < list_of_strings.size(); i++){
        	System.out.println("the lehgth of " + (i+1) + " = " + list_of_strings.get(i).length());
        }
	}
	
	public static void LongestAndShortestLines(List<String> list_of_strings) {
		int min_line_count = list_of_strings.get(0).length();
        int max_line_count = list_of_strings.get(0).length();
        int index_min_string_count = 0;
        int index_max_string_count = 0;
        
        for(int i = 1; i < list_of_strings.size(); i++){
        	if(min_line_count > list_of_strings.get(i).length()){
        		min_line_count = list_of_strings.get(i).length();
        		index_min_string_count = i;
        	}
        	if(max_line_count < list_of_strings.get(i).length()){
        		max_line_count = list_of_strings.get(i).length();
        		index_max_string_count = i;
        	}
        }
        System.out.println("The longest line (has " + max_line_count + " symbols): " + list_of_strings.get(index_max_string_count));
        System.out.println("The shortest line (has " + min_line_count + " symbols): " + list_of_strings.get(index_min_string_count));
	}
	
	public static void wordContainsinLine(List<String> list_of_strings, String word) {
		String s = word;
        int count = 0;
        System.out.println("Lines which contains word 'var': ");
        for(int i = 0; i < list_of_strings.size(); i++){
        	if(list_of_strings.get(i).contains(s)){
        		System.out.println(list_of_strings.get(i));
        		count++;
        	}
        }
        if(count == 0){
        	System.out.println("There is no any string which contains word 'var'!!!");
        }
	}
	
	public static void main(String[] args) throws IOException {
        //String line;
        File file_name = new File("myText.txt");
        BufferedReader fin = new BufferedReader(new FileReader(file_name));
        List<String> list_of_strings = new ArrayList<String>();
        String line = fin.readLine();
        while(line != null){
        	list_of_strings.add(line);
        	line = fin.readLine();
        }
        //1) count and write the number of symbols in every line.
        lengthOfEachLines(list_of_strings);
        
        //2) find the longest and the shortest line. 
        LongestAndShortestLines(list_of_strings);
        
        //3) find and write only that lines, which consist of word «var»
        wordContainsinLine(list_of_strings, "var");
	}

}
