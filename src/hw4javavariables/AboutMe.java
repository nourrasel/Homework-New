package hw4javavariables;

public class AboutMe {
	// declared variables
	public String name;
	public byte age;
	public short myHouseRent;
	public int myYearlyIncome;
	public long mySavingsAmount;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean permanentResidency;

	// This is constructor declared
	public AboutMe() {
		System.out.println("This is all about us:");

	}

	// method initialized
	public void aboutMe() {

		System.out.println("\nMy name is - " + name + "\nMy age is - " + age + "\nMy rent is - $" + myHouseRent
				+ "\nMy yearly income is - $" + myYearlyIncome + "\nMy savings amount - $" + mySavingsAmount
				+ "\nMy height - " + myHeight + "\nMy grade is - " + myGrade + "\nMy sex - " + sex
				+ "\nMy permanent residency status is - " + permanentResidency);
	}

}
