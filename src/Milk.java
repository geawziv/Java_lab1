package bsu.rfe.java.group6.lab1.Pavlova.varB3;

public class Milk extends Food {
	private String fat;
	
	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	public Milk(String fat) {
		super("Молоко");
		this.fat = fat;
	}

	public void consume() {
		System.out.println(this + " выпито");
	}
	
	public String toString() {
		return super.toString() + " жирности " + fat;
	}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Milk)) return false;
			return fat.equals(((Milk)arg0).fat);
		} else
		return false;
	}

	public int calculateCalories() {
		int calories = 0;
		
		if (fat.equals("1.5%")) {
			calories += 110;
		} else if (fat.equals("2.5%")) {
			calories += 135;
		} else if (fat.equals("5%")) {
			calories += 188;
		}
		
		return calories;
	}
}
