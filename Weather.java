package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions on what to wear, based on the weather (temperature & sun condition)
		int temperature = 60;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("It's pleasant, I suggest wearing shorts and a t-shirt.");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a bit chilly, perhaps you should wear a long-sleeve shirt and pants.");
			System.out.println("You're going to want a hat to keep the sun out of your eyes.");
		}
		else if ((temperature > 50 ) || (sunCondition == "Overcast")) {
			System.out.println("It's a cool day, wear warm clothes.");
		}
		else {
			System.out.println("It's pretty cold out, bundle up!");
		}
		System.out.println("The program is ending.");
	}
}
