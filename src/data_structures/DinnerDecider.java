package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {
	
	
	public static void main(String[] args) {
		ArrayList<String> randomFood = new ArrayList<String>();
		randomFood.add("Burgers");
		randomFood.add("Sushi");
		randomFood.add("Spaghetti");
		randomFood.add("Bacon");
		int r = new Random().nextInt(randomFood.size()+1);
		System.out.println("You should eat "+randomFood.get(r)+" tonight.");
	}
}
