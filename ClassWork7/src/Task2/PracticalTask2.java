package Task2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PracticalTask2 {

	public static void main(String[] args) {
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		Random rand = new Random();
		
		//Add to employeeMap seven pairs (ID, name) of some persons. 
		//Display the map on the screen.
		for(int i = 0; i <7; i++){
			employeeMap.put(rand.nextInt(5000), "name_"+rand.nextInt(10000));
		}
		System.out.println("Entry: ");
		for (HashMap.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Ask user to enter ID, then find and write corresponding name from your map. 
		//If you can't find this ID - say about it to user (use function containsKey()).
		System.out.println("Input ID of User: ");
		Scanner sc = new Scanner(System.in);
		int user_id = Integer.parseInt(sc.nextLine());
		if(employeeMap.containsKey(user_id)){
			System.out.println("The name of User with ID = " + user_id + " : "+ employeeMap.get(user_id));
		}else{
			System.out.println("There is no User with that ID!!!");
		}
		
		//Ask user to enter name, verify than you have name in your map and write corresponding ID. 
		//If you can't find this name - say about it to user (use function containsValue()).
		System.out.println("Input User_Name: ");
		String user_name = sc.nextLine();
		if(employeeMap.containsValue(user_name)){
			for(HashMap.Entry<Integer, String> entry: employeeMap.entrySet()){
	            if(user_name.equals(entry.getValue())){
	            	System.out.println("The ID of User with name = " + user_name + " : "+entry.getKey());
	            }
			}
		}else{
			System.out.println("There is no User with that name!!!");
		}

		sc.close();
	}

}
