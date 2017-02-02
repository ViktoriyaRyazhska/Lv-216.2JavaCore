import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name surname and patronymic: ");
		String nameFull = sc.nextLine();
		System.out.println(nameFull);
		String[] arr = nameFull.split(" ");
		for(String s: arr){
			System.out.println(s);
		}
		System.out.println("The surname and initials: " + arr[1]+ " " + arr[0].charAt(0) + "." + arr[2].charAt(0) + ". ");
		System.out.println("The name is " +arr[0]);
		System.out.println("The name, middle name and last name: " + arr[0] + " " + arr[2] + " " + arr[1]);
		
		sc.close();
	}

}
