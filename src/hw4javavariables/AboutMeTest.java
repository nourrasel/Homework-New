package hw4javavariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// constructor initialized
		AboutMe rasel = new AboutMe();

		//variable instantiate
		rasel.name = "rasel";
		rasel.age = 31;
		rasel.myHouseRent = 2000;
		rasel.myYearlyIncome = 120000;
		rasel.mySavingsAmount = 30000000;
		rasel.myHeight = 5.11f;
		rasel.myGrade = 3.95;
		rasel.sex = 'M';
		rasel.permanentResidency = true;

		// method implemented
		rasel.aboutMe();
		//variable initialized
		AboutMe Alex = new AboutMe();
		Alex.name = "Alex";
		Alex.age = 35;
		Alex.myHouseRent = 1000;
		Alex.myYearlyIncome = 140000;
		Alex.mySavingsAmount = 20000000;
		Alex.myHeight = 5.9f;
		Alex.myGrade = 3.85;
		Alex.sex = 'M';
		Alex.permanentResidency = true;
		// method implemented
		Alex.aboutMe();
	}

}
//