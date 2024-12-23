package bsu.rfe.java.group6.lab1.Pavlova.varB3;

public class Apple extends Food {
	private String size;
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}

	public Apple(String size) {
		super("Яблоко");
		this.size = size;
	}
	
	public void consume() {
		System.out.println(this + " съедено");
	}
	
	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
	}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Apple)) return false;
			return size.equals(((Apple)arg0).size);
		} else	return false;
	}
	
	public int calculateCalories() {
		int calories = 0;
		
		if (size.equals("Малое")) {
			calories += 78;
		} else if (size.equals("Среднее")) {
			calories += 95;
		} else if (size.equals("Большое")) {
			calories += 116;
		}
		
		return calories;
	}
}
