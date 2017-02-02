package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Collection {

	public static void main(String[] args) {
		
		List<Integer> myCollection = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0; i < 10; i++){
			myCollection.add(i, rand.nextInt(30));
		}
		System.out.println("myCollection:");
		System.out.println(myCollection);
		
		//Find and save in list newCollection all positions of element 
		//more than 5 in the collection. Print newCollection
		List<Integer> newCollection = new ArrayList<Integer>();
		for(int i = 0; i < myCollection.size(); i++){
			newCollection.add((Integer) myCollection.get(i));
		}
		for(int i = 4; i<myCollection.size()-1; i++){
			newCollection.add((Integer) myCollection.get(i+1));
		}
		System.out.println("NewCollection:");
		System.out.println(newCollection);
		
		//Remove from collection myCollection elements, which are greater then 20. Print result
		for(int i = 0; i < newCollection.size(); i++){
			if((Integer)newCollection.get(i) > 20){
				newCollection.remove(i);
				i--;
			}
		}
		System.out.println("NewCollection after remove elements: ");
		System.out.println(newCollection);
		
		//Insert elements 1, -3, -4 in positions 2, 8, 5. Print result 
		//in the format: “position – xxx, value of element – xxx”
		if(newCollection.size()>= 2){
			newCollection.add(1, 1);
			}
		if(newCollection.size()>= 5){
			newCollection.add(4, -4);
		}
		if(newCollection.size()>= 8){
			newCollection.add(7, -3);
		}
		System.out.println("NewCollection after insert elements:");
		for(int i = 0; i < newCollection.size(); i++){
			System.out.println("position - "+ (i+1) + ", value of element - " + newCollection.get(i));
		}
		//Sort and print Collection
		Collections.sort(newCollection);
		System.out.println("NewCollection is sorted:");
		System.out.println(newCollection);
		
	}

}
