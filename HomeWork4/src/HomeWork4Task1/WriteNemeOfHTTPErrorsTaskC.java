package HomeWork4Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Maria Bzhezovska
 * HomeWork 4 Task C.
 * Read number of HTTP Error (400, 401,402, ...) 
 * and write the name of this error (Declare enum HTTPError).
 */
public class WriteNemeOfHTTPErrorsTaskC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Input HTTP Error Code from 400 to 405 (include): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int errorCode = Integer.parseInt(br.readLine());
		switch(errorCode){
		case 400:
			System.out.println("Error's Name: " + HTTPError.BADREQUEST); break;
		case 401:
			System.out.println("Error's Name: " + HTTPError.UNAUTORIZED); break;
		case 402:
			System.out.println("Error's Name: " + HTTPError.PAIMENTREQIRED); break;
		case 403:
			System.out.println("Error's Name: " + HTTPError.FORBIDDEN); break;
		case 404:
			System.out.println("Error's Name: " + HTTPError.NOTFOUND); break;
		case 405:
			System.out.println("Error's Name: " + HTTPError.METHODNOTALLOWED); break;
		default:
			System.out.println("Incorrect Error Code! "); break;
		}
	}
}
