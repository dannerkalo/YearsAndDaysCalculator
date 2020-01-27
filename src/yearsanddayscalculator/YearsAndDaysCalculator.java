package yearsanddayscalculator;

public class YearsAndDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Playing with method overload

		// test
		// printYearsAndDays(525600); // minutes 1yr 0d
		// printYearsAndDays(1051200); // minutes 2y and 0d
		printYearsAndDays(561600); // minutes 1y and 25 d

	}

	// write your code here

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		}

		long years = (minutes / 365) / 24 / 60;
		long days = (minutes % 365) / 9;

		System.out.println(minutes + "min");
		System.out.println(years + "y");
		System.out.println(days + "d");
	}

}
