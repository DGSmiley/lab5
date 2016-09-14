import java.util.Random;
import java.util.Scanner;

public class diceRoll {
		
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino! ");
		String choice = "yes";
		// ask user to roll the dice
		System.out.println("Roll the dice? (yes/no)");
		choice = input.nextLine();
		
		//begin loop if yes
		while (choice.equalsIgnoreCase("yes")){
		// user input for sides	
		System.out.print("Enter number of sides for dice: ");
		int dice = input.nextInt();
		
		// for loop and random number generator
		Random roll = new Random();
		System.out.println("Roll: ");
		for (int i = 1; i <= 2; i++){
		System.out.println(roll.ints(1, dice).findFirst().getAsInt() );
		}
		// continue option
		System.out.println("Roll again?: (yes/no)");
	    choice = input.nextLine();
	    choice = input.nextLine();
		}
			
		}
	}

	