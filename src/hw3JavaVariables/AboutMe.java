package hw3JavaVariables;

public class AboutMe {
	public String yourNameString; // variable declared

// variables initialized
	public String name = "Nour Mohammad Rasel";
	public byte age = 31;
	public short myHouseRent = 2000;
	public int myYearlyIncome = 100000;
	public long mySavingsAmount = 20000000l;
	public float myHeight = 5.11f;
	public double myGrade = 3.95;
	public char sex = 'M';
	public boolean permanentResidency = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.myHouseRent);
		System.out.println(aboutMe.myYearlyIncome);
		System.out.println(aboutMe.mySavingsAmount);
		System.out.println(aboutMe.myHeight);
		System.out.println(aboutMe.myGrade);
		System.out.println(aboutMe.sex);
		System.out.println(aboutMe.permanentResidency);

		System.out.println("\nMy name = " + aboutMe.name + "\nMy age = " + aboutMe.age + "\nMy height = "
				+ aboutMe.myHeight + "\nMy grade =" + aboutMe.myGrade);
		System.out.println("\"EnthralliT\"");

	}

}
