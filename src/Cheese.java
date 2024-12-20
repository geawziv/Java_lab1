package bsu.rfe.java.group6.lab1.Pavlova.varB3;

public class Cheese extends Food {

	public Cheese() {
		super("Сыр");
	}

	public void consume() {
		System.out.println(this + " съеден");
	}

	public int calculateCalories() {
		return 250;
	}
}
