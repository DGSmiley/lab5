import java.util.Random;
import java.util.Scanner;

public class diceRoll {
		
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino! ");
		
		System.out.print("Enter number of sides for dice: ");
		int dice = input.nextInt();
		
		
		
		Random roll = new Random();
		System.out.println("Roll: ");
		for (int i = 1; i <= 2; i++){
		System.out.println(roll.ints(1, dice).findFirst().getAsInt() );
		}
	
			
		}
	}

	