package JavaCollections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food=new ArrayList<>();
		
		food.add("pizza");
		food.add("burger");
		food.add("Poha");
		food.add("sandwich");
		food.add("Snacks");
		
		System.out.println("food items are: down below");
		for(String i: food)
		System.out.println(i);
		food.set(1, "FrenchFries");
		System.out.println(food);
		
		System.out.println(food.get(2));
		food.remove(2);
		System.out.println(food);

	}

}
