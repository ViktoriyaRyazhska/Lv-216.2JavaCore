package Lesson5Task1;

import java.util.Random;

public class ArrayL5T1 {
	
	int [] array = new int [10];
	
	public ArrayL5T1() {
		Random random = new Random();
		for(int i = 0; i< 10; i++){
			this.array[i] = random.nextInt();
		}
	}
	
	public ArrayL5T1(int [] array){
		for(int i = 0; i< 10; i++){
			this.array[i] = array[i];
		}
	}
	// Return the biggest element of array
	public int maxElementOfArray(){
		int maxEl = this.array[0];
		for(int i = 1; i < this.array.length; i++){
			if(maxEl < this.array[i]){
				maxEl = this.array[i];
			}
		}
		return maxEl;
	}
	
	//Return the sum of positive numbers in the array
	public int sumPositiveElementsOfArray(){
		int sum = 0;
		for(int i = 0; i < this.array.length; i++){
			if(this.array[i] > 0){
				sum += this.array[i];
			}
		}
		return sum;
	}
	
	//Return the amount of negative numbers in the array
	public int amountOfNegativeElementsOfArray(){
		int amount_negative = 0;
		for(int i = 0; i < this.array.length; i++){
			if(this.array[i] < 0){
				amount_negative++;
			}
		}
		return amount_negative;
	}
	
	//Return the amount of positive numbers in the array
		public int amountOfPositiveElementsOfArray(){
			int amount_positive = 0;
			for(int i = 0; i < this.array.length; i++){
				if(this.array[i] > 0){
					amount_positive++;
				}
			}
			return amount_positive;
	}
		
	//Return what values there are more: negative or positive or equivalent?
		public String morePositiveElementsOrNegative(){
			int negative = amountOfNegativeElementsOfArray();
			int positive = amountOfPositiveElementsOfArray();
			if(positive == negative){
				return "equivalent";
			}else if(positive > negative){
				return "positive";
			}else return "negative";
		}
}
