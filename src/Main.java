package bsu.rfe.java.group6.lab1.Pavlova.varB3;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0;
	
		for (String arg: args) {
				String[] parts = arg.split("/");
				if (parts[0].equals("Cheese")) {
					breakfast[itemsSoFar] = new Cheese();
				} else if (parts[0].equals("Apple")) {
					breakfast[itemsSoFar] = new Apple(parts[1]);
				} else	if (parts[0].equals("Milk")) {
					breakfast[itemsSoFar] = new Milk(parts[1]);
				}
				itemsSoFar++;
		}
		
	Arrays.sort(breakfast, new FoodComparator());
		
	int calories = 0;
	for (Food item: breakfast)
	if (item!=null) {
		calories += item.calculateCalories();
		item.consume();
	}
	else break;
	System.out.println(calories + " калорий");
	System.out.println("Всего хорошего!");
	}
}
