package homework9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputOutput {

	public static void main(String[] args) {
		String filename = "D://av3//file1.txt";
		FileReader fr;
		BufferedReader br = null;
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<String> list = new ArrayList<String>();

		try {
			while ((filename = br.readLine()) != null) {
				list.add(filename);
				System.out.println(filename);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		int numberOfLines = list.size();
		System.out.println("Number of lines " + numberOfLines);

		int max = list.get(0).length();
		int imax = 0;
		int i = 0;
		while (i < list.size()) {
			if (list.get(i).length() > max) {
				max = list.get(i).length();
				imax = i;
			}
			i++;
		}
		System.out.print("Maximum length is " + max);
		System.out.println(" is in line " + (imax + 1));
		System.out.println(list.get(imax));
		String string1 = "Oleh";
		String string2 = "23.08.1994";
		System.out.println("Name " + string1);
		System.out.println("Birthday date " + string2);

		String filename2 = "D://av3//file2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(filename2);
			bw = new BufferedWriter(fw);
			
			bw.write("Number of lines: " + numberOfLines);
			bw.newLine();
			bw.write("The longest line is: " + list.get(imax));
			bw.newLine();
			bw.write("Name: " + string1);
			bw.newLine();
			bw.write("Birthday date: " + string2);
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
