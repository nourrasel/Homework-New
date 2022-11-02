package hw5Q2Constructor;

public class Computer {

//variable declared

	public String name;
	public String operatingSystem;
	public String model;
	public int price;
	public char grade;
	public boolean madeInUsa;

//default constructor
	public Computer() {
		System.out.println("This is from default Constructor of Computer class");
	}

	public Computer(String name, String model, String operatingSystem) {
		this.name = name;
		this.operatingSystem = operatingSystem;
		this.model = model;
		System.out.println("My Brand:" + name + ", Model:" + model + ", Operating system: " + operatingSystem);
	}

	public Computer(int price, char grade, boolean madeInUsa) {
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
		System.out.println("Price: $" + price + ", Grade: " + grade + "and Made in USA? Ans: " + madeInUsa);
	}

}
