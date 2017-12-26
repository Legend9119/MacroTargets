import java.util.Scanner;

/**
 * Created by Nick on 26/12/2017.
 */
public class MainClass {
	public static void main(String[] args){
		//4 calories in 1 gram of protein
		//4 calories in 1 gram of carbohydrates
		//9 calories in 1 gram of fat

		Scanner reader = new Scanner(System.in);

		System.out.println("What is your daily calorie goal?\n  (TDEE + 500 calories)");
		int calorieGoal = reader.nextInt();

		System.out.println("\nWhat is your body weight in kilograms?");
		double bodyWeightInKilos = reader.nextDouble();
		double bodyWeightInPounds = bodyWeightInKilos * 2.20462262;

		System.out.println("\nHow many grams of protein per pound of body weight would you like to consume?");
		System.out.println("  Don't worry that the weight is in pounds. The numbers will be manipulated so that it works correctly.");
		System.out.println("  VitruvianPhysique recommends a value of 0.8-1g of protein per pound of body weight.");
		double gramsOfProtein = reader.nextDouble();

		System.out.println("\nWhat percentage of fat food sources would you like your food to be?");
		System.out.println("  VitrivianPhysique recommends a value between 20-30%, inclusive.");
		int fatPercentage = reader.nextInt();

		//Calculations to find out how much of each macronutrient this person needs:
		double numberOfProteinGrams = gramsOfProtein * bodyWeightInPounds;
		double proteinCalories = numberOfProteinGrams * 4;

		double fatCalories = calorieGoal * ((double) fatPercentage / 100);
		double numberOfFatGrams = fatCalories / 9;

		double carbohydrateCalories = calorieGoal - (proteinCalories + fatCalories);
		double numberOfCarbohydrateGrams = carbohydrateCalories / 4;

		reader.close();

		System.out.println("\nWithin your calorie goal of " + calorieGoal + ", you need to consume:");
		System.out.println("  " + (int) numberOfProteinGrams + "g of protein\t\t\t(" + (int) proteinCalories + " calories)");
		System.out.println("  " + (int) numberOfFatGrams + "g of fat\t\t\t\t(" + (int) fatCalories + " calories)");
		System.out.println("  " + (int) numberOfCarbohydrateGrams + "g of carbohydrates\t\t(" + (int) carbohydrateCalories + " calories)");
	}
}
